package com.mycompany.java1;
import java.util.Scanner;

public class Java1 {
   
    public static void main(String[] args) {

        System.out.println("mili giay : "+ System.currentTimeMillis());

        long time = System.currentTimeMillis();
        long totalSeconds = time;
        long currentSecond = totalSeconds % 60;
        long totalMinutes =  totalSeconds/60;
        long currentMinutes = totalMinutes%60 -30 ; 
        long totalHour= totalMinutes/60;
        long currentHour =  totalHour % 24 - 6  ;
        
        System.out.print("thoi gian hien tai (HH:MM:SS) = ");
        System.out.println(String.format("%d:%02d:%02d",currentHour,currentMinutes,currentSecond));

    }
}
















