package Weak4;

import java.util.Calendar;
import java.util.Scanner;

public class Student2 extends Person2 {
    private int yearOfAdmission;
    private int entranceEnglishScore;

    public Student2() {
        super();
        yearOfAdmission = 0;
        entranceEnglishScore = 0;
    }

    @Override
    public void inputAll(Scanner sc) {
        super.inputAll(sc);
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        while (true) {
            System.out.print("Year of admission: ");
            try {
                yearOfAdmission = Integer.parseInt(sc.nextLine());
                if (yearOfAdmission < yearOfBirth || yearOfAdmission > currentYear) {
                    System.out.println("Data input is invalid");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Data input is invalid");
            }
        }

        while (true) {
            System.out.print("Entrance English score: ");
            try {
                entranceEnglishScore = Integer.parseInt(sc.nextLine());
                if (entranceEnglishScore < 0 || entranceEnglishScore > 100) {
                    System.out.println("Data input is invalid");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Data input is invalid");
            }
        }
    }

    public int getYearOfAdmission() {
        return yearOfAdmission;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + yearOfAdmission + " - " + entranceEnglishScore;
    }
}