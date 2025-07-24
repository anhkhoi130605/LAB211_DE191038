/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Weak7;

/**
 *
 * @author kpham
 */
public class Test {
     public static void main(String[] args) {
        BookDAO bd = new BookDAO();

        if (bd.addBook(new Book("111", "Math")) > 0)
            System.out.println("Book inserted into database successfully");
        else
            System.out.println("No book inserted.");
    }
}
