import java.io.FileNotFoundException;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.io.File;
import java.io.IOException;
import java.io.File;

public class OXY {
    
    public static final int ZeroPlayer = 0;
    public static final int One_Hundred = 100;
    public static Scanner input = new Scanner(System.in);
    public static void F_Array(float[] FloatArray, float[] x, int n, float[] y) {

        for (int a = 1; a <= n; a = a + 2) {

            x[a] = FloatArray[a];
        }
        for (int b = 2; b <= n; b = b + 2) {

            y[b] = FloatArray[b];
        }

        System.out.println("x\t\ty\n_________");
        for (int i = 1; i < n; i = i + 2) {

            int pos = i + 1;
            System.out.println((int) x[i] + "\t\t" + (int) y[pos] );
        }

        double MaxX = x[0];
        double MaxY = y[0];

        for (double numx: x) {

            if(MaxX < numx)
            MaxX = numx;
        }
        for (double numy: y) {

            if(MaxY < numy)
            MaxY = numy;
        }

        double MinX = x[0];
        double MinY = y[0];

        for (double numx: x) {

            if(MinX > numx)

                MinX = numx;
        }
        for (double numy: y) {

            if(MinY > numy)

                MinY = numy;
        }

        System.out.printf("\nmax = %.2f", MaxX);
        System.out.printf(", ");
        System.out.printf("%.2f", MaxY);

        System.out.printf("\nmin = %.2f", MinX);
        System.out.printf(", ");
        System.out.printf("%.2f", MinY);
    }



    public static void main(String[] args) {

        try {

            File file = new File("C:\\Users\\clearlove7\\Documents\\GitHub\\WorkingJava\\java1_intellij\\src\\path\\oxy.txt");
            Scanner R_File = new Scanner(file);
            float[] FloatArray = new float[One_Hundred];
            float[] x = new float[One_Hundred];
            float[] y = new float[One_Hundred];
            int n = ZeroPlayer , count = ZeroPlayer, i = ZeroPlayer;

            while (R_File.hasNextFloat()) {

                float number = R_File.nextFloat();
                i++;

                FloatArray[i] = number;
                n++;
            }

            F_Array(FloatArray, x, n, y);
        }

        catch (FileNotFoundException e) {

            System.out.println("Error, can't read file");
            e.printStackTrace();
        }

    }
}
