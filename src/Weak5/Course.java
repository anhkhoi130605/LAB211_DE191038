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
import java.util.ArrayList;

public class Course {

    protected String courseID;
    protected String courseName;
    protected int credit;

    public Course() {
        this.courseID = "";
        this.courseName = "";
        this.credit = 0;
    }

    public Course(String courseID, String courseName, int credit) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.credit = credit;
    }
    private static ArrayList<Course> arrayList = new ArrayList<>();

    public void Inputall() {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("En-ter course ID:");
            courseID = sc.nextLine();
            if (courseID.isEmpty() || checkcourseID(courseID) == true) {
                System.out.println("Invalid data!!");
            } else {
                break;
            }
        }

        while (true) {
            System.out.println("En-ter course name:");
            courseName = sc.nextLine();
            if (courseName.isEmpty()) {
                System.out.println("Invalid data!!");
            } else {
                break;
            }
        }
        while (true) {
            System.out.println("En-ter credit:");
            credit = sc.nextInt();
            sc.nextLine();
            if (credit <= 0) {
                System.out.println("Invalid data!!");
            } else {
                break;
            }
        }
        Course course = new Course(courseID, courseName, credit);
        arrayList.add(course);
        System.out.println("Course added successfully!");
    }

    public boolean checkcourseID(String id) {
        for (Course course : arrayList) {
            if (id.equals(course.courseID)) {
                return true;
            }
        }
        return false;
    }

    public void display() {
        System.out.println(courseID + " - " + courseName + " - " + credit);
    }

    public static void displayAll() {
        if (arrayList.isEmpty()) {
            System.out.println("No courses available.");
        } else {
            for (Course c : arrayList) {
                c.display();
            }
        }
    }

    public static ArrayList<Course> getArrayList() {
        return arrayList;
    }

    public static void setArrayList(ArrayList<Course> arrayList) {
        Course.arrayList = new ArrayList<>();
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
    
}
