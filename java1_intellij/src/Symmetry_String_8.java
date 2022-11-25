import java.util.Stack;
import java.util.Scanner;

public class Symmetry_String_8 {
    public static Scanner input = new Scanner(System.in);
    public static boolean checkSym_String(String str) {
        Stack stack = new Stack();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        String reverseString = "";
        while (!stack.isEmpty()) {
            reverseString = reverseString + stack.pop();
        }
        if (str.equals(reverseString)) {
            return true;
        } else {
            return false;
        }

    }

    public static void checkSym(String str) {
        if (checkSym_String(str) == true) {
            System.out.println(str + " la chuoi doi xung : ");
        } else {
            System.out.println(str +" khong phai la chuoi doi xung ");
        }
    }

    public static void main(String[] args) {

        System.out.println("nhap vao chuoi : ");
        String str = input.nextLine();
        checkSym(str);

    }
}
