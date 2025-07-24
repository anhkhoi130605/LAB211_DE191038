/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Weak5;

import java.util.Scanner;

/**
 *
 * @author kpham
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu mn = new Menu();
        int choice = 0;
        while (true) {
            try {
                mn.mainmenu();
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid choice!! choice from(1-3)");
                sc.nextLine();
            }
            switch (choice) {
                case 1:
                    ManagementCourse();
                    break;
                case 2:
                       ManagementHotel();
                    break;
                case 3:
                    LargeNumber ln = new LargeNumber();
                    ln.Plusbitinterger();
                    break;
                default:
                    throw new AssertionError();
            }

        }
    }

    public static void ManagementCourse() {
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);
        Processcourse p = new Processcourse();
        while (true) {
            menu.showmenu1();
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1 ->
                    p.addOnlinenOfflinecourse();
                case 2 -> {
                    System.out.print("Course ID: ");
                    p.UpdateCourse(sc.nextLine());
                }
                case 3 -> {
                    System.out.print("Course ID: ");
                    p.removecourse(sc.nextLine());
                }
                case 4 ->
                    p.displayallcourse();
                case 5 -> {
                    System.out.print("Course name: ");
                    p.search(sc.nextLine());
                }
                case 6 -> {
                    System.out.println("BYE AND SEE YOU NEXT TIME");
                    return;
                }
                default ->
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void ManagementHotel() {
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);
        ProcessFlightInFormation pfifmt = new ProcessFlightInFormation();
        while (true) {
            System.out.println("\n*** Reservation Management ***");
            System.out.println("1. Create new reservation");
            System.out.println("2. Update reservation");
            System.out.println("3. Delete reservation");
            System.out.println("4. Print Flight Information");
            System.out.println("5. Print all");
            System.out.println("6. Exit");
            System.out.print("You choose: ");

            String choice = sc.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.print("*** Create new reservation ***\nHow many reservations? ");
                    try {
                        int n = Integer.parseInt(sc.nextLine().trim());
                        pfifmt.inputNumberofReservation(n);
                    } catch (Exception e) {
                        System.out.println("Invalid number.");
                    }
                    break;
                case "2":
                    System.out.println("*** Update reservation ***");
                    pfifmt.updateReservation();
                    break;
                case "3":
                    System.out.println("*** Delete reservation ***");
                    pfifmt.deleteReservation();
                    break;
                case "4":
                    System.out.println("*** Flight Information ***");
                    pfifmt.printPickUpReservations();
                    break;
                case "5":
                    System.out.println("*** Reservation Information ***");
                    pfifmt.printAllReservations();
                    break;
                case "6":
                    System.out.println("BYE AND SEE YOU NEXT TIME");
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }
}
