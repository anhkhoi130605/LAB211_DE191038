package Weak3;

import java.util.Arrays;
import java.util.Scanner;

public class binasearch {
    Array arrobj;

    public binasearch(Array a) {
        this.arrobj = a;
    }

    public int process1() {
        Scanner sc = new Scanner(System.in);
        int[] arr = arrobj.getArr();

        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty. Please input first.");
            return -1;
        }

        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        System.out.print("Enter value to search: ");
        int search = sc.nextInt();

        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == search) {
                System.out.println("Found at index: " + mid);
                return mid;
            } else if (arr[mid] < search) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println("Value not found.");
        return -1;
    }
}
