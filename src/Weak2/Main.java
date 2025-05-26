/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Weak2;

/**
 *
 * @author kpham
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int getuserchoice;
        Scanner sc = new Scanner(System.in);
        Menuallquiz menu = new Menuallquiz();
        do {

            while (true) {
                try {
                    menu.Menu();
                    getuserchoice = sc.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Choice must a number(choice run to 1-4)");
                    sc.nextLine();
                }
            }

            switch (getuserchoice) {
                case 1:
                    quiz1 q1 = new quiz1();
                    int x;
                    do {
                        while (true) {
                            try {
                                menu.showmenu1();
                                x = sc.nextInt();
                                break;
                            } catch (Exception e) {
                                System.out.println("Choice must a number(choice run to 1-3)!!!");
                                sc.nextLine();
                            }
                        }

                        switch (x) {
                            case 1:
                                q1.calculate();
                                break;
                            case 2:
                                q1.calculateBMI();
                                break;
                            case 3:
                                System.out.println("Exit!!");
                                break;
                            default:
                                System.out.println("Please re-enter your choice(choice run to 1-3)!!");
                                break;
                        }
                    } while (x != 3);
                    break;
                case 2:
                    quiz2 q2 = new quiz2();
                    q2.process();
                    break;
                case 3:
                    quiz3 q3 = new quiz3();
                    q3.process();
                    break;

          case 4:
                    System.out.println("Exitting program...!!!");
                    break;
                default:
                    System.out.println("Re-enter your choice(choice run to 1-3)!!");
                    break;
            }
        }while (getuserchoice != 4);
    }
}
