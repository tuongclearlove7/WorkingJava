import java.util.Scanner;

public class UCLN_9 {
    public static Scanner input = new Scanner(System.in);

    public static int ucln(int a, int b) {
        if (b == 0) {
            return a;
        }
        if (a % b == 0) {
            return b;
        }
        return ucln(b, a % b);
    }

    public static void main(String[] args) {
        int a, b;
        System.out.print("Nhap a : ");
        a = input.nextInt();
        System.out.print("Nhap b : ");
        b = input.nextInt();
        System.out.println("UCLN(" + a + ", " + b + ") la : " + ucln(a, b));
    }
}
