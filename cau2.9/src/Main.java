import java.util.Scanner;


public class Main {

    public static Scanner input = new Scanner(System.in);

    private static int COLOR = 45555;


    public static void main(String[] args){

        MyColor color = new MyColor(COLOR);
        color.Output();

        Point A = new Point(1.5,2);
        Point B = new Point(3,4);
        Triangle triangle = new Triangle(5,2,3,4,5,6,COLOR);

        System.out.println("Toa diem A la : \n" + A.toString());
        System.out.println("Toa diem B la : \n" + B.toString());
        System.out.println("tinh tien 2 diem A va B la: " + A.distance(B));
        System.out.println(triangle);

        triangle.Output();

    }
}
