import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;


public class MultiArray {

    public static void LengArray(){
        int[][] array1 = {
                {1, 2, 3},
                {7, 8, 9},
                {10, 11, 12}
        };

        System.out.println(array1.length);
        System.out.println(array1[0].length);
        System.out.println(array1[1].length);
        System.out.println(array1[2].length);
    }

    public static void InputMArray(int array2[][],int n) {

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print("nhap phan tu trong mang 2 chieu : ");
                array2[i][j] = input.nextInt();
            }
        }
    }
    public static void OutputMArray(int array2[][],int n) {

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.println("arr[" + i + "][" + j + "] = " + array2[i][j]);
            }
        }
    }
    public static int ShowDynaminArray(){

        Scanner input = new Scanner(System.in);

        System.out.print("nhap n : ");
        int n = input.nextInt();
        int[][] array2 = new int[n][n];

        InputMArray(array2,n);
        OutputMArray(array2, n);
        return 0;
    }

    public static void main(String args[]) {

        ShowDynaminArray();

    }
}






























