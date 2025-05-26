/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Weak2;

/**
 *
 * @author kpham
 */
import java.util.*;

public class quiz3 {

    private int row;
    private int colum;
    private int[][] data;

    public quiz3() {
    }

    public quiz3(int row, int colum, int[][] data) {
        this.row = row;
        this.colum = colum;
        this.data = data;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColum() {
        return colum;
    }

    public void setColum(int colum) {
        this.colum = colum;
    }

    public int getData(int row, int colum) {
        return data[row][colum];
    }

    public void setData(int row, int col, int value) {
        this.data[row][col] = value;
    }

    Scanner sc = new Scanner(System.in);

    public void Inputvalue() {
        for (int i = 0; i < getRow(); i++) {
            for (int j = 0; j < getColum(); j++) {
                while (true) {
                    try {
                        System.out.printf("Enter value for [%d][%d]: ", i, j);
                        int value = sc.nextInt();
                        setData(i, j, value);
                        break;
                    } catch (Exception e) {
                        System.out.println("Values of matrix must be a number.");
                        sc.nextLine();
                    }
                }
            }
        }
    }

    public quiz3 additionMatrix(quiz3 matrix2) {
        quiz3 result = new quiz3(row, colum, data);
        if (this.row != matrix2.getColum() || this.colum != matrix2.getColum()) {
            System.out.println("Cannot add: Matrices must have same dimensions.");
            return null;
        } else {
            for (int i = 0; i < getRow(); i++) {
                for (int j = 0; j < getColum(); j++) {
                    int sum = this.getData(i, j) + matrix2.getData(i, j);
                    result.setData(i, j, sum);
                }
            }
        }
        return result;
    }

    public quiz3 subtractionMatrix(quiz3 matrix2) {
        quiz3 result1 = new quiz3(row, colum, data);
        if (this.row != matrix2.getColum() || this.colum != matrix2.getColum()) {
            System.out.println("Cannot add: Matrices must have same dimensions.");
            return null;
        } else {
            for (int i = 0; i < getRow(); i++) {
                for (int j = 0; j < getColum(); j++) {
                    int sum = this.getData(i, j) - matrix2.getData(i, j);
                    result1.setData(i, j, sum);
                }
            }
        }
        return result1;
    }

    public quiz3 multiplicationMatrix(quiz3 matrix2) {
        quiz3 result2 = new quiz3(row, colum, data);
        int mul = 0;
        if (this.getColum() != matrix2.getRow()) {
            System.out.println("Cannot multiplication because column A different row B.");
        } else {
            for (int i = 0; i < getRow(); i++) {
                for (int j = 0; j < getColum(); j++) {
                    for (int k = 1; k <= j; k++) {
                        mul += this.getData(i, k) * matrix2.getData(k, j);
                        result2.setData(i, j, mul);
                    }

                }
            }
        }
        return result2;
    }

    public void displayMatrix() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.print(getData(i, j) + "\t");
            }
            System.out.println();
        }
    }

    public void process() {
        Menuallquiz mn3 = new Menuallquiz();
        quiz3 matrix1 = new quiz3();
        quiz3 matrix2 = new quiz3();
        quiz3 matrixresult = new quiz3();
        int choice;
        do {
            mn3.showmenu3();
            while (true) {
                try {
                    System.out.println("Enter your choice: ");
                    choice = sc.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("please re-enter your choice(choice run to 1-6)!!!");
                }
            }
            switch (choice) {
                case 1:
                    int r1;
                    int c1;

                    while (true) {
                        try {
                            System.out.println("Input matrix 1");
                            System.out.println("Enter Row: ");
                            r1 = sc.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println("Row is a number,please re-enter!!");
                            sc.nextLine();
                        }
                    }

                    while (true) {
                        try {
                            System.out.println("Enter Column: ");
                            c1 = sc.nextInt();
                            matrix1 = new quiz3(r1, c1, new int[r1][c1]);
                            matrix1.Inputvalue();
                            break;
                        } catch (Exception e) {
                            System.out.println("Column is a number,please re-enter!!");
                        }
                    }

                    int r2;
                    int c2;

                    while (true) {
                        try {
                            System.out.println("Input matrix 2");
                            System.out.println("Enter Row: ");
                            r2 = sc.nextInt();
                            break;
                        } catch (Exception e) {
                            System.out.println("Row is a number,please re-enter!!");
                            sc.nextLine();
                        }

                    }
                    while (true) {
                        try {
                            System.out.println("Enter Column: ");
                            c2 = sc.nextInt();
                            matrix2 = new quiz3(r2, c2, new int[r2][c2]);
                            matrix2.Inputvalue();
                            break;
                        } catch (Exception e) {
                            System.out.println("Column is a number,please re-enter!!");
                        }
                    }

                    break;
                case 2:
                    if (matrix1 == null || matrix2 == null) {
                        System.out.println("Please input matrices first (option 1).");
                    } else {
                        System.out.println("Matrix 1: ");
                        for (int i = 0; i < matrix1.getRow(); i++) {
                            for (int j = 0; j < matrix1.getColum(); j++) {
                                System.out.print(matrix1.getData(i, j) + "\t");
                            }
                            System.out.println();
                        }

                        System.out.println("Matrix 2: ");
                        for (int i = 0; i < matrix2.getRow(); i++) {
                            for (int j = 0; j < matrix2.getColum(); j++) {
                                System.out.print(matrix2.getData(i, j) + "\t");
                            }
                            System.out.println();
                        }
                        System.out.println("Matrix resault: ");
                        for (int i = 0; i < matrixresult.getRow(); i++) {
                            for (int j = 0; j < matrixresult.getColum(); j++) {
                                System.out.print(matrixresult.getData(i, j) + "\t");
                            }
                            System.out.println();
                        }
                    }

                    break;
                case 3:
                    matrixresult = matrix1.additionMatrix(matrix2);
                    System.out.println("Finish additon 2 matrix");
                    break;
                case 4:
                    matrixresult = matrix1.subtractionMatrix(matrix2);
                    System.out.println("Finish subtraction 2 matrix");
                    break;
                case 5:
                    matrixresult = matrix1.multiplicationMatrix(matrix2);
                    System.out.println("Finish multiplication 2 matrix");
                    break;
                case 6:
                    System.out.println("Exitting");
                    break;
                default:
                    throw new AssertionError();
            }
        } while (choice != 6);
    }
}
