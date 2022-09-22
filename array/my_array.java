package com.mycompany.java1;
import java.util.Scanner;

public class Java1 {
         
    private int arr[] = new int[10]; 

    public void input_arr(int n){
    
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap phan tu cua mang : ");
    
        for(int i=0; i<n; i++) {
            arr[i]= input.nextInt();
        }
    }
    public void output_arr(int n){

        System.out.print("Mang vua nhap : ");

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public void Check_MIN(int n){
        
	int min = arr[0];
        for(int i = 0 ; i < n; i++) {
                if(arr[i] < min ) {
                min = arr[i];
            }
	}
	System.out.print("\nmin la : "+min);
}

    public int find_x(int x,int n) {
        
	for(int i = 0; i < n; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
 
    
    public static void main(String[] args) {

        Java1 created_arr = new Java1();

        int n , a=0, b=0 ,x,pos;
        
        
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so phan  tu : ");
        n = input.nextInt();
        created_arr.input_arr(n);
        created_arr.output_arr(n);
        created_arr.Check_MIN(n);
        
        System.out.print("\nNhap x : ");	
        x = input.nextInt();
        pos = created_arr.find_x(x,n);
        if (pos == -1){
            System.out.println("khong tim thay phan tu nay trong mang");
        } 
        else {
            System.out.println("phan tu nay co trong mang");
        }
    }
}

















