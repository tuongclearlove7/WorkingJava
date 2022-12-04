import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

interface METHOD2{

}
class Handle_Button_Event_2 implements ActionListener, METHOD2{

    public int F_Array(float[] FloatArray, float[] day, int n, float[] hour, float[] temperature, float[] humidity) {

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

        //System.out.println("Ngay\tGio\t\tNhietdo\t\tDoAm");

        for (int i = 1; i < n; i = i + 4) {

            int time = i + 1;
            int temp = time + 1;
            int h = temp + 1;

           // System.out.println((int) day[i] + "\t\t" + (int) hour[time] + "\t\t" + temperature[temp] + "\t\t" + humidity[h]);
        }

        return 0;
    }


    public int medium_temperature(float[] temperature, int n, int count) {

        float sum = GUI.ZeroPlayer;
        float medium;

        for (int i = 3; i < n; i = i + 4) {

            sum = sum + temperature[i];
            count++;
        }

        medium = sum / count;
        GUI.RESULT.setText("Nhiet Do trung binh la : " + medium);

        return 0;
    }

    public  int medium_humidity(float[] humidity, int n, int count) {

        float sum = GUI.ZeroPlayer;
        float medium;

        for (int i = 4; i < n; i = i + 4) {

            sum = sum + humidity[i];
            count++;
        }

        medium = sum / count;
        GUI.RESULT.setText("\nDo am trung binh la : " + medium);

        return 0;
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        try {

            File file = new File("C:\\Users\\clearlove7\\Documents\\GitHub\\WorkingJava\\java1_intellij\\src\\path\\test.txt");
            Scanner R_File = new Scanner(file);

            float[] FloatArray = new float[100];
            float[] day = new float[100];
            float[] hour = new float[100];
            float[] temperature = new float[100];
            float[] humidity = new float[100];
            int n = 0 , count = 0, i = 0;

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
