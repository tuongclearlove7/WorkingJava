package com.mycompany.java1;
import java.util.Scanner;

public class Java1 {
    
    public static void year_nhuan(int year_param){

        if(year_param%4==0&&year_param%100!=0||year_param%400==0){
            System.out.print("nam " + year_param + " la nam nhuan !");
        }
        else{
            System.out.print("nam " + year_param + " khong phai nam nhuan !");
    
        }
    }

    public static void main(String[] args){
        
        Scanner input=new Scanner(System.in);
        
        System.out.print("input year : ");
        int input_year = input.nextInt();
        
        year_nhuan(input_year);
    }
}

