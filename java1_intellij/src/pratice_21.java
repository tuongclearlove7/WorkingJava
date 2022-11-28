import java.util.Scanner;
import java.lang.Math;


public class pratice_21 {

    public static Scanner input = new Scanner(System.in);

    public static int InputRanNum(int n){

        int ranInt = (int) (Math.random() * n);

        return ranInt;
    }

    public static int ResultArray(int arr[]){

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

    public static void Find_PositionX1(int[] arr, int x){

        int result = 0;

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

                System.out.print(-1);
                break;
            }
        }
    }

    public static void MAIN_PROGRAM(){

        int[] list = new int[100];
        int[] list2 = {1,2,3,4,5,6,7,8,9,10};

        ResultArray(list);

        //int x = 60;
        int x = InputRanNum(20);
        System.out.print("\nso ngau nhien : " + x);

        Find_PositionX1(list2, x);

    }

    public static void main(String[] args) {

       MAIN_PROGRAM();

    }
}



