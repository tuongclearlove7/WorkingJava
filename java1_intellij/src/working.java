import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class working {


    public static void inputArr(int arr[]){
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < arr.length;i++ ){
            System.out.print("\nnhap vao so nguyen : ");
            arr[i] = input.nextInt();
        }
    }
    public static int outputArr(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print("xuat mang : " + arr[i] + " ");
        }
        return 0;
    }
    public static int total_num(int arr[]){

        int total = 0;

        for (int i = 0; i < arr.length;i++ ) {
            if(arr[i] % 2 == 0){
                total = total + arr[i];
            }
        }
        return total;
    }

    public static int Max_num(int arr[]){

        int flag = arr[0];

        for (int i = 0; i < arr.length;i++ ) {
            if(arr[i] > flag){
                flag = arr[i];
            }
        }
        return flag;
    }

    public static int MaxMinSubmation(int arr[]){

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length;i++ ) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length;i++ ) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return max - min;
    }

    public static int ReverseNum(int arr[],int n){

        System.out.print("chuoi dao nguoc la : ");
        for (int i = n - 1; i > 0; i--) {
            System.out.print(arr[i] + " ");
        }
        return 0;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = 5;
        int[] list = new int[n];// mảng có 5 phần tử

        inputArr(list);
        outputArr(list);
        System.out.println("\ntong so chan la : " + total_num(list));
        System.out.println("\nmax la : " + Max_num(list));
        System.out.println("\nhieu cua Max - Min la : " + MaxMinSubmation(list));
        ReverseNum(list,n);
    }
}
