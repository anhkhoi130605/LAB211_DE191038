package Weak3;

import java.util.Arrays;

public class Bubblesort {
    Array arrobj;

    public Bubblesort(Array a) {
        this.arrobj = a;
    }

    public void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void process() {
        int[] arr = arrobj.getArr();
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty. Please input first.");
            return;
        }

        System.out.println("Before Bubble Sort: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        System.out.println("After Bubble Sort: " + Arrays.toString(arr));
    }
}
