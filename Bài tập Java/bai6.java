package com.mycompany.bai6;
import java.util.Scanner;

public class Bai6 {
   
    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';

    public static int count_symbolspecial(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(!(str.charAt(i)>='a'&&str.charAt(i)<='z')
            &&!(str.charAt(i)>='0'&&str.charAt(i)<='9')
            &&!(str.charAt(i)>='A'&&str.charAt(i)<='Z')
            &&!(str.charAt(i)==' ')){
                count++;
            }
        }
        return count;
    }

    public static int dictionaty_count(String str) {
        
        int count = 0;
        int size = str.length();
        boolean notCounted = true;
        
        if (str == null) {
            return -1;
        }

        for (int i = 0; i < size; i++) {
            if (str.charAt(i) != SPACE && str.charAt(i) != TAB && str.charAt(i) != BREAK_LINE) {
                if(notCounted) {
                    count++;
                    notCounted = false;
                }
            } 
                else {
                    notCounted = true;
                }
            }
        return count;
    }

    public static void String_reverse(String str){

        String reverse_str = new StringBuffer(str).reverse().toString();
        System.out.print(reverse_str);
    
    }

    public static void dictionary_reverse(String str){
     
        String[] myString;
        myString = str.split(" ");
        System.out.print(myString[myString.length-1] + " ");

        for(int i = 1; i < myString.length-1 ; i++ ){
            System.out.print(myString[i]+" ");
        }
            System.out.print(myString[0]);
    }

    public static void main(String[] args) {

        Java1 created_func = new Java1();
        Scanner input = new Scanner(System.in);  
        System.out.print("Input : ");
        String str = input.nextLine();  
        System.out.print("so tu trong chuoi la : "+ dictionaty_count(str));
        System.out.print("\nso ky tu dac biet la : "+created_func.count_symbolspecial(str));
        System.out.print("\nchuoi dao nguoc la : ");
        created_func.String_reverse(str);
        System.out.print("\ndao nguoc tu trong chuoi la : ");
        created_func.dictionary_reverse(str);
        
        
    }
}
















