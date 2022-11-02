import java.util.Scanner;
import java.text.DecimalFormat;

public class construct extends demo{

    demo a = new demo();
    demo b = new demo();
    String assign;

    Scanner input = new Scanner(System.in);
    void Input(){
        System.out.print("Nhap diem A : ");
        a.nhapToaDo(input);
        System.out.print("Nhap diem B : ");
        b.nhapToaDo(input);

    }

    void Output(){

        assign = a.toString();
        System.out.println("Modul diem A = " + assign);
        assign = b.toString();
        System.out.println("Modul diem B = " + assign);
    }

    public static void main(String[] args) {
        construct x = new construct();
        x.Input();
        x.Output();
    }
}







