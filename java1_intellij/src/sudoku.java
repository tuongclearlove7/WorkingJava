import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class sudoku {

    public static void OutputMArray(int arr[][],int n) {

        int Outline = 0;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(arr[i][j] + "  ");
                Outline++;
                if (Outline == 9) {
                    System.out.print("\n");
                    Outline = 0;
                }
            }
        }
    }
    public static int ShowStaticArray(){

        Scanner input = new Scanner(System.in);
        int n = 9;
        int[][] matrix = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {1, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9},
        };

        OutputMArray(matrix, n);
        return 0;
    }

    public static void main(String args[]) {

        ShowStaticArray();

    }

}
