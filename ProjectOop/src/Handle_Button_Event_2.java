import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

interface METHOD2{

}
class Handle_Button_Event_2 implements ActionListener, METHOD2{

    GUI CONST = new GUI();

    private int Weather(float[] FloatArray , int n , float day[], float hour[],float[] temperature, float[] humidity) {

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

        }

        float sum1 = CONST.ZeroPlayer;
        float medium1;
        float sum2 = CONST.ZeroPlayer;
        float medium2;
        int count1 = 0;
        int count2 = 0;

        for (int idx1 = 3; idx1 < n; idx1 = idx1 + 4) {

            sum1 = sum1 + temperature[idx1];
            count1++;
        }

        for (int idx2 = 4; idx2 < n; idx2 = idx2 + 4) {

            sum2 = sum2 + humidity[idx2];
            count2++;
        }

        medium1 = sum1 / count1;
        medium2 = sum2 / count2;
        GUI.RESULT.setText("Nhiet Do trung binh la : " + medium1 + "\n" + " Do am trung binh la :"  + medium2);

        return 0;
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        EventQueue.invokeLater(new Runnable()
        {
            public void run() {

                JFrame SCREEN = new JFrame();
                JPanel panel = new JPanel();
                Image icon = Toolkit.getDefaultToolkit().getImage(GUI.PATH_ICON);

                SCREEN.setIconImage(icon);
                SCREEN.setTitle("Practice3");
                SCREEN.setVisible(true);
                SCREEN.setSize(500, 250);
                SCREEN.add(panel);
                panel.setLayout(null);

                GUI.LABEL_INPUT = new JLabel("Input : ");
                GUI.LABEL_INPUT.setBounds(30, 50, 100, 25);
                GUI.LABEL_INPUT.setForeground(new Color(21, 160, 153));
                panel.add(GUI.LABEL_INPUT);

                GUI.USER_INPUT_STR = new JTextField();
                GUI.USER_INPUT_STR.setText(GUI.PATH);
                GUI.USER_INPUT_STR.setBounds(120, 50, 345, 25);
                panel.add(GUI.USER_INPUT_STR);

                GUI.RESULT = new JTextField("Practice 3: Thông tin thời tiết");
                GUI.RESULT.setBounds(120, 100, 345, 100);
                GUI.RESULT.setForeground(Color.red);
                panel.add(GUI.RESULT);

                JButton BUTTON = new JButton("Result");
                BUTTON.setBounds( 10, 130, 100, 30);
                BUTTON.setForeground(Color.cyan);
                BUTTON.setBackground(new Color(50, 50, 50));
                panel.add(BUTTON);
                BUTTON.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent event)
                    {
                        try {

                            File file = new File(GUI.PATH);
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

                            Weather(FloatArray, n,day,hour, temperature, humidity);

                        }
                        catch (FileNotFoundException e) {

                            System.out.println("Error, can't read file");

                            e.printStackTrace();
                        }
                    }
                });
            }
        });
    }
}
