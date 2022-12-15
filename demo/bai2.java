package com.mycompany.bai2;
import java.util.Scanner; 
public class bai2 {
  public static void main(String[] args) {
    
	int surplus;
	int toal = 0;
	
	Scanner Input = new Scanner(System.in);

	System.out.print("Input n : ");
	int n = Input.nextInt();
        
	for (int i = 0; n > i; i++) {
         surplus = n % 10;
		 n = n / 10;
		 toal += surplus;
	}
		System.out.print("Tong cac chu so la = " + toal);
    }
}



































