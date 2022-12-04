import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;

public class pratice_24 {

    public static Scanner input = new Scanner(System.in);


    public static void SortArrayUp(int[] arr){


        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                if (arr[i] > arr[j]) {

                    int f  = arr[i];
                    arr[i] = arr[j];
                      arr[j] = f;
                }
            }
        }

        System.out.print("Sort Up : ");
        for (int i = 0 ; i < arr.length ; i++) {

            System.out.print(arr[i] + " ");
        }
    }

    public static void SortArrayDown(int[] arr){

        for (int i = 0 ; i < arr.length; i++) {

            for ( int j = i ; j < arr.length; j++) {

                if (arr[i] < arr[j]) {

                    int f = arr[i];
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

    public static void Find_PositionX(int[] arr, int element){

        for (int i = 0 , result ; i < arr.length ; i++) {

            if (arr[i] == element) {

                result = i;
                result++;

                System.out.print(arr[i] + " o vi tri thu " + result + "\n");
            }
        }
    }

    public static void OutputPosElementInArray(int[] arr){

        for (int i = 0 ; i < arr.length ; i++) {

            System.out.print("list = "+Arrays.toString(arr) + "\n");

            break;
        }

        for (int i = 0 ; i < arr.length ; i++) {

            Find_PositionX(arr,arr[i]);
        }
    }

    public static void MAIN_PROGRAM24(){

        int[] list2 = {1,2,3,4,5,6,7,12,11,10};

        OutputPosElementInArray(list2);
        SortArrayUp(list2);
        SortArrayDown(list2);

    }

    public static void main(String[] args) {

        MAIN_PROGRAM24();

    }
}
