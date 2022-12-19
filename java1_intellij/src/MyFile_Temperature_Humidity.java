import java.io.FileNotFoundException;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.io.File;
import java.io.IOException;
import java.io.File;

public class MyFile_Temperature_Humidity {

        public static final int ZeroPlayer = 0;
        public static final int One_Hundred = 100;

        public static Scanner input = new Scanner(System.in);
        
        public static void F_Array(float[] FloatArray, float[] day, int n, float[] hour, float[] temperature, float[] humidity) {

            for (int a = 1; a <= n; a = a + 4) {

                day[a] = FloatArray[a];
            }
            for (int b = 2; b <= n; b = b + 4) {

                hour[b] = FloatArray[b];
            }
            for (int c = 3; c <= n; c = c + 4) {

                temperature[c] = FloatArray[c];
            }
            for (int d = 4; d <= n; d = d + 4) {

                humidity[d] = FloatArray[d];
            }

            System.out.println("Ngay\tGio\t\tNhietdo\t\tDoAm");

            for (int i = 1; i < n; i = i + 4) {

                int time = i + 1;
                int temp = time + 1;
                int h = temp + 1;

                System.out.println((int) day[i] + "\t\t" + (int) hour[time] + "\t\t" + temperature[temp] + "\t\t" + humidity[h]);
            }
        }

        public static void medium_temperature(float[] temperature, int n, int count) {

            float sum = ZeroPlayer;
            float medium;

            for (int i = 3; i < n; i = i + 4) {

                sum = sum + temperature[i];
                count++;
            }

            medium = sum / count;
            System.out.print("Nhiet Do trung binh la : " + medium);
        }

        public static void medium_humidity(float[] humidity, int n,int count) {

            float sum = ZeroPlayer;
            float medium;

            for (int i = 4; i < n; i = i + 4) {

                sum = sum + humidity[i];
                count++;
            }

            medium = sum / count;
            System.out.print("\nDo am trung binh la : " + medium);
        }

        public static void main(String[] args) {

            try {

                File file = new File("C:\\Users\\clearlove7\\Documents\\GitHub\\WorkingJava\\java1_intellij\\src\\path\\test.txt");
                Scanner R_File = new Scanner(file);

                float[] FloatArray = new float[One_Hundred];
                float[] day = new float[One_Hundred];
                float[] hour = new float[One_Hundred];
                float[] temperature = new float[One_Hundred];
                float[] humidity = new float[One_Hundred];
                int n = ZeroPlayer , count = ZeroPlayer, i = ZeroPlayer;

                while (R_File.hasNextFloat()) {

                    float number = R_File.nextFloat();

                    i++;
                    FloatArray[i] = number;
                    n++;
                }

                F_Array(FloatArray, day, n, hour, temperature, humidity);
                medium_temperature(temperature, n, count);
                medium_humidity(humidity, n, count);

            }
            catch (FileNotFoundException e) {

                System.out.println("Error, can't read file");

                e.printStackTrace();
        }
    }
}
