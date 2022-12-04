import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class pratice_CheckMedium_11 {

    public static Scanner input = new Scanner(System.in);

    public static void InputMArray(int arr[][],int n) {

        n = arr.length;
        for (int i = 0; i < n; i++){

            for (int j = 0; j < n; j++){

                System.out.print("arr[" + i + "][" + j + "] = ");
                arr[i][j] = input.nextInt();
            }
        }
    }
    public static void OutputMArray(String arr[][],int n) {

        n = arr.length;
        int Outline = 0;

        for (int i = 0; i < n; i++){

            for (int j = 0; j < n; j++){

                System.out.print(arr[i][j]+" ");
                Outline++;

                if (Outline == 6) {

                    System.out.print("\n");
                    Outline = 0;

                }
            }
        }
    }


    public static void main(String args[]) {

        String Data[][] = {

                {"Tỉnh Thành", "\t2 triệu", "\t1 triệu","\t3 triệu","\t4 triệu","\t5 triệu"},
                {"Hà Nội\t", "\t2 000 000", "\t1 000 000","\t3 000 000","\t4 000 000","\t5 000 000"},
                {"Hải Phòng", "\t2 000 000", "\t1 000 000","\t3 000 000","\t4 000 000","\t5 000 000"},
                {"Đà Nẵng", "\t2 000 000", "\t1 000 000","\t3 000 000","\t4 000 000","\t5 000 000"},
                {"Nam Định", "\t2 000 000", "\t1 000 000","\t3 000 000","\t4 000 000","\t5 000 000"},
                {"Đak Lak", "\t2 000 000", "\t1 000 000","\t3 000 000","\t4 000 000","\t5 000 000"},

        };

        OutputMArray(Data,Data.length);

    }
}


















