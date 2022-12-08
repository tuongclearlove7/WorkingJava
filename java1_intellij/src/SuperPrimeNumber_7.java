import java.util.Scanner;

public class SuperPrimeNumber_7 {
    
    public static Scanner input = new Scanner(System.in);

    public static boolean CheckPrimeNumber(int n) {
        if (n < 2) {

            return false;
        }

        int squareRoot = (int) Math.sqrt(n);

        for (int i = 2; i <= squareRoot; i++) {

            if (n % i == 0) {

                return false;
            }
        }

        return true;
    }

    public static void SuperPrimeNumber(int n){
        int count = 0;

        if (n > 0 || n < 10) {

            switch (n) {

                case 1:

                    for (int i = 1; i < 10; i++) {

                        int f = i;

                        while (CheckPrimeNumber(f)) {
                            f = f / 10;

                        }
                        if (f == 0) {
                            System.out.print(i + " ");
                            count++;
                        }

                    }
                    System.out.print("\nco " + count + " so nguyen to");
                    break;
                case 2: {
                    for (int i = 10; i < 100; i++) {

                        int f = i;

                        while (CheckPrimeNumber(f)) {
                            f = f / 10;
                        }
                        if (f == 0) {
                            System.out.print(i + " ");
                            count++;
                        }

                    }
                    System.out.print("\nco " + count + " so nguyen to");
                }
                break;
                case 3:
                    for (int i = 100; i < 1000; i++) {

                        int f = i;

                        while (CheckPrimeNumber(f)) {
                            f = f / 10;
                        }
                        if (f == 0) {
                            System.out.print(i + " ");
                            count++;
                        }

                    }
                    System.out.print("\nco " + count + " so nguyen to");
                    break;
                case 4:
                    for (int i = 1000; i < 10000; i++) {

                        int f = i;

                        while (CheckPrimeNumber(f)) {
                            f = f / 10;
                        }
                        if (f == 0) {
                            System.out.print(i + " ");
                            count++;
                        }

                    }
                    System.out.print("\nco " + count + " so nguyen to");
                    break;
                case 5:
                    for (int i = 10000; i < 100000; i++) {

                        int f = i;

                        while (CheckPrimeNumber(f)) {
                            f = f / 10;
                        }
                        if (f == 0) {
                            System.out.print(i + " ");
                            count++;
                        }

                    }
                    System.out.println("\nco " + count + " so nguyen to");

                    break;

                case 6:

                    for (int i = 100000; i < 1000000; i++) {

                        int f = i;

                        while (CheckPrimeNumber(f)) {
                            f = f / 10;
                        }
                        if (f == 0) {

                            System.out.print(i + " ");
                            count++;
                        }

                    }
                    System.out.println("\nco " + count + " so nguyen to");
                    break;

                case 7:

                    for (int i = 1000000; i < 10000000; i++) {

                        int f = i;

                        while (CheckPrimeNumber(f)) {
                            f = f / 10;
                        }
                        if (f == 0) {
                            System.out.print(i + " ");
                            count++;
                        }

                    }

                    System.out.println("\nco " + count + " so nguyen to");

                    break;

                case 8:

                    for (int i = 10000000; i < 100000000; i++) {

                        int f = i;

                        while (CheckPrimeNumber(f)) {
                            f = f / 10;
                        }
                        if (f == 0) {

                            System.out.print(i + " ");
                            count++;
                        }

                    }

                    System.out.println("\nco " + count + " so nguyen to");
                    break;

                case 9:

                    for (int i = 100000000; i < 1000000000; i++) {

                        int f = i;

                        while (CheckPrimeNumber(f)) {
                            f = f / 10;
                        }
                        if (f == 0) {
                            
                            System.out.print(i + " ");
                            count++;
                        }
                    }

                    System.out.println("\nco " + count + " so nguyen to");
                    break;

            }
        }
    }


    public static void main(String[] args) {

       int n = 5;
       System.out.print("ban muon bao nhieu chu so : " + n);
       // int n = input.nextInt();
       System.out.print("Cac so sieu nguyen to la: ");
       SuperPrimeNumber(5);
    }
}

