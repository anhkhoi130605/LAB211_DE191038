/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Weak4;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author kpham
 */
public class Person2 {

    protected String id;
    protected String fullname;
    protected String phone;
    protected int yearOfBirth;
    protected String major;

    public Person2() {
        id = "";
        fullname = "";
        phone = "";
        yearOfBirth = 0;
        major = "";
    }

    public void inputAll(Scanner sc) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        while (true) {
            System.out.print("ID: ");
            id = sc.nextLine();
            if (!id.matches("\\d{6}")) {
                System.out.println("Data input is invalid");
                continue;
            }
            break;
        }

        while (true) {
            System.out.print("Fullname: ");
            fullname = sc.nextLine();
            if (!fullname.matches("[a-zA-Z\\s]+")) {
                System.out.println("Data input is invalid");
                continue;
            }
            break;
        }

        while (true) {
            System.out.print("Phone number: ");
            phone = sc.nextLine();
            if (!phone.matches("\\d{12}")) {
                System.out.println("Data input is invalid");
                continue;
            }
            break;
        }

        while (true) {
            System.out.print("Year of birth: ");
            try {
                yearOfBirth = Integer.parseInt(sc.nextLine());
                if (yearOfBirth >= currentYear) {
                    System.out.println("Data input is invalid");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Data input is invalid");
            }
        }

        while (true) {
            System.out.print("Major: ");
            major = sc.nextLine();
            if (major.length() > 30) {
                System.out.println("Data input is invalid");
                continue;
            }
            break;
        }
    }

    public String toString() {
        return id + " - " + fullname + " - " + phone + " - " + yearOfBirth + " - " + major;
    }

    public String getFullname() {
        return fullname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}
