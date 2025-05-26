/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Weak2;

/**
 *
 * @author kpham
 */
import java.util.*;

public class quiz2 {

    Scanner sc = new Scanner(System.in);
    Menuallquiz mn2 = new Menuallquiz();
    Trianglequiz2 t2 = new Trianglequiz2();
    Circlequiz2 c2 = new Circlequiz2();
    Rectanglequiz2 r2 = new Rectanglequiz2();
    int getuserchoice;

    public void process() {
        do {
            mn2.showmenu2();
            while (true) {
                try {
                    System.out.println("En-ter your choice: ");
                    getuserchoice = sc.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Re-enter your choice!!");
                    sc.nextLine();
                }
            }
            switch (getuserchoice) {
                case 1:
                    while (true) {
                        try {
                            System.out.println("En-ter width: ");
                            r2.setWidth(sc.nextDouble());
                            break;
                        } catch (Exception e) {
                            System.out.println("Please re-enter Width!!");
                            sc.nextLine();
                        }
                    }
                    while (true) {
                        try {
                            System.out.println("En-ter length: ");
                            r2.setLength(sc.nextDouble());
                            System.out.println(r2.toString());
                            break;
                        } catch (Exception e) {
                            System.out.println("Please re-enter Length!!");
                            sc.nextLine();
                        }
                    }

                    break;
                case 2:
                    while (true) {
                        try {
                            System.out.println("En-ter Radius: ");
                            c2.setRadius(sc.nextDouble());
                            System.out.println(c2.toString());
                            break;
                        } catch (Exception e) {
                            System.out.println("Please re-enter radius");
                            sc.nextLine();
                        }
                    }

                    break;
                case 3:
                    while (true) {  
                        try {
                            System.out.println("En-ter Side A: ");
                            t2.setSideA(sc.nextDouble());
                            break;
                        } catch (Exception e) {
                            System.out.println("Please re-enter Side A!!!");
                            sc.nextLine();
                        }
                       
                    }
                    
                    while (true) {  
                        try {
                            System.out.println("En-ter Side B: ");
                            t2.setSideB(sc.nextDouble());
                            break;
                        } catch (Exception e) {
                            System.out.println("Please re-enter Side B!!!");
                            sc.nextLine();
                        }
                      
                    }
                    
                    while (true) {  
                        try {
                            System.out.println("En-ter Side C: ");
                            t2.setSideC(sc.nextDouble());
                            System.out.println(t2.toString());
                            break;
                        } catch (Exception e) {
                            System.out.println("Please re-enter Side C!!!");
                            sc.nextLine();
                        }
                        
                    }
                    break;
                case 4:
                    System.out.println("Exit!!");
                    break;
            }
        } while (getuserchoice != 4);
    }
}
