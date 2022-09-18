package com.mycompany.vidu2;
import java.util.Scanner;

public class Vidu2 {
     
    public static void main(String[] args) {

        System.out.print("nhap so : ");
        Scanner nhap = new Scanner(System.in);

        int fahrenheit = nhap.nextInt();  
        int celsius = (50/9)*(fahrenheit-32);

        System.out.print(celsius + "°C");
    }
}
















