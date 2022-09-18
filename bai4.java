package com.mycompany.bai4;
import java.util.Scanner;

public class bai4 {
   
    public static void main(String[] args) {

    private static Scanner Input = new Scanner(System.in);

        int uoc = 1;

        System.out.print("input num1 : ");

        int num1 = Input.nextInt();

        System.out.print("input num2 : ");
        
        int num2 = Input.nextInt();

        for(int i = 1; i <= num1 && i <= num2; i++)
        {
            if(num1%i==0 && num2%i==0)
                uoc = i;
        }
        System.out.print("Uoc chung lon nhat cua " + num1 + ", " + num2 + " la : " + uoc);
    }
}

 


















