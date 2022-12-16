package com.mycompany.bai3;
import java.util.Scanner;

public class bai3 {

    public static void main(String[] args) {

         Scanner nhap=new Scanner(System.in);
         System.out.print("input : ");
         int n=nhap.nextInt();
         System.out.print("cac so doi xung be hon " + n + " la : ");

         for(int i = 1 ; i <= n ; i++){
            if( tim_so_doixung(i)==true){
                System.out.print(i+" ");
            }
        }
    }

    public static int dao_so(int n){
        
        int dao = 0;

        for(int i = 0; n > i; i++){
            dao = dao*10+n%10;
            n/=10;
        }
          return dao;
    }
    
    public static boolean tim_so_doixung(int n){

           if(dao_so(n)==n){
                return true;
           }
           else{
                return false;
        }
    }
}

 


















