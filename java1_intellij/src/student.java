import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;
public class student {

    public static Scanner input = new Scanner(System.in);
    public static void HandleArray(char[][] character, int student, int RowKey) {

        /*
        for (int i = 0; i < student; i++) {
            for (int j = 0; j < RowKey; j++) {
                       System.out.print("nhap dap an cot [" + i + "][" + j + "]= ");
                       character[i][j] = input.next().charAt(0);
            }
        }
        */
        int c = 0;
        for (int i = 0; i < student; i++) {
            c++;
            System.out.print("\ndap an cua hoc sinh "+ c +" : ");
            for (int j = 0; j < RowKey; j++) {
                System.out.print(character[i][j] + " ");
            }
        }
    }

    public static int CheckResult(char[][] character, int student, int RowKey) {

        char[] key = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int n = key.length;
        int result = 0, score = 0;

        System.out.print("\ndap an : ");
        for(int i = 0; i< student; i++){
            System.out.print(key[i]+" ");
        }

        for (int i = 0; i < student; i++) {
            for (int j = 0; j < RowKey; j++) {
                if (character[i][j] == key[j]) {
                    result++;
                }
            }
            score++;
        }
        System.out.println("\n" + score+" hoc sinh " + "dung " + result + " dap an " + result + " diem");
        return  0;
    }

    public static void main(String[] args) {

        char[][] array = {
                { 'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                { 'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        };
        int student = 8;
        int RowKey = 10;
        HandleArray(array, student, RowKey);
        CheckResult(array, student, RowKey);
    }
}
