/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Weak4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author kpham
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Teacher2> teachers = new ArrayList<>();
        List<Student2> students = new ArrayList<>();

        while (true) {
            System.out.println("*** Information Management ***");
            System.out.println("1. Teacher\n2. Student\n3. Person\n4. Exit");
            System.out.print("You choose: ");
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    while (true) {
                        System.out.println("*** Teacher Management ***\n1. Input\n2. Print\n3. Exit");
                        System.out.print("You choose: ");
                        String ch = sc.nextLine();
                        if (ch.equals("1")) {
                            Teacher2 t = new Teacher2();
                            t.inputAll(sc);
                            teachers.add(t);
                        } else if (ch.equals("2")) {
                            teachers.sort((a, b) -> Integer.compare(b.getYearInProfession(), a.getYearInProfession()));
                            int i = 1;
                            for (Teacher2 t : teachers) {
                                System.out.println(i++ + " - " + t);
                            }
                        } else break;
                    }
                    break;
                case "2":
                    while (true) {
                        System.out.println("*** Student Management ***\n1. Input\n2. Print\n3. Exit");
                        System.out.print("You choose: ");
                        String ch = sc.nextLine();
                        if (ch.equals("1")) {
                            Student2 st = new Student2();
                            st.inputAll(sc);
                            students.add(st);
                        } else if (ch.equals("2")) {
                            students.sort(Comparator.comparingInt(Student2::getYearOfAdmission));
                            int i = 1;
                            for (Student2 s : students) {
                                System.out.println(i++ + " - " + s);
                            }
                        } else break;
                    }
                    break;
                case "3":
                    while (true) {
                        System.out.println("*** Person Management ***\n1. Search\n2. Print all\n3. Exit");
                        System.out.print("You choose: ");
                        String ch = sc.nextLine();
                        if (ch.equals("1")) {
                            System.out.print("Name: ");
                            String name = sc.nextLine();
                            List<Person2> result = new ArrayList<>();
                            for (Teacher2 t : teachers) if (t.getFullname().contains(name)) result.add(t);
                            for (Student2 s : students) if (s.getFullname().contains(name)) result.add(s);
                            result.sort((a, b) -> Integer.compare(a.getYearOfBirth(), b.getYearOfBirth()));
                            if (result.isEmpty()) {
                                System.out.println("Result: not found");
                            } else {
                                System.out.println("Result:");
                                int i = 1;
                                for (Person2 p : result) {
                                    System.out.println(i++ + " - " + p);
                                }
                            }
                        } else if (ch.equals("2")) {
                            List<Person2> all = new ArrayList<>();
                            all.addAll(teachers);
                            all.addAll(students);
                            all.sort((a, b) -> Integer.compare(a.getYearOfBirth(), b.getYearOfBirth()));
                            int i = 1;
                            for (Person2 p : all) {
                                System.out.println(i++ + " - " + p);
                            }
                        } else break;
                    }
                    break;
                case "4":
                    System.out.println("BYE AND SEE YOU NEXT TIME");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
