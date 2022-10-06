import java.util.Scanner;
import java.text.DecimalFormat;

public class MyArray {

    public static void main(String args[]){

        int[] arr = new int[5];

        for (int i = 1; i < 5; i++){
            arr[i] = i + arr[i-1];
            System.out.print(arr[i] + " ");
        }

        arr[0] = arr[1]+arr[4];
        System.out.println("\n" + arr[0]);
    }
}
