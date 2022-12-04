import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Pratice_Convert_BaseNum_19 {

    public static void ConvertBaseNumbers(int n,int base){

        if(n>=base)
            ConvertBaseNumbers(n / base, base);

        if(n % base > 9)
            System.out.printf("%c",n%base + 55);

        else
            System.out.print((n % base));
    }
    public static int InputNumbers(){

        Scanner input = new Scanner(System.in);
        boolean check= false;
        int n=1;

        while(!check){

            try{

                n = input.nextInt();
                check= true;

            }catch(Exception e){

                System.out.println("Ban phai nhap so! hay nhap lai...");
                input.nextLine();
            }
        }

        return (n);
    }

    public static void main(String[] args) {

        System.out.print("Nhap n : ");
        int n = InputNumbers();

        System.out.print("Nhap vao co so can chuyen sang b : ");
        int b = InputNumbers();
        System.out.print("So " +n+ " chuyen sang co so " + b + " la : ");

        ConvertBaseNumbers(n,b);

    }
}



















