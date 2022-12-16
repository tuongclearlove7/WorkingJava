package com.mycompany.bai1;
import java.util.Scanner;

public class Bai1 {
    private static Scanner nhap = new Scanner(System.in);
     
    public static void main(String[] args) {
        
        int n = nhap.nextInt();
        
        System.out.print("input n = ");
        
        System.out.print(" cac so nguyen to nho hon " + n +" la : ");

        if (n >= 2) {
            System.out.print(2);
        }

        for (int i = 3; i < n; i+=2) {
            if (songuyento(i)) {
                System.out.print(" " + i);
            }
        }
    }
     
   
    public static boolean songuyento(int n) {
       
        int so = (int) Math.sqrt(n);

        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= so; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
