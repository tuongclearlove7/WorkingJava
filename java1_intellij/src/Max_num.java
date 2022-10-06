import java.util.Scanner;
import java.text.DecimalFormat;

public class Max_num {
    public static int MAX_int(int num1 , int num2){

        int result;

        if(num1 > num2) {
            result = num1;
        }
        else {
            result = num2;
        }
        return result;

    }
    public static int MIN_int(int num1 , int num2){

        int result;

        if(num1 < num2) {
            result = num1;
        }
        else {
            result = num2;
        }
        return result;

    }
    public static double MAX_double(double num1 , double num2){

        double result;

        if(num1 > num2) {
            result = num1;
        }
        else {
            result = num2;
        }
        return result;
    }
    public static double try_double(int num1 , double num2){

        if(num1 > num2) {
            return num1;
        }
        else {
            return num2;
        }
    }
    public static void forloop(int num1 , double num2){

    }
    public static void main(String[] args) {
        int x = 1;
        int y = 10;
        double xd = 1.0;
        double yd = 10.0;

        System.out.print(MAX_int(x,y));// max static num
        System.out.print('\n');

        System.out.print(MIN_int(x,y));// min static num
        System.out.print('\n');

        System.out.print(MAX_double(xd,yd));
        System.out.print('\n');

        System.out.print(try_double(1,2.0));

        //System.out.print(printCalendar(4,2002));
    }
}
