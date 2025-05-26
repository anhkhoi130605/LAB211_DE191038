/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Weak2;

/**
 *
 * @author kpham
 */
public class Trianglequiz2 extends Shapequiz2 {

    private double sideA;
    private double sideB;
    private double sideC;

    public Trianglequiz2() {
    }

    public Trianglequiz2(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public double getPerimeter() {
        return getSideA() + getSideB() + getSideC();
    }

    @Override
    public double getArea() {
        double a = getSideA();
        double b = getSideB();
        double c = getSideC();
        double s = (a + b + c) / 2.0;

        if (a + b > c && a + c > b && b + c > a) {
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        } else {
            System.out.println("Invalid triangle sides!");
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Side A: " + getSideA() + "\n"
                + "Side B: " + getSideB() + "\n"
                + "Side C: " + getSideC() + "\n"
                + "Area: " + getArea() + "\n"
                + "Perimeter: " + getPerimeter() + "\n";
    }

}
