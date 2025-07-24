/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Weak5;

/**
 *
 * @author kpham
 */
public class Menu {

    public void mainmenu() {
        System.out.println("*****Homework Weak5****");
        System.out.println("1. Management Course");
        System.out.println("2. Management room reservation");
        System.out.println("3. Large Number");
        System.out.println("Please EN-TER your choice: ");
    }

    public void showmenu1() {
        System.out.println("\n*** Course Management ***");
        System.out.println("1. Add online course/ offline course");
        System.out.println("2. Update course");
        System.out.println("3. Delete course");
        System.out.println("4. Print all courses");
        System.out.println("5. Search course");
        System.out.println("6. Exit");
        System.out.print("You choose: ");
    }

    public void showmenu2() {
        System.out.println("\n*** Reservation Management ***");
        System.out.println("1. Create new reservation");
        System.out.println("2. Update reservation");
        System.out.println("3. Delete reservation");
        System.out.println("4. Print Flight Information");
        System.out.println("5. Print all");
        System.out.println("6. Exit");
        System.out.print("You choose: ");
    }
}
