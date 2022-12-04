import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Clicked implements ActionListener {

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

            GUI.F_Array(FloatArray, day, n, hour, temperature, humidity);
            GUI.medium_temperature(temperature, n, count);
            GUI.medium_humidity(humidity, n, count);

        }
        catch (FileNotFoundException e) {

            System.out.println("Error, can't read file");

            e.printStackTrace();
        }
    }
}
