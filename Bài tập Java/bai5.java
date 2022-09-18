package com.mycompany.bai5;
import java.util.Scanner;

public class bai5 {

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

    public void total_odd(int n){

        int s1 = 0;

        for (int i = 0; i < n; i += 2) {
            s1 += arr[i];
        }
        System.out.print("\nTong cac so le la " + s1);
    }

    public void Prime_num(int n){

        System.out.println("\ncac so nguyen to la : ");

        for (int i = 0; i <n; i ++){
            if (thisPrimeNumber(arr[i])) {
               System.out.print(arr[i]+" ");
            }
        }
    }

    public static boolean thisPrimeNumber(int n) {
       
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt (n); i ++){
            if (n% i == 0) {
                return false;
            } 
        }
        return true;
    }

    public void Next2max_total(int n,int a, int b){

        int max = arr[0]+arr[1];

        for(int i=1;i<arr.length-1;i++){
            if(arr[i+1]+arr[i]> max){
               max = arr[i+1]+arr[i];
               a = arr[i+1];
               b = arr[i];
            }
        }
        System.out.print("\nhai phan tu lien tiep co tong lon nhat la  : "+a+" va "+b);
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

    public void symmetry_average(int n){
        int total = 0;
        for(int i = 0; i <= n ; i++){
            if( check_symmetry(arr[i])==true){
                total = total+arr[i];
            }
        }
        System.out.print("\ntong cua cac so doi xung la : "+total);
    }
    
    public static void main(String[] args) {

        Bai5 created_arr = new bai5();

        int n , a=0, b=0 ;

        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so phan tu : ");
        n = input.nextInt();
        created_arr.input_arr(n);
        created_arr.output_arr(n);
        created_arr.total_odd(n);
        created_arr.Prime_num(n);
        created_arr.Next2max_total(n,a,b);
        created_arr.symmetry_average(n);
    }
}





 


















