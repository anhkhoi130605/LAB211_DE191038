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
public class Teacher2 extends Person2{
    private int yearInProfession;
    private String contractType;
    private double salaryCoefficient;

    public Teacher2() {
        super();
        yearInProfession = 0;
        contractType = "";
        salaryCoefficient = 0.0;
    }

    @Override
    public void inputAll(Scanner sc) {
        super.inputAll(sc);
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - yearOfBirth;

        while (true) {
            try {
                System.out.print("Year in the profession: ");
                yearInProfession = Integer.parseInt(sc.nextLine());
                if (yearInProfession < 0 || yearInProfession >= age) {
                    System.out.println("Data input is invalid");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Data input is invalid");
            }
        }

        while (true) {
            System.out.print("Contract type: ");
            contractType = sc.nextLine();
            if (!contractType.equals("Long") && !contractType.equals("Short")) {
                System.out.println("Data input is invalid");
                continue;
            }
            break;
        }

        while (true) {
            try {
                System.out.print("Salary coefficient: ");
                salaryCoefficient = Double.parseDouble(sc.nextLine());
                if (salaryCoefficient < 0) {
                    System.out.println("Data input is invalid");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Data input is invalid");
            }
        }
    }

    @Override
    public String toString() {
        return super.toString() + " - " + yearInProfession + " - " + contractType + " - " + salaryCoefficient;
    }

    public int getYearInProfession() {
        return yearInProfession;
    }
}
