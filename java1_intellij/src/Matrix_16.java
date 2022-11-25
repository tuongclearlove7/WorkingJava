import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;
import java.util.Arrays;


public class Matrix_16 {
    public static Scanner input = new Scanner(System.in);

    public static void InputMArray(int arr[][]) {

        int n = arr.length;

        for (int i = 0; i < n; i++){

            for (int j = 0; j < n; j++){

                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = input.nextInt();

            }
        }
    }
    public static boolean CheckPrimeNumber(int n) {

        if (n == 1) {

            return false;
        }
        for (int i = 2; i <= Math.sqrt (n); i ++){

            if (n % i == 0) {

                return false;
            }
        }
        return true;
    }
    public static void OutputMArray(int arr[][]) {

        int n = arr.length;

        for (int i = 0; i < n; i++){


            for (int j = 0; j < n; j++){


                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println();
    }
    public static void MaxArray(int arr[][]) {

        int max = arr[0][0];
        int max2 = arr[0][1];

        for (int i = 0; i < arr.length; i++){


            for (int j = 0; j < arr.length; j++) {


                if (arr[i][j] > max) {

                    max = arr[i][j];
                }
            }
        }
        System.out.print("gia tri lon nhat trong ma tran la : " + max);
    }
    public static void PrimeNumbers_0(int arr[][]) {

        int n = arr.length;

        System.out.print("cac so nguyen to gan = 0 la : ");
        for (int i = 0; i < n; i++){


            for (int j = 0; j < n; j++){


                if (CheckPrimeNumber(arr[i][j]) == true) {

                    System.out.print(arr[i][j]+" = ");

                    arr[i][j] = 0;

                    System.out.print(arr[i][j]+"\n");

                }
            }
        }
    }
    public static void Algorithm_Sorting(int arr[][]){

        int i, j, f;
        int n=arr.length;
        int m=arr[0].length;
        int nm = arr.length * arr[0].length - 1;

        for (i = 0; i < nm; ++i) {


            for (j = 0; j < nm - i; ++j) {


                if (arr[j / m][j % m] > arr[(j + 1) / m][(j + 1) % m]) {

                    f = arr[(j + 1) / m][(j + 1) % m];

                    arr[(j + 1) / m][(j + 1) % m] = arr[j / m][j % m];

                    arr[j / m][j % m] = f;

                }
            }
        }

        System.out.println("\nsort :");
        for (i = 0; i < n; ++i) {


            for (j = 0; j < m; ++j) {


                System.out.print(arr[i][j]+" ");
            }

            System.out.println();
        }
    }

    public static void Sorted_CopyrightStackoverFlỏ(int arr[][]){

        for (int i = 0; i < arr.length; i++) {


             Arrays.sort(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {


            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {

        int col_n = 3;
        int row_m = 3;

        int[][] Input_hard_keyboard_Array = new int[col_n][row_m];
        int[][] Input_lazy_keyboard_Array = {
                {2, 8, 9},
                {7, 11, 10},
                {1, 5, 41}
        };

        InputMArray( Input_hard_keyboard_Array );
        OutputMArray( Input_hard_keyboard_Array );
        MaxArray( Input_hard_keyboard_Array );
        Algorithm_Sorting( Input_hard_keyboard_Array );
        PrimeNumbers_0( Input_hard_keyboard_Array );

       /* OutputMArray( Input_lazy_keyboard_Array );
        MaxArray( Input_lazy_keyboard_Array );
        Algorithm_Sorting( Input_lazy_keyboard_Array );
        PrimeNumbers_0( Input_lazy_keyboard_Array );*/


    }
}
