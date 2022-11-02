import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;
public class student {

    public static Scanner input = new Scanner(System.in);
    public static void HandleArray(char[][] character, int student, int RowKey) {

        //for (int i = 0; i < student; i++) {
          //  for (int j = 0; j < RowKey; j++) {
                       // System.out.print("nhap dap an cot [" + i + "][" + j + "]= ");
                        //character[i][j] = input.next().charAt(0);

         //   }
       // }
        System.out.print("De : ");
        for (int i = 0; i < student; i++) {
            for (int j = 0; j < RowKey; j++) {
                System.out.print(character[i][j] + " ");
            }
        }
    }
    public static void OputArray(char[][] array, int student, int RowKey) {
        System.out.print("\ndap an cua hoc sinh : ");
        for (int i = 0; i < student; i++) {
            for (int j = 0; j < RowKey; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }
    public static int CheckResult(char[][] character, int student, int RowKey) {

        char[] key = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int n = key.length;
        int result = 0, score = 0;

        for (int i = 0; i < student; i++) {
            for (int j = 0; j < RowKey; j++) {
                if (character[i][j] == key[j]) {
                    result++;
                }
            }
            score++;
        }
        System.out.println("\nhoc sinh " + score + " dung " + result + " dap an " + result + " diem");
        return  0;
    }

    public static void main(String[] args) {

        char[][] array = {{ 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'}};
        int student = 1;
        int RowKey = 10;
        HandleArray(array, student, RowKey);
        OputArray(array, student, RowKey);
        CheckResult(array, student, RowKey);
    }
}
