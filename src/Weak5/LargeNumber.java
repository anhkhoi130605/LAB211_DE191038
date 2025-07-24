/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Weak5;

/**
 *
 * @author kpham
 */
import java.util.Scanner;
public class LargeNumber {
    private String mybitInterger;

    public LargeNumber() {
    }

    public LargeNumber(String mybitInterger) {
        this.mybitInterger = mybitInterger;
    }

    public String getMybitInterger() {
        return mybitInterger;
    }

    public void setMybitInterger(String mybitInterger) {
        this.mybitInterger = mybitInterger;
    }
    
   public void Plusbitinterger() {
    Scanner sc = new Scanner(System.in);
    System.out.println("In-put first number: ");
    mybitInterger = sc.nextLine().trim();
    System.out.println("In-put second number: ");
    this.mybitInterger = sc.nextLine().trim();

    
    int max = Math.max(mybitInterger.length(), this.mybitInterger.length());
    while (mybitInterger.length() < max)
        mybitInterger = "0" + mybitInterger;
    while (this.mybitInterger.length() < max)
        this.mybitInterger = "0" + this.mybitInterger;

    int a, b, r;
    int carry = 0;
    StringBuilder result = new StringBuilder();

    
    for (int i = max - 1; i >= 0; i--) {
        a = Character.getNumericValue(mybitInterger.charAt(i));
        b = Character.getNumericValue(this.mybitInterger.charAt(i));

        r = a + b + carry;
        carry = r / 10;
        result.insert(0, r % 10);

        
        mybitInterger = mybitInterger.substring(0, mybitInterger.length() - 1);
        this.mybitInterger = this.mybitInterger.substring(0, this.mybitInterger.length() - 1);
    }

   
    if (carry > 0) {
        result.insert(0, carry);
    }

    System.out.println("Result: " + result.toString());
}

}
