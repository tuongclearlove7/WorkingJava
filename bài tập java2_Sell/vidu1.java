package com.mycompany.vidu1;
import java.util.Scanner;

public class Vidu1 {
   
     
    public static void main(String[] args) {
        
        Scanner nhap = new Scanner(System.in);
        System.out.print("nhap so : ");

        int so = nhap.nextInt();

        if(so % 2 == 0){
            System.out.print("so nhap vao chia het cho 2\n");
        }
        else{
            System.out.print("so nhap vao k chia het cho 2\n");
        }
        if(so % 5 == 0){
            System.out.print("so nhap vao chia het cho 5");
        }
        else{
            System.out.print("so nhap vao k chia het cho 5");
        }
    }
}
















