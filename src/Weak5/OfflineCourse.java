/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Weak5;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author kpham
 */
public class OfflineCourse extends Course {

    private LocalDate Begin;
    private LocalDate End;
    private String Campus;
    private static ArrayList<OfflineCourse> arroffline = new ArrayList<>();
    
    public OfflineCourse() {
        this.Begin = null;
        this.End = null;
        this.Campus = null;
    }

    public OfflineCourse(LocalDate Begin, LocalDate End, String Campus, String courseID, String courseName, int credit) {
        super(courseID, courseName, credit);
        this.Begin = Begin;
        this.End = End;
        this.Campus = Campus;
    }
    @Override
    public void Inputall(){
        super.Inputall();
        Scanner sc = new Scanner(System.in);
        while (true) {   
            System.out.println("En-ter day month year begin:");
            Begin = LocalDate.parse(convertDate(sc.nextLine()));
            if (Begin.isAfter(LocalDate.now())) {
                break;
            }
            else System.out.println("Invalid data!!");
        }
        while (true) {   
            System.out.println("En-ter day month year End:");
            End = LocalDate.parse(convertDate(sc.nextLine()));
            if (End.isAfter(Begin)) {
                break;
            }
            else System.out.println("Invalid data!!");
        }
        while (true) {   
            System.out.println("En-ter Campus:");
            Campus = sc.nextLine();
            if (Campus.isEmpty()) {
                System.out.println("Invalid data!!");
            }
            else break;
        }
    }

    public void addofllinecourse(){
        OfflineCourse ofc = new OfflineCourse();
        arroffline.add(ofc);
    }
    
    public String convertDate(String input){
        String[] part = input.split("/");
        return part[0] + "-" + part[1] + "-" + part[2];
    }
    
    public void display() {
        super.display();
        System.out.println("-" + "Begin" +Begin + "-" + "End" + End + "-" + "Credit" + credit);
    }

    public static void displayAll() {
        if (arroffline.isEmpty()) {
            System.out.println("No courses available.");
        } else {
            for (Course c : arroffline) {
                c.display();
            }
        }
    }
    public LocalDate getBegin() {
        return Begin;
    }

    public void setBegin(LocalDate Begin) {
        this.Begin = Begin;
    }

    public LocalDate getEnd() {
        return End;
    }

    public void setEnd(LocalDate End) {
        this.End = End;
    }

    public String getCampus() {
        return Campus;
    }

    public void setCampus(String Campus) {
        this.Campus = Campus;
    }

}
