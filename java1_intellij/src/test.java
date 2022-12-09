import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.io.File;
import java.io.IOException;
import java.io.File;
import java.lang.Math;
public class test {
    public static void main(String[] args) {

        float[] data = readFiles("C:\\Users\\clearlove7\\Documents\\GitHub\\WorkingJava\\java1_intellij\\src\\path\\test.txt");

        printEachInformation(data);
        System.out.println(Arrays.toString(data));
        System.out.print("the average of Degrees is : " + countAverageD(data));
        System.out.println();
        System.out.print("the average of humidity is " + countAverageH(data));

    }

    public static float[] readFiles(String file) {

        try {
            File f = new File(file);

            Scanner s = new Scanner(f);

            int ctr = 0;

            while (s.hasNextFloat()) {
                ctr++;
                s.nextFloat();
            }

            float[] arr = new float[ctr];
            Scanner s1 = new Scanner(f);

            for (int i = 0; i < arr.length; i++) {

                arr[i] = s1.nextFloat();

            }
            return arr;

        } catch (Exception e) {

            return null;
        }

    }

    public static void printEachInformation(float[] data) {
        int j = 0;

        for (int i = 0; i < data.length; i++) {

            j++;

            System.out.print(data[i] + " ");

            if (j == 4) {

                System.out.println();
                j = 0;
            }
        }
    }

    public static float countAverageD(float[] data) {
        int count = 0;

        float averageD = 0;

        for (int i = 2; i < data.length; i += 4) {
            count++;
            averageD += data[i];
        }
        float result = averageD / count;
        return result;
    }

    public static float countAverageH(float[] data) {
        float averageH = 0;
        int count = 0;
        for (int i = 3; i < data.length; i += 4) {
            count++;
            averageH += data[i];
        }
        float result = averageH / count;
        return result;
    }
}










