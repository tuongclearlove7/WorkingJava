package com.mycompany.java1;
import java.util.Scanner;

public class Java1 {
     public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';

    public static int dem_kytu(String str){
        int dem=0;
        for(int i=0;i<str.length();i++){
            if(!(str.charAt(i)>='a'&&str.charAt(i)<='z')
            &&!(str.charAt(i)>='0'&&str.charAt(i)<='9')
            &&!(str.charAt(i)>='A'&&str.charAt(i)<='Z')
            &&!(str.charAt(i)==' ')){
                dem++;
            }
        }
        return dem;
    }

    public static int dem_tu(String str) {
        
        int dem = 0;
        int size = str.length();
        boolean k_dem = true;
        
        if (str == null) {
            return -1;
        }

        for (int i = 0; i < size; i++) {
            if (str.charAt(i) != SPACE && str.charAt(i) != TAB && str.charAt(i) != BREAK_LINE) {
                if(k_dem) {
                    dem++;
                    k_dem = false;
                }
            } 
                else {
                    k_dem = true;
                }
            }
        return dem;
    }

    public static void dao_cuoi(String str){

        String chuoi_dao = new StringBuffer(str).reverse().toString();
        System.out.print(chuoi_dao);
    
    }

    public static void dao_tu_chuoi(String str){
     
        String[] myString;
        myString = str.split(" ");
        for(int i=myString.length-1;i>=0;i--) {
            System.out.print(myString[i]+" ");
        }
    }

    public static void main(String[] args) {

        Java1 created_func = new Java1();
        Scanner nhap = new Scanner(System.in);  
        System.out.print("nhap : ");
        String str = nhap.nextLine();  
        System.out.print("so tu trong chuoi la : "+ dem_tu(str));
        System.out.print("\nso ky tu dac biet la : "+created_func.dem_kytu(str));
        System.out.print("\nchuoi dao nguoc la : ");
        created_func.dao_cuoi(str);
        System.out.print("\ndao nguoc tu trong chuoi la : ");
        created_func.dao_tu_chuoi(str);
        
        
    }
}
















