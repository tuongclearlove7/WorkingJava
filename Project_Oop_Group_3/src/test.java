import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JTextField;

public class test {

    public static JLabel LABEL_COLUMN = new JLabel();

    public static JLabel LABEL_STUDENT = new JLabel();

    public static JLabel LABEL_INPUT = new JLabel();

    public static JFormattedTextField USER_INPUT_COLUMN =  new JFormattedTextField();

    public static JFormattedTextField USER_INPUT_STUDENT =  new JFormattedTextField();

    public static JTextField RESULT = new JTextField();

    public static JFrame SCREEN = new JFrame("GUI");

    public static JPanel PANEL = new JPanel();


    public static void test() {

        SCREEN.setSize(250,250);
        SCREEN.setDefaultCloseOperation(SCREEN.EXIT_ON_CLOSE);
        SCREEN.add(PANEL);
        PANEL.setLayout(null);


        JButton BUTTON4 = new JButton("Practice7");
        BUTTON4.setBounds(60, 30, 100, 25);
        BUTTON4.setForeground(Color.cyan);
        BUTTON4.setBackground(new Color(50, 50, 50));
        ActionListener listener4 = new PRATICE7();
        BUTTON4.addActionListener(listener4);
        PANEL.add(BUTTON4);

        SCREEN.setVisible(true);

    }

    public static void main(String[] args)  {

        test();

    }
}

class PRATICE7 implements ActionListener {

    private void thuat_toan(int student, int column){

        System.out.println("student is : " + student);
        System.out.println("column is : " + column);

        test.RESULT.setText("student is : " + student + ", column is : " + column);

    }


    @Override
    public void actionPerformed(ActionEvent e) {// method() hàm xử lý nút bấm


        EventQueue.invokeLater(new Runnable() {
            public void run() {

                JFrame SCREEN = new JFrame();
                JPanel panel = new JPanel();
                SCREEN.setTitle("Practice1");
                SCREEN.setVisible(true);
                SCREEN.setSize(500, 300);
                SCREEN.add(panel);
                panel.setLayout(null);

                test.LABEL_STUDENT = new JLabel("Student");// label student
                test.LABEL_STUDENT.setBounds(120, 20, 100, 25);
                test.LABEL_STUDENT.setForeground(Color.red);
                panel.add(test.LABEL_STUDENT);

                test.LABEL_COLUMN = new JLabel("Column");// label column
                test.LABEL_COLUMN.setBounds(300, 20, 100, 25);
                test.LABEL_COLUMN.setForeground(Color.red);
                panel.add(test.LABEL_COLUMN);

                test.LABEL_INPUT = new JLabel("Input : ");// label chữ input
                test.LABEL_INPUT.setBounds(30, 50, 100, 25);
                test.LABEL_INPUT.setForeground(new Color(21, 160, 153));
                panel.add(test.LABEL_INPUT);

                test.USER_INPUT_STUDENT = new JFormattedTextField(); // ô nhập cho người dùng student
                test.USER_INPUT_STUDENT.setValue(0);
                test.USER_INPUT_STUDENT.setBounds(120, 50, 165, 25);
                panel.add(test.USER_INPUT_STUDENT);

                test.USER_INPUT_COLUMN = new JFormattedTextField();// ô nhập cho người dùng column
                test.USER_INPUT_COLUMN.setValue(0);
                test.USER_INPUT_COLUMN.setBounds(300, 50, 165, 25);
                panel.add(test.USER_INPUT_COLUMN);

                test.RESULT = new JTextField("Practice 1: Tính điểm câu hỏi trắc nghiệm của học sinh");// ô output
                test.RESULT.setBounds(120, 100, 345, 150);
                test.RESULT.setForeground(Color.red);
                panel.add(test.RESULT);

                JButton BUTTON = new JButton("Result");// nút bấm
                BUTTON.setBounds( 10, 130, 100, 30);
                BUTTON.setForeground(Color.cyan);
                BUTTON.setBackground(new Color(50, 50, 50));
                panel.add(BUTTON);
                BUTTON.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent event) {// method() hàm xử lý nút bấm


                        int student = (int) test.USER_INPUT_STUDENT.getValue();

                        int column = (int) test.USER_INPUT_COLUMN.getValue();

                        thuat_toan(student, column);


                    }
                });
            }
        });
    }
}

