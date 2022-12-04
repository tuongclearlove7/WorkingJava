import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Pratice_Fibonacci_HighLevel_13 {

    private static Scanner scanner = new Scanner(System.in);

    public static int fibonacci(int n) {

        if (n < 0) {

            return -1;

        } else if (n == 0 || n == 1) {

            return n;
        }
        else {

            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static boolean CheckPrimeNumber(int n) {

        if (n < 2) {

            return false;
        }

        int square = (int) Math.sqrt(n);

        for (int i = 2; i <= square; i++) {

            if ( n % i == 0 ) {

                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.print("nhap n = ");

        int n = scanner.nextInt();

        System.out.printf("Cac so fibonacci nho hon " + n + " va la so nguyen to : ", n);

        for (int i = 0; fibonacci(i) < n; i++ ) {

            int fi = fibonacci(i);

            if (CheckPrimeNumber(fi)) {

                System.out.print(fi + " ");
            }
        }
    }
}
