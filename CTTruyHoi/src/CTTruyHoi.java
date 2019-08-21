
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
public class CTTruyHoi {
    
    public static void main(String[] args) {
        System.out.println("Tinh 2^n");
        System.out.println("Nhap n: ");
        int n=new Scanner(System.in).nextInt();
        System.out.println("Nhap a: ");
        int a=new Scanner(System.in).nextInt();
        System.out.println("2^n = " + tinh(a,n));
    }
    
    private static int tinh(int a,int n){
        if(n==0){
            return 1;
        } else if(n%2==0){
            return square(tinh(a,n/2));
        } else{
            return mult(a, tinh(a,n-1));
        }
    }
    
    private static int square(int a){
        return a*a;
    }
    
    private static int mult(int a, int x){
        return a*x;
    }
    
}
