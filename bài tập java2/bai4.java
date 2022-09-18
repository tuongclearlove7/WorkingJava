package com.mycompany.bai4;
import java.util.Scanner;

public class bai4 {
   
    public static void main(String[] args) {

    private static Scanner nhap = new Scanner(System.in);

        int uoc = 1;

        System.out.print("input so 1 : ");

        int so1 = nhap.nextInt();

        System.out.print("input so 2 : ");
        
        int so2 = Input.nextInt();

        for(int i = 1; i <= so1 && i <= so2; i++)
        {
            if(so1 %i == 0 && so2%i == 0)
                uoc = i;
        }
        System.out.print("Uoc chung lon nhat cua " + so1 + ", " + so2 + " la : " + uoc);
    }
}

 


















