import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;

public class pratice_23 {

    public static Scanner input = new Scanner(System.in);

    public static int InputRanNum(int n){

        int ranInt = (int) (Math.random() * n);

        return ranInt;
    }

    public static int ResultArray23(int arr[]){

        int Outline = 0;
        int n = arr.length;
        arr = new int[n];

        System.out.println("so ngau nhien sinh ra : ");

        for (int i = 0; i < n ;i++ ) {

            arr[i] = InputRanNum(n);

            System.out.print(arr[i] + " ");

            Outline++;

            if(Outline == 10){

                System.out.println();

                Outline = 0;
            }
        }

        return  Outline;
    }

    public static void OutputArray(int[] arr){

        int n = (arr.length - arr.length) + 1;

        for (int i = 0 ; i < n ; i++) {

            System.out.print("list = " + Arrays.toString(arr));
            break;
        }
    }

    public static void SortArrayUp(int[] arr){

        int f = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                if (arr[i] > arr[j]) {

                    f = arr[i];
                    arr[i] = arr[j];
                    arr[j] = f;
                }
            }
        }

        System.out.print("\nSort Up : ");
        for (int i = 0 ; i < arr.length ; i++) {

            System.out.print(arr[i] + " ");
        }
    }

    public static void SortArrayDown(int[] arr){

        int f = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                if (arr[i] < arr[j]) {

                    f = arr[i];
                    arr[i] = arr[j];
                    arr[j] = f;
                }
            }
        }

        System.out.print("\nSort Down : ");
        for (int i = 0 ; i < arr.length ; i++) {

            System.out.print(arr[i] + " ");
        }
    }

    public static void MAIN_PROGRAM23(){

        int[] list1 = new int[100];
        int[] list2 = {1,2,3,4,5,6,7,12,11,10};

        ResultArray23(list1);
        OutputArray(list2);
        SortArrayUp(list2);
        SortArrayDown(list2);

    }

    public static void main(String[] args) {

        MAIN_PROGRAM23();

    }
}
