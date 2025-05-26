/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Weak2;

/**
 *
 * @author kpham
 */
public class Rectanglequiz2 extends Shapequiz2{
     private double width;
    private double length;

    public Rectanglequiz2() {
    }

    public Rectanglequiz2(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return 2*(getWidth() + getLength());
    }

    @Override
    public double getArea() {
        return getWidth() * getLength();
    }


    @Override
    public String toString() {
        return "Width: " + getWidth() + "\n"
                + "Length: " + getLength() + "\n"
                + "Area: " + getArea() + "\n"
                + "Perimeter: " + getPerimeter() + "\n";
    }

}
