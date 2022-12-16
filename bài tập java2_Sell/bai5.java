package com.mycompany.bai5;
import java.util.Scanner;

public class bai5 {

    private int mang[] = new int[10]; 

    public void nhap_mang(int n){
    
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhap phan tu cua mang : ");
    
        for(int i=0; i<n; i++) {
            mang[i]= nhap.nextInt();
        }
    }
 
    public void xuat_mang(int n){

        System.out.print("Mang vua nhap : ");

        for(int i=0; i<n; i++){
            System.out.print(mang[i]+" ");
        }
    }

    public void tong_sole(int n){

        int s1 = 0;

        for (int i = 0; i < n; i += 2) {
            s1 += mang[i];
        }
        System.out.print("\nTong cac so le la " + s1);
    }

    public void so_nguyento(int n){

        System.out.println("\ncac so nguyen to la : ");

        for (int i = 0; i <n; i ++){
            if (snguyento(mang[i])) {
               System.out.print(mang[i]+" ");
            }
        }
    }

    public static boolean snguyento(int n) {
       
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

    public void tong2_sodoixung(int n,int a, int b){

        int max = mang[0]+mang[1];

        for(int i=1;i<mang.length-1;i++){
            if(mang[i+1]+mang[i]> max){
               max = mang[i+1]+mang[i];
               a = mang[i+1];
               b = mang[i];
            }
        }
        System.out.print("\nhai phan tu lien tiep co tong lon nhat la  : "+a+" va "+b);
    }

    public static int dao_songuyen(int n){

        int daoso = 0;

        for(int i = 0; n > i; i++){
            daoso=daoso*10+n%10;
            n/=10;
        }
          return daoso;
    }
    
    public static boolean timso_doixung(int n){

           if(dao_songuyen(n)==n){
                return true;
           }
           else{
                return false;
        }
    }

    public void doi_xung(int n){
        int total = 0;
        for(int i = 0; i <= n ; i++){
            if( timso_doixung(mang[i])==true){
                total = total+mang[i];
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
        created_arr.nhap_mang(n);
        created_arr.xuat_mang(n);
        created_arr.tong_sole(n);
        created_arr.so_nguyento(n);
        created_arr.tong2_sodoixung(n,a,b);
        created_arr.doi_xung(n);
    }
}





 


















