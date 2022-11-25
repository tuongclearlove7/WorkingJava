import java.util.Scanner;

public class Count_Number_10 {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Nhap n : ");
        int n = input.nextInt();
        int count = 0;
        

        while (n != 0) {


            n = n / 10;
            count++;
        }


        System.out.println("n co " + count + " chu so");
    }
}
