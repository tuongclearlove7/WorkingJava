import java.util.Scanner;

public class WordEncode_6 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Nhap chuoi ma hoa : ");
        String str = input.nextLine();
        String[] str1 = new String[100];
        int b;
        int h = 0;
        char g;

        for (int i = 0; i < str.length(); i++) {
            b = str.charAt(i);
            if (b >= 'a' && b <= 'z') {
                b = b - 97;
                b = b + 5;
                b = b % 26;
                b = b + 97;
                g = (char) (b - 32);
                str1[i] = g + "";
                h++;
            } else if (b >= 'A' && b <= 'Z') {
                b = b - 65;
                b = b + 5;
                b = b % 26;
                b = b + 65;
                g = (char) b;
                str1[i] = g + "";
                h++;
            } else if (b == -65) {
                str1[i] = " ";
                h++;
            }
        }

        System.out.print("Chuoi sau khi ma hoa la : ");
        for (int j = 0; j < h; j++) {
            System.out.print(str1[j]);
        }
        System.out.print("\n");

    }
}
