
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
public class UCLN {
    
    public static void main(String[] args) {
        int a,b;
        System.out.println("Nhap 2 so: ");
        a=new Scanner(System.in).nextInt();
        b=new Scanner(System.in).nextInt();
        System.out.println("UCLN cua 2 so la: " + tim_ucln(a, b));
    }
    
    private static int tim_ucln(int a, int b){
        if(a==b || b==0){
            return a;
        } else if(a==0){
            return b;
        }else if(a>b){
            return tim_ucln(a%b,b);
        } else{
            return tim_ucln(a,b%a);
        }
    }
    
}
