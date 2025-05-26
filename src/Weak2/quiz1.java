/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Weak2;

/**
 *
 * @author kpham
 */
import java.util.Scanner;

public class quiz1 {

    private double a, b;
    private char operator;

    public quiz1() {
    }

    public quiz1(double a, double b, char operator) {
        this.a = a;
        this.b = b;
        this.operator = operator;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    Scanner sc = new Scanner(System.in);

    public void calculate() {

        int choice;

        while (true) {
            try {
                System.out.println("En-ter value a:");
                setA(sc.nextDouble());
                break;
            } catch (Exception e) {
                System.out.println("Plese en-ter value a !!!");
                sc.nextLine();
            }
        }

        while (true) {
            try {
                System.out.println("En-ter value b");
                setB(sc.nextDouble());
                break;
            } catch (Exception e) {
                System.out.println("Plese en-ter value b !!!");
                sc.nextLine();
            }
        }

        do {

            while (true) {
                try {
                    System.out.println("1.+");
                    System.out.println("2.-");
                    System.out.println("3.*");
                    System.out.println("4./");
                    System.out.println("5.exit");
                    System.out.println("please enter number of operation(1-5): ");
                    choice = sc.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Please choose number of operation!!(Option of operation is a number)");
                    sc.nextLine();
                }
            }

            char x;
            switch (choice) {
                case 1:
                    while (true) {
                        System.out.println("Enter '=' to calculate");
                        String input = sc.nextLine();
                        if (input.equals("=")) {
                            System.out.println("a + b = " + (a + b));
                            break;
                        } else {
                            System.out.println("Please enter '=' only!");
                        }
                    }

                    break;
                case 2:
                    while (true) {
                        System.out.println("Enter '=' to calculate");
                        String input = sc.nextLine();
                        if (input.equals("=")) {
                            System.out.println("a - b = " + (a - b));
                            break;
                        } else {
                            System.out.println("Please enter '=' only!");
                        }
                    }

                    break;
                case 3:
                    while (true) {
                        try {
                            System.out.println("Enter '=' to calculate");
                            String input = sc.nextLine();
                            if (input.equals("=")) {
                                System.out.println("a * b = " + (a * b));
                                break;
                            }
                        } catch (Exception e) {
                            System.out.println("Please enter '=' only!");
                        }
                    }

                    break;
                case 4:
                    while (true) {
                        System.out.println("Enter '=' to calculate");
                        String input = sc.nextLine();
                        if (input.equals("=")) {
                            System.out.println("a / b = " + (a / b));
                            break;
                        } else {
                            System.out.println("Please enter '=' only!");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exit!!");
                    break;
            }
        } while (choice != 5);

    }

    public void calculateBMI() {
        double w;
        double h;
        double BMI;
        while (true) {
            try {
                System.out.println("Plese en-ter your body weight(kg): ");
                w = sc.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Please re-enter your body weight!!");
                sc.nextLine();
            }
        }
        while (true) {
            try {
                System.out.println("Please en-ter your height(M): ");
                h = sc.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("Please re-enter your height!!");
                sc.nextLine();
            }
        }
        BMI = w / Math.pow(h, 2);
        System.out.println("Your BMI is: " + BMI);
        if (BMI < 19) {
            System.out.println("Under-standard");
        } else if (BMI >= 19 && BMI <= 25) {
            System.out.println("Standard");
        } else if (BMI >= 25 && BMI <= 30) {
            System.out.println("Overweight");
        } else if (BMI >= 30 && BMI <= 40) {
            System.out.println("Overweight");
        } else {
            System.out.println("Very fat");
        }
    }
}
