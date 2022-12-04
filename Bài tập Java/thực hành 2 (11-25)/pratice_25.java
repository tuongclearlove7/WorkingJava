import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;

public class pratice_25 {

    public static Scanner input = new Scanner(System.in);

    public static void Equation25(double a, double b,double c){

        double x1 , x2, delta;

        System.out.println("Phuong trinh bac hai ban vua nhap co dang: " + a + "x^2 + " + b + "x + " + c + " = 0");
        delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {

            System.out.println("Phuong trinh vo nghiem !");

        }
        else if (delta == 0) {

            x1 = -b / (2 * a);

            System.out.println("phuong trinh co 1 nghiem la x1 = x2 = " + x1);

        }
        else {

            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("phuong trinh co nghiem x1 = " + x1 + " và x2 = " + x2);
        }
    }


    public static void MAIN_Equation25(double a, double b, double c){

    }

    public static void MAIN25(){

        double a ,b, c;

        System.out.print("Nhap a (a # 0) : ");
        a = input.nextDouble();
        System.out.print("Nhap b: ");
        b = input.nextDouble();
        System.out.print("Nhap c: ");
        c = input.nextDouble();

        Equation25(a,b,c);
        MAIN_Equation25(a,b,c);

    }

    public static void main(String[] args) {

        MAIN25();

    }
}
