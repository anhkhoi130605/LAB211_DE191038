/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Weak2;

/**
 *
 * @author kpham
 */
public class Circlequiz2 extends Shapequiz2 {

    private double Radius;

    public Circlequiz2() {
    }

    public Circlequiz2(double Radius) {
        this.Radius = Radius;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double Radius) {
        this.Radius = Radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(Radius, 2);
    }

    @Override
    public String toString() {
        return "Radius: " + getRadius() + "\n"
                + "Area: " + getArea() + "\n"
                + "Perimeter: " + getPerimeter() + "\n";
    }

}
