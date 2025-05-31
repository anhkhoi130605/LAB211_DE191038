package Weak3;

import java.util.Scanner;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Array a = new Array();
        Bubblesort b = new Bubblesort(a);
        binasearch b1 = new binasearch(a);
        quickSort qs = new quickSort();
        Stack stack = new Stack();
        Menu mn = new Menu();
        Scanner sc = new Scanner(System.in);
        int getuserchoice;

        do {
            mn.showmenu();

            while (true) {
                try {
                    getuserchoice = sc.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input. Try again!");
                    sc.nextLine();
                }
            }

            switch (getuserchoice) {
                case 1 -> {
                    System.out.print("Input array size: ");
                    a.setInput(sc.nextInt());
                    int[] inputArr = new int[a.getInput()];
                    System.out.println("Enter array elements:");
                    for (int i = 0; i < inputArr.length; i++) {
                        inputArr[i] = sc.nextInt();
                    }
                    a.setArr(inputArr);
                    System.out.println("Array entered: " + Arrays.toString(a.getArr()));
                }

                case 2 -> b.process();

                case 3 -> b1.process1();

                case 4 -> {
                    int[] arr = a.getArr();
                    if (arr == null || arr.length == 0) {
                        System.out.println("Please input array first (Option 1).");
                    } else {
                        System.out.println("Before QuickSort: " + Arrays.toString(arr));
                        qs.QS(arr, 0, arr.length - 1);
                        System.out.println("After QuickSort: " + Arrays.toString(arr));
                    }
                }

                case 5 -> {
                    System.out.print("How many elements to push into stack: ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Element " + (i + 1) + ": ");
                        stack.push(sc.nextInt());
                    }
                    stack.get();
                    stack.printStack();
                    stack.pop();
                    stack.printStack();
                }

                case 6 -> System.out.println("Exiting program!");

                default -> System.out.println("Invalid choice. Please choose between 1-6.");
            }

        } while (getuserchoice != 6);
    }
}
