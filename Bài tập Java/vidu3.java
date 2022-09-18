package com.mycompany.vidu3;
import java.util.Scanner;

public class vidu3 {
   
    public static void main(String[] args) {

        System.out.print("nhap so tien vay : ");
        Scanner Input = new Scanner(System.in);

        int loan = Input.nextInt();
        int year = 12;
        int percent = 1;
        int monthPay = (loan*percent)/year;

        System.out.print("so tien phai tra hang thang la : "+monthPay);

        int total = monthPay*year; 
        
        System.out.print("\ntong tien phai tra trong 1 nam la : "+total);
    }
}
















