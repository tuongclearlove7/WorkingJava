import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.security.Security;
import java.util.Arrays;
import java.util.Scanner;


interface METHOD{

}
class Handle_Button_Event_1  implements ActionListener, METHOD {


    public static void checkAnswer(char[][] array, char[] arrayCheck) {

        int count = 0, student = 0;
        String str = "";

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j] == arrayCheck[j]) {

                    count++;
                }
            }

            student++;

            str  = str + "student " + student + " correct " + count + " answer\n";
            System.out.println(str);
            count = 0;
        }

        GUI.RESULT.setText(str);


    }

    @Override
    public void actionPerformed(ActionEvent e) {


        EventQueue.invokeLater(new Runnable() {
            public void run() {

                JFrame SCREEN = new JFrame();
                JPanel panel = new JPanel();
                Image icon = Toolkit.getDefaultToolkit().getImage(GUI.PATH_ICON);

                SCREEN.setIconImage(icon);
                SCREEN.setTitle("Practice1");
                SCREEN.setVisible(true);
                SCREEN.setSize(500, 250);
                SCREEN.add(panel);
                panel.setLayout(null);

                GUI.LABEL_STUDENT = new JLabel("Student");
                GUI.LABEL_STUDENT.setBounds(120, 20, 100, 25);
                GUI.LABEL_STUDENT.setForeground(Color.red);
                panel.add(GUI.LABEL_STUDENT);

                GUI.LABEL_COLUMN = new JLabel("Column");
                GUI.LABEL_COLUMN.setBounds(300, 20, 100, 25);
                GUI.LABEL_COLUMN.setForeground(Color.red);
                panel.add(GUI.LABEL_COLUMN);

                GUI.LABEL_INPUT = new JLabel("Input : ");
                GUI.LABEL_INPUT.setBounds(30, 50, 100, 25);
                GUI.LABEL_INPUT.setForeground(new Color(21, 160, 153));
                panel.add(GUI.LABEL_INPUT);

                GUI.USER_INPUT_STUDENT = new JFormattedTextField();
                GUI.USER_INPUT_STUDENT.setValue(0);
                GUI.USER_INPUT_STUDENT.setBounds(120, 50, 165, 25);
                panel.add(GUI.USER_INPUT_STUDENT);

                GUI.USER_INPUT_ROW = new JFormattedTextField();
                GUI.USER_INPUT_ROW.setValue(0);
                GUI.USER_INPUT_ROW.setBounds(300, 50, 165, 25);
                panel.add(GUI.USER_INPUT_ROW);

                GUI.RESULT = new JTextField("Practice 1: Tính điểm câu hỏi trắc nghiệm của học sinh");
                GUI.RESULT.setBounds(120, 100, 345, 100);
                GUI.RESULT.setForeground(Color.red);
                panel.add(GUI.RESULT);

                JButton BUTTON = new JButton("Result");
                BUTTON.setBounds( 10, 130, 100, 30);
                BUTTON.setForeground(Color.cyan);
                BUTTON.setBackground(new Color(50, 50, 50));
                panel.add(BUTTON);
                BUTTON.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent event) {

                        char[][] array = {

                                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
                        };
                        char[] arrayCheck = { 'D','B','D','C','C','D','A','E','A','D'};

                        int student = (int) GUI.USER_INPUT_STUDENT.getValue();

                        int row = (int) GUI.USER_INPUT_ROW.getValue();

                        try {

                           // HandleArray(array, student, row);
                           // CheckResult(array, student, row);
                            checkAnswer(array,arrayCheck);

                        } catch (Exception ERROR) {

                            if (student > 8) {

                                GUI.RESULT.setText("sai roi ban phai nhap vao fieldtext student so nguyen be hon < 9");
                            }

                            else if (row > 10) {

                                GUI.RESULT.setText("sai roi ban phai nhap vao fieldtext row so nguyen be hon < 11");
                            }
                        }
                    }
                });
            }
        });
    }
}