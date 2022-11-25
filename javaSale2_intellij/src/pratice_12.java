import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class pratice_12 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int NumbersN = 1;
        int n;
        int f0 = 1;
        int f1 = 1;


        n = 10;
        System.out.print("nhap n : " + n);

        if (n > 1) {

            for ( int i = 2; i <= n; i++ ) {

                NumbersN = f0 + f1;
                f0 = f1;
                f1 = NumbersN;

            }
        }

        System.out.println("\nSo Fibonacci thu " + n +" la " + NumbersN);
    }

}
