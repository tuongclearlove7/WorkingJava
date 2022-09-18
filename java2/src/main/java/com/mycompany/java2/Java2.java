package com.mycompany.java2;
import java.util.Scanner;

public class Java2 {
      private static Scanner Input = new Scanner(System.in);
     
    public static void main(String[] args) {
        
        System.out.print("input n = ");
        int n = Input.nextInt();
        System.out.print(" cac so nguyen to nho hon " + n +" la : ");

        if (n >= 2) {
            System.out.print(2);
        }

        for (int i = 3; i < n; i+=2) {
            if (isPrimeNumber(i)) {
                System.out.print(" " + i);
            }
        }
    }
     
   
    public static boolean isPrimeNumber(int n) {
       
        int square = (int) Math.sqrt(n);

        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= square; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

   
