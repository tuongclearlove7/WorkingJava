package com.mycompany.bai2;
import java.util.Scanner; 
public class bai2 {
  public static void main(String[] args) {
    
	int sodu;
	int tong = 0;
	
	Scanner nhap = new Scanner(System.in);

	System.out.print("Input n : ");
	int n = nhap.nextInt();
        
	for (int i = 0; n > i; i++) {
         sodu = n % 10;
		 n = n / 10;
		 tong += sodu;
	}
		System.out.print("Tong cac chu so la = " + tong);
    }
}



































