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
public class OnlineCourse extends Course{
    
    private String platForm;
    private String instructors;
    private String note;
    private static ArrayList<OnlineCourse> arronline = new ArrayList<>();
    
    public OnlineCourse() {
        this.platForm = "";
        this.instructors = "";
        this.note = "";
    }
    
    public OnlineCourse(String platForm, String instructors, String note, String courseID, String courseName, int credit) {
        super(courseID, courseName, credit);
        this.platForm = platForm;
        this.instructors = instructors;
        this.note = note;
    }
    @Override
    public void Inputall(){
        Scanner sc = new Scanner(System.in);
        super.Inputall();
        
        while (true) {   
            System.out.println("En-ter plat form:");
            platForm = sc.nextLine();
            if (platForm.isEmpty()) {
                System.out.println("Invalid data!!");
            }
            else break;
        }
        while (true) {   
            System.out.println("En-ter instructors:");
            instructors = sc.nextLine();
            if (instructors.isEmpty()) {
                System.out.println("Invalid data!!");
            }
            else break;
        }
        while (true) {   
            System.out.println("En-ter note:");
            note = sc.nextLine();
            if (note.isEmpty()) {
                System.out.println("Invalid data!!");
            }
            else break;
        }
    }
    
    public void addonlinecourse(){
        OnlineCourse oc = new OnlineCourse();
        oc.Inputall();
        arronline.add(oc);
    }
    public void display() {
        super.display();
        System.out.println("-" + platForm + "-" + instructors + "-" + note);
    }

    public static void displayAll() {
        if (arronline.isEmpty()) {
            System.out.println("No courses available.");
        } else {
            for (Course c : arronline) {
                c.display();
            }
        }
    }
    public String getPlatForm() {
        return platForm;
    }

    public void setPlatForm(String platForm) {
        this.platForm = platForm;
    }

    public String getInstructors() {
        return instructors;
    }

    public void setInstructors(String instructors) {
        this.instructors = instructors;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public ArrayList<OnlineCourse> getArronline() {
        return arronline;
    }

    public void setArronline(ArrayList<OnlineCourse> arronline) {
        this.arronline = new ArrayList<>();
    }
    
}
