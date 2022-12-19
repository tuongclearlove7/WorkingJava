import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.security.Security;
import java.util.Arrays;
import java.util.Scanner;



    class Handle_Button_Event_1  implements ActionListener {

        private static final char[][] CHARACTER = {

                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        };

        private static final char[] KEY = {

                'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'
        };

        @Override
        public void actionPerformed(ActionEvent e) {


            EventQueue.invokeLater(new Runnable() {
                public void run() {

                    JFrame SCREEN = new JFrame();
                    JPanel panel = new JPanel();
                    GUI.ICON = Toolkit.getDefaultToolkit().getImage(GUI.PATH_ICON);
                    SCREEN.setIconImage(GUI.ICON);
                    SCREEN.setTitle("Practice1");
                    SCREEN.setVisible(true);
                    SCREEN.setSize(500, 300);
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

                    GUI.USER_INPUT_COLUMN = new JFormattedTextField();
                    GUI.USER_INPUT_COLUMN.setValue(0);
                    GUI.USER_INPUT_COLUMN.setBounds(300, 50, 165, 25);
                    panel.add(GUI.USER_INPUT_COLUMN);

                    GUI.LINE = new JTextArea("Practice 1: Tính điểm câu hỏi trắc nghiệm của học sinh");
                    GUI.LINE.setBounds(120, 100, 345, 150);
                    GUI.LINE.setForeground(Color.red);
                    panel.add(GUI.LINE);

                    JButton BUTTON = new JButton("Output");
                    BUTTON.setBounds( 10, 130, 100, 30);
                    BUTTON.setForeground(Color.cyan);
                    BUTTON.setBackground(new Color(50, 50, 50));
                    panel.add(BUTTON);
                    BUTTON.addActionListener(new ActionListener() {

                        public void actionPerformed(ActionEvent event) {


                            int student = (int) GUI.USER_INPUT_STUDENT.getValue();

                            int column = (int) GUI.USER_INPUT_COLUMN.getValue();

                            try {

                                CheckResult(CHARACTER,student,column);

                                if(student == 0 || column == 0){

                                    GUI.LINE.setText("vui long nhap so nguyen lon hon  > " + GUI.ZeroPlayer);
                                }

                            } catch (Exception ERROR) {

                                if (student > 8) {

                                    GUI.LINE.setText("sai roi ban phai nhap vao fieldtext student so nguyen be hon < 9");
                                }

                                else if (column > 10) {

                                    GUI.LINE.setText("sai roi ban phai nhap vao fieldtext row so nguyen be hon < 11");
                                }
                            }
                        }

                        public static int CheckResult(char[][] character, int student, int column) {

                            int n = KEY.length;
                            int result = 0;
                            String str = "";

                            System.out.print("\ndap an : ");

                            for(int i = 0; i < n; i++){

                                System.out.print(KEY[i]+" ");

                            }

                            System.out.print("\n");

                            for (int i = 0; i < student; i++) {

                                for (int j = 0; j < column; j++) {

                                    if (character[i][j] == KEY[j]) {

                                        result++;

                                    }
                                }

                                str = str + "hoc sinh " + (i+1) + " dung " + result + " dap an " + result + " diem \n";

                                GUI.LINE.setText(str);

                                System.out.println("hoc sinh " + (i+1) + " dung " + result + " dap an " + result + " diem");

                                result = 0;

                            }

                            return  0;
                        }
                    });
                }
            });
        }
    }