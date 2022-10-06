import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class ranNum_Arr {

    public static int InputRanNum(int n){

        int ranInt = (int) (Math.random() * n);

        return ranInt;
    }
    public static int HandleArray(int arr[]){

        int n = 101;
        int Outline = 0;
        int total = 0;
        int count = 0;
        int medium = 0;
        int great = 0;
        arr = new int[n];

        System.out.println("so ngau nhien nhap vao : ");
        for (int i = 1; i < n;i++ ) {
            arr[i] = InputRanNum(n);
            System.out.print(arr[i] + " ");
            total = total + arr[i];
            Outline++;
            count++;
            medium =  total / count;
            if (Outline == 10) {
                System.out.print("\n");
                Outline = 0;
            } else if (medium < arr[i]) {
                great++;
            }
        }
        System.out.println("trung binh cong la : " + medium);
        System.out.println("Co " + great + " so ngau nhien lon hon so trung binh "+ medium);

        return  medium;
    }

    public static void main(String[] args) {

        int n = 1000;
        int[] list = new int[n];

        HandleArray(list);

    }
}
