/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Weak4;

/**
 *
 * @author kpham
 */
public class Students implements Comparable<Students>{
    private String studentID;
    private String Fullname;
    private int semester;
    private String major;
     
    public Students() {
    }

    public Students(String studentID, String Fullname, int semester, String major) {
        this.studentID = studentID;
        this.Fullname = Fullname;
        this.semester = semester;
        this.major = major;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    
    @Override
    public String toString() {
        return getFullname() + " | " + getMajor() + " | " + getSemester();
    }

    @Override
    public int compareTo(Students o) {
        return this.getFullname().compareTo(o.getFullname());
    }
            
}
