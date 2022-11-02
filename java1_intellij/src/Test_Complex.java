import java.util.Scanner;
import java.text.DecimalFormat;

public class Test_Complex {

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


        Complex complex1 = new Complex();
        Complex complex2 = new Complex();
        Complex TotalComplex = new Complex();
        Complex SubComplex = new Complex();
        Complex MultiComplex = new Complex();
        Complex DivisionComplex = new Complex();

        complex1.ComplexInput(5,6);
        complex2.ComplexInput(3,4);

        System.out.print("So phuc 1 la:");
        complex1.ShowComplex();
        System.out.print("So phuc 2 la:");
        complex2.ShowComplex();

        TotalComplex = complex1.ComplexTotal(complex2);
        System.out.print("Ket qua cua phep cong complex1 cho complex2 la : ");
        TotalComplex.ShowComplex();

        SubComplex = complex1.ComplexSubtraction(complex2);
        System.out.print("Ket qua cua phep tru complex1 cho complex2 la : ");
        SubComplex.ShowComplex();

        MultiComplex = complex1.ComplexMulti(complex2);
        System.out.print("Ket qua cua phep nhan complex1 cho complex2 la : ");
        MultiComplex.ShowComplex();

        DivisionComplex = complex1.ComplexDivision(complex2);
        System.out.print("Ket qua cua phep chia complex1 cho complex2 la : ");
        DivisionComplex.ShowComplex();

    }
}
