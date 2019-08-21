/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Van Nam
 */
public class Quicksort {
    
    public static void main(String[] args) {
        int[] arr={0,2,5,1,6,9,5,3};
        System.out.println("Sau sap xep");
        quicksort(arr, 0, 7);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i]+"\t");
        }
    }
    
    private static void quicksort(int[] arr, int left, int right){
        if(left<right){
            int pi=patition(arr, left, right);
            quicksort(arr, left, pi-1);
            quicksort(arr, pi+1, right);
        }
    }
    
    private static int patition(int[] arr, int left, int right){
        int p=arr[right];
        int i=left-1;
        for (int j = left; j < right; j++) {
            if(arr[j]<p){
                i++;
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1]=arr[right];
        arr[right]=temp;
        return (i+1);
    }
    
}
