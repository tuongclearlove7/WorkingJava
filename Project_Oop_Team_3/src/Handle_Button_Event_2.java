import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


class Handle_Button_Event_2 implements ActionListener{

    GUI CONST = new GUI();
    @Override
    public void actionPerformed(ActionEvent event) {

        EventQueue.invokeLater(new Runnable() {

            public void run() {

                JFrame SCREEN = new JFrame();
                JPanel panel = new JPanel();
                GUI.ICON = Toolkit.getDefaultToolkit().getImage(GUI.PATH_ICON);
                SCREEN.setIconImage(GUI.ICON);
                SCREEN.setTitle("Practice3");
                SCREEN.setVisible(true);
                SCREEN.setSize(500, 250);
                SCREEN.add(panel);
                panel.setLayout(null);

                GUI.LABEL_INPUT = new JLabel("Path file : ");
                GUI.LABEL_INPUT.setBounds(30, 50, 100, 25);
                GUI.LABEL_INPUT.setForeground(new Color(21, 160, 153));
                panel.add(GUI.LABEL_INPUT);

                GUI.USER_INPUT_STR = new JTextField();
                GUI.USER_INPUT_STR.setText(GUI.PATH);
                GUI.USER_INPUT_STR.setBounds(120, 50, 345, 25);
                panel.add(GUI.USER_INPUT_STR);

                GUI.LINE = new JTextArea("Practice 3: Thông tin thời tiết");
                GUI.LINE.setBounds(120, 100, 345, 100);
                GUI.LINE.setForeground(Color.red);
                panel.add(GUI.LINE);

                JButton BUTTON = new JButton("Output");
                BUTTON.setBounds( 10, 130, 100, 30);
                BUTTON.setForeground(Color.cyan);
                BUTTON.setBackground(new Color(50, 50, 50));
                panel.add(BUTTON);
                BUTTON.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent event) {

                        float[] data = readFiles(GUI.PATH);

                        printEachInformation(data);

                        GUI.LINE.setText("The average of Degrees is : " + countAverageD(data) +
                                         "\nThe average of humidity is " + countAverageH(data));

                        System.out.print("The average of Degrees is : " + countAverageD(data) +
                                       "\nThe average of humidity is " + countAverageH(data));
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
                });
            }
        });
    }
}
