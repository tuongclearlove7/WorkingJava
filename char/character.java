import java.util.Scanner;

public class mychar {

    public static void main(String[] args) {

        int n = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Input : ");
        String str = input.nextLine();

        char chr = str.charAt(n);

        System.out.print("ky tu nhap vao la "+chr);

    }
}
