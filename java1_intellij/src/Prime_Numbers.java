import java.util.Scanner;

public class Prime_Numbers {


    public static boolean CheckPrimeNumber(int n) {

        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt (n); i ++){
            if (n% i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void PrimeNum(int n){

        int OutlinePrime = 0;
        int CountPrime = 0;

        for (int i = 1; i < n; i ++) {
            if (CheckPrimeNumber(i) == true) {
                System.out.print(i + " ");
                OutlinePrime++;
                if (OutlinePrime == 10) {
                    System.out.println();
                    OutlinePrime = 0;
                }
                CountPrime++;
            }
        }
        System.out.print("\n"+"co : "+CountPrime+" so nguyen to");
    }

    public static void ThisPrime(int n){

        for (int i = 1; i < n; i ++) {
            if (CheckPrimeNumber(i) == true) {
                System.out.print("\n"+i+" la so nguyen to "+"\n");
            }else{
                System.out.print("\n"+i+" k phai so nguyen to "+"\n");
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        PrimeNum(230);
        ThisPrime(230);
        PrimeNum(283);
    }
}
