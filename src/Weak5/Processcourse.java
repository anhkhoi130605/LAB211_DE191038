/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Weak5;

/**
 *
 * @author kpham
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Processcourse {

    private static ArrayList<Course> managementcourse = new ArrayList<>();

    Course c1 = new Course();
    OnlineCourse olc = new OnlineCourse();
    OfflineCourse ofc = new OfflineCourse();

    public void addOnlinenOfflinecourse() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Online (O) or Offline (F): ");
        String choice = sc.nextLine().trim().toUpperCase();

        if (choice.equals("O")) {
            OnlineCourse onc = new OnlineCourse();
            onc.Inputall();
            managementcourse.add(onc);
        } else if (choice.equals("F")) {
            OfflineCourse ofc = new OfflineCourse();
            ofc.Inputall();
            managementcourse.add(ofc);
        } else {
            System.out.println("Data input is invalid");
        }
    }

    public void UpdateCourse(String course) {
        for (Course c : managementcourse) {
            if (course.equals(c.getCourseID())) {
                if (c instanceof OnlineCourse) {
                    ((OnlineCourse) c).Inputall();
                } else if (c instanceof OfflineCourse) {
                    ((OfflineCourse) c).Inputall();
                }
                System.out.println("Updating general course...");
                c.Inputall();
            }
            break;
        }
    }

    public void removecourse(String course) {
        for (Course c : managementcourse) {
            if (course.equals(c.getCourseID())) {
                managementcourse.remove(c);
            }
            break;
        }
    }

    public void displayallcourse() {

        for (Course course : managementcourse) {
            course.display();
        }
    }

    public void search(String name) {
        boolean found = false;
        for (Course course : managementcourse) {
            if (course.getCourseName().equalsIgnoreCase(name)) {
                System.out.println("*** Search Result ***");
                course.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No data found.");
        }
    }
}
