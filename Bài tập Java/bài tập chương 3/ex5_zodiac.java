package com.mycompany.java1;
import java.util.Scanner;

public class Java1 {
         
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        
        System.out.print("Input : ");
        int year=input.nextInt();

        int choose=year%12;
        switch(choose){
            case 0:
            System.out.print("Monkey");
            break;

            case 1:
            System.out.print("rooster");
            break;

            case 2:
            System.out.print("dog");
            break;

            case 3:
            System.out.print("Pig");
            break;

            case 4:
            System.out.print("rat");
            break;

            case 5:
            System.out.print("Ox");
            break;

            case 6:
            System.out.print("tiger");
            break;

            case 7:
            System.out.print("rabit");
            break;

            case 8:
            System.out.print("dragon");
            break;

            case 9:
            System.out.print("Snack");
            break;

            case 10:
            System.out.print("Horse");
            break;

            case 11:
            System.out.print("sheep");
            break;
            
        }
    }
}
















