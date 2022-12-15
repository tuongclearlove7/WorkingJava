package com.mycompany.bai3;
import java.util.Scanner;

public class bai3 {

    public static void main(String[] args) {

         Scanner input=new Scanner(System.in);
         System.out.print("input : ");
         int n=input.nextInt();
         System.out.print("cac so doi xung be hon " + n + " la : ");

         for(int i = 1 ; i <= n ; i++){
            if( check_symmetry(i)==true){
                System.out.print(i+" ");
            }
        }
    }

    public static int reverse_num(int n){
        
        int reverse = 0;

        for(int i = 0; n > i; i++){
            reverse=reverse*10+n%10;
            n/=10;
        }
          return reverse;
    }
    
    public static boolean check_symmetry(int n){

           if(reverse_num(n)==n){
                return true;
           }
           else{
                return false;
        }
    }
}

 


















