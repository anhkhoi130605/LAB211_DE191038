/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Weak3;

/**
 *
 * @author kpham
 */
public class quickSort {
    
    public int partition(int [] a,int l , int r){
        int pivot = a[(l+r)/2], i=l,j=r;
        while (i<=j) {            
            while (a[i]<pivot) {                
                i++;
            }
            while (a[j]>pivot) {                
                j--;
            }
            if (i<=j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
       return i;
    }
    public void QS(int [] a,int l , int r)
    {
        int i = partition(a, l, r);
        if (l < i-1) {
            QS(a, l, i-1);
        }
        else if (i < r) {
            QS(a, i, r);
        }
    }
}
