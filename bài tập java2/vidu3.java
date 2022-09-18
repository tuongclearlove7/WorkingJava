package com.mycompany.vidu3;
import java.util.Scanner;

public class vidu3 {
   
    public static void main(String[] args) {

        System.out.print("nhap so tien vay : ");
        Scanner nhap = new Scanner(System.in);

        int tien_vay = nhap.nextInt();
        int nam = 12;
        int phantram = 1;
        int tientra_hangthang = (tien_vay*phantram)/nam;

        System.out.print("so tien phai tra hang thang la : "+tientra_hangthang);

        int tong = tientra_hangthang*nam; 
        
        System.out.print("\ntong tien phai tra trong 1 nam la : "+tong);
    }
}
















