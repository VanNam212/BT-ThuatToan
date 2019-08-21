
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Van Nam
 */
public class BinarySearch {
    
    public static void main(String[] args) {
        int[] arr={0,1,5,3,6,8,3,2,7,8};
        System.out.println("Nhap so can tim");
        int x=new Scanner(System.in).nextInt();
        quicksort(arr, 0, arr.length-1);
        if(binarySearch(arr, x, 0, arr.length-1)==-1){
            System.out.println("ko");
        } else{
            System.out.println("co");
        }
             
    }
    
    private static int binarySearch(int[] arr, int x, int left,int right){
if(right>=left){
        int mid=left+(right-1)/2;
        if(arr[mid]==x){
            return mid;
        } else if(arr[mid]>x){
            return binarySearch(arr, x, left, mid-1);
        } else{
            return binarySearch(arr, x, mid+1, right);
        }
}
return -1;
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
