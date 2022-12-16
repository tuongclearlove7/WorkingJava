package com.mycompany.java1;
import java.util.Scanner;

public class Java1 {
   
    public static void main(String[] args) {

        System.out.println("mili giay : "+ System.currentTimeMillis());

        long thoigian = System.currentTimeMillis();
        long tong_giay = thoigian;
        long giay = tong_giay % 60;
        long tong_phut =  tong_giay/60;
        long phut = tong_phut%60 -30 ; 
        long tong_gio= tong_phut/60;
        long gio =  tong_gio % 24 - 6  ;
        
        System.out.print("thoi gian hien tai (HH:MM:SS) = ");
        System.out.println(String.format("%d:%02d:%02d",gio,phut,giay));

    }
}
















