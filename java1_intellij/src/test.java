import java.util.Scanner;
import java.text.DecimalFormat;

public class test {
    public static void main(String[] args) {

        inheritance porsche =  new inheritance();
        inheritance holden = new inheritance();

        porsche.setmodel("tuong");
        System.out.println("model is : " + porsche.getModel());

        holden.setmodel("dat");
        System.out.println("model is : " + holden.getModel());
    }
}











