package com.mycompany.java1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Java1 {
    
    public static void function(char str){
        
        if(str >= 'A' && str<='Z'){
            System.out.print(str + " la ky tu viet hoa");
        }
        else if(str >= 'a' && str <= 'z'){
            System.out.print(str + " la ky tu thuong");
        }
        else if(str >= '0' && str <= '9'){
            System.out.print(str + " la ky tu so");
        }
    }
    
    public static void main(String[] args) {
        
        int n = 0;
        
        Scanner input = new Scanner(System.in);  
        System.out.print("Input : ");
        
        char ch = input.nextLine().charAt(n);  
        
        function(ch);
        
    }    
}
