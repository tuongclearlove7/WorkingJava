import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;

public class pratice_22 {

    public static Scanner input = new Scanner(System.in);

    public static int InputRanNum(int n){

        int ranInt = (int) (Math.random() * n);

        return ranInt;
    }

    public static int ResultArray22(int arr[]){

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

    public static void Find_PositionXNull(int[] arr, int x){

        int result = 0;
        int NullArray[] = {};

        System.out.print("\nx : " + x + "\n");

        for (int i = 0 ; i < arr.length ; i++) {

            if (arr[i] == x) {

                result = i;
                result++;

                System.out.print("o vi tri " + result + "\n");

            } else if (x == 0) {

                System.out.print("None");
                break;

            } else if (x > 10) {

                System.out.println("Null Array = " + Arrays.toString(NullArray));
                break;
            }
        }
    }

    public static void MAIN_PROGRAM(){

        int[] list = new int[100];
        int[] list2 = {1,2,3,4,5,6,7,8,9,10};

        ResultArray22(list);

        //int x = 11;
        int x = InputRanNum(20);
        System.out.print("\nso ngau nhien : " + x);

        Find_PositionXNull(list2, x);

    }

    public static void main(String[] args) {

        MAIN_PROGRAM();

    }
}
