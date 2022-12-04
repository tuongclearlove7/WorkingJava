import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;
import javax.swing.*;
import java.io.*;
import javax.swing.JTextField;

interface METHOD{

    int HandleArray(char[][] character, int student, int RowKey);
    int CheckResult(char[][] character, int student, int RowKey);

}


public class GUI implements ActionListener, METHOD {

    public static final int ZeroPlayer = 0;

    public static final int One_Hundred = 100;

    private static JLabel LABEL_STUDENT;

   // private static JTextField user_input_student;
    private static JLabel LABEL_ROW;

    private static JFormattedTextField USER_INPUT_STUDENT;

    private static JFormattedTextField USER_INPUT_ROW;

    private static JLabel RESULT;


    public static Scanner input = new Scanner(System.in);

    @Override
    public int HandleArray(char[][] character, int student, int RowKey) {

        int c = 0;

        for (int i = 0; i < student; i++) {

            c++;

            RESULT.setText("\ndap an cua hoc sinh "+ c +" : ");

            for (int j = 0; j < RowKey; j++) {

                RESULT.setText(character[i][j] + " ");
            }
        }

        return 0;
    }

    @Override
    public int CheckResult(char[][] character, int student, int RowKey) {

        char[] key = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int n = key.length;
        int result = 0, score = 0;

        RESULT.setText("\ndap an : ");

        for(int i = 0; i< student; i++){

            RESULT.setText(key[i]+" ");
        }


        for (int i = 0; i < student; i++) {

            for (int j = 0; j < RowKey; j++) {

                if (character[i][j] == key[j]) {

                    result++;
                }
            }

            score++;
        }

        RESULT.setText("\n" + score+" hoc sinh " + "dung " + result + " dap an " + result + " diem");

        return  0;
    }

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
        RESULT.setText("Nhiet Do trung binh la : " + medium);
    }

    public static void medium_humidity(float[] humidity, int n,int count) {

        float sum = ZeroPlayer;
        float medium;

        for (int i = 4; i < n; i = i + 4) {

            sum = sum + humidity[i];
            count++;
        }

        medium = sum / count;
        RESULT.setText("\nDo am trung binh la : " + medium);
    }

    @Override
    public void actionPerformed(ActionEvent e){

        int student = (int) USER_INPUT_STUDENT.getValue();
        int row = (int) USER_INPUT_ROW.getValue();


        char[][] character = {
                { 'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                { 'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        };

        try {

                HandleArray(character, student, row);
                CheckResult(character, student, row);

            }
            catch (Exception err){

                System.out.println(err+"\nError");

            }

        finally {

                System.out.println("\nSuccessfully");
        }
    }

    public static void main(String[] args){

        JFrame my_gui = new JFrame("Algorithmn");
        JPanel panel = new JPanel();
        Font font = new Font("SansSerif", Font.BOLD, 16);
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\clearlove7\\Documents\\GitHub\\WorkingJava\\java1_intellij\\src\\logo\\Flizer.png");

        my_gui.setIconImage(icon);
        my_gui.setSize(800,250);
        my_gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        my_gui.setVisible(true);
        my_gui.add(panel);

        panel.setLayout(null);

        LABEL_STUDENT = new JLabel("Input student : ");
        LABEL_STUDENT.setBounds(10,10,100,30);
        panel.add(LABEL_STUDENT);

        LABEL_ROW = new JLabel("Input row : ");
        LABEL_ROW.setBounds(10,60,80,30);
        panel.add(LABEL_ROW);

        USER_INPUT_STUDENT = new JFormattedTextField();
        USER_INPUT_STUDENT.setValue(0);
        USER_INPUT_STUDENT.setBounds(100, 10, 165, 25);
        USER_INPUT_STUDENT.setFont(font);
        panel.add(USER_INPUT_STUDENT);

        USER_INPUT_ROW = new JFormattedTextField();
        USER_INPUT_ROW.setValue(10);
        USER_INPUT_ROW.setBounds(100,60,165, 25);
        USER_INPUT_ROW.setFont(font);
        panel.add(USER_INPUT_ROW);

        JButton BUTTON = new JButton("Result");
        BUTTON.setBounds(10, 120, 80, 25);
        BUTTON.addActionListener(new GUI());
        panel.add(BUTTON);

        JButton BUTTON2 = new JButton("Result");
        BUTTON2.setBounds(110, 120, 80, 25);
        panel.add(BUTTON2);

        ActionListener listener2 = new Clicked();
        BUTTON2.addActionListener(listener2);

        RESULT = new JLabel("");
        RESULT.setBounds(10, 130, 300, 100);
        panel.add(RESULT);

        my_gui.setVisible(true);


    }
}
