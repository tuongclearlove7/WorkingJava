package com.mycompany.java1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Java1 {
    
    public static void BMI_index(float kg_param,float height_param ){
        
        DecimalFormat Float_Format = new DecimalFormat("#.##");
        
        float BMI = kg_param / (height_param * height_param);
            
        System.out.println("chi so BMI la : " + Float_Format.format(BMI));
	
        if(BMI < 18.5){
                System.out.print("Underweight");
            }
            else if(BMI >= 18.5 && BMI < 25.5){
                System.out.print("Normal");
            }
            else if(BMI >= 25.0 && BMI < 30.0){
                System.out.print("Overweight");
            }
            else{
                System.out.print("Obese");
            }
}
    
    public static void main(String[] args){
       
        Scanner input = new Scanner(System.in);
            
        System.out.print("nhap can nang : ");
        float kg = input.nextFloat();
            
        System.out.print("nhap chieu cao: ");
        float height = input.nextFloat();
            
        BMI_index(kg,height);
    }
}