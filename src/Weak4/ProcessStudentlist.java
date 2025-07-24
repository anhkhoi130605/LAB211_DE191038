/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Weak4;

/**
 *
 * @author kpham
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class ProcessStudentlist {

    private ArrayList<Students> studentlist;
    ArrayList<Students> studentlistforsort;
    public ProcessStudentlist() {
        this.studentlist = new ArrayList<>();
    }

    public ProcessStudentlist(ArrayList<Students> studentlist) {
        this.studentlist = studentlist;
    }

    public ArrayList<Students> getStudentlist() {
        return studentlist;
    }

    public void setStudentlist(ArrayList<Students> studentlist) {
        this.studentlist = studentlist;
    }

    public Students getSt() {
        return st;
    }

    public void setSt(Students st) {
        this.st = st;
    }

    Students st = new Students();

    public int create(Students createstudent) {
        studentlist.add(createstudent);
        if (studentlist.size() < 3) {
            return 0;
        } else {
            return 1;
        }
    }

    public void FindAndSort(String name) {
        studentlistforsort = new ArrayList<>();
        for (Students st : getStudentlist()) {
            if (st.getFullname().toLowerCase().contains(name)) {
                studentlistforsort.add(st);
            }
        }
        Collections.sort(studentlistforsort);
    }

    public void Sort() {
        Collections.sort(studentlist);
    }

    public Students UpdateAndDelte(Students updatestu, char Choice) {

        for (Students st : studentlist) {
            if (st.getStudentID().equals(updatestu.getStudentID())) {
                if (Choice == 'U') {
                    //
                    st.setFullname(updatestu.getFullname());
                   st.setMajor(updatestu.getMajor());
                    st.setSemester(updatestu.getSemester());
                } else if (Choice == 'D') {
                    studentlist.remove(st);
                    
                }
            }
        }
        return null;
    }
    String fname = "D:\\NetBeansProjects\\LAB211\\MyLab211\\StudentforWeak4.txt";

    public boolean loadFromFile(String fname) {
        try (BufferedReader br = new BufferedReader(new FileReader(fname))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue;
                }
                String[] parts = line.split(",");

                try {
                    String studentID = parts[0].trim();
                    String fullname = parts[1].trim();
                    int semester = Integer.parseInt(parts[2].trim());
                    String major = parts[3].trim();
                    Students st = new Students(studentID, fullname, semester, major);
                    studentlist.add(st);
                } catch (NumberFormatException e) {
                    System.out.println("Error parsing price in line: " + line);
                }
            }
            return true;
        } catch (Exception e) {
            System.out.println("Error loading file: " + fname);
            e.printStackTrace();
            return false;
        }
    }
}
