import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Practice3  implements ActionListener{

    protected JTextField input_str;

    @Override
    public void actionPerformed(ActionEvent event) {

        EventQueue.invokeLater(new Runnable() {

            public void run() {

                JPanel panel = new JPanel();
                JFrame window = new JFrame();
                window.setTitle("Practice3");
                window.setSize(500, 300);
                window.add(panel);
                App.text_input = new JLabel("Duong dan");
                App.text_input.setBounds(30, 50, 100, 25);
                input_str = new JTextField();
                input_str.setText("C:\\Users\\clearlove7\\Documents\\GitHub\\WorkingJava\\Project_Oop_Team_3\\src\\File_Text\\test.txt");
                input_str.setBounds(120, 50, 250, 25);
                App.outline = new JTextArea();
                App.outline.setBounds(70, 150, 345, 100);
                JButton button = new JButton("Output");
                button.setBounds( 200, 100, 100, 30);
                button.setForeground(Color.white);
                button.setBackground(new Color(50, 50, 50));
                panel.add(App.text_input);
                panel.add(input_str);
                panel.add(App.outline);
                panel.add(button);
                panel.setLayout(null);
                window.setVisible(true);


                button.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent event) {

                        try {
                            File file = new File("C:\\Users\\clearlove7\\Documents\\GitHub\\WorkingJava\\Project_Oop_Team_3\\src\\File_Text\\test.txt");
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
                            Weather_Array(FloatArray, day, n, hour, temperature, humidity);
                            Weather_infomation(temperature,humidity, n, count);

                        }
                        catch (FileNotFoundException e) {

                            e.printStackTrace();
                        }
                    }

                    public static void Weather_Array(float[] FloatArray, float[] day, int n, float[] hour, float[] temperature, float[] humidity) {

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

                        for (int i = 1; i < n; i = i + 4) {
                            int time = i + 1;
                            int temp = time + 1;
                            int h = temp + 1;
                            System.out.println((int) day[i] + "\t\t" + (int) hour[time] + "\t\t" + temperature[temp] + "\t\t" + humidity[h]);
                        }
                    }

                    public static void Weather_infomation(float[] temperature,float[] humidity, int n, int count) {

                        float sum1 = 0;
                        float medium1;
                        float sum2 = 0;
                        float medium2;

                        for (int i = 3; i < n; i = i + 4) {
                            sum1 = sum1 + temperature[i];
                            count++;
                        }
                        for (int i = 4; i < n; i = i + 4) {
                            sum2 = sum2 + humidity[i];
                            count++;
                        }

                        medium1 = sum1 / count;
                        medium2 = sum2 / count;
                        App.outline.setText("\nĐộ ẩm trung bình : " + medium1 + "\nNhiệt độ trung bình : " + medium2);
                    }
                });
            }
        });
    }
}