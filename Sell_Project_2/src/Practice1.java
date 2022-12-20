import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Practice1  implements ActionListener {

    private static JFormattedTextField input_column =  new JFormattedTextField();

    private static JFormattedTextField input_student =  new JFormattedTextField();

    private  JLabel text_column;

    private  JLabel text_student;


    @Override
    public void actionPerformed(ActionEvent e) {


        EventQueue.invokeLater(new Runnable() {
            public void run() {

                JPanel panel = new JPanel();
                JFrame window = new JFrame();
                window.setTitle("App Practice1");
                window.setSize(500, 300);
                window.add(panel);
                text_student = new JLabel("hoc sinh");
                text_student.setBounds(120, 20, 100, 25);
                text_column = new JLabel("cot");
                text_column.setBounds(300, 20, 100, 25);
                App.text_input = new JLabel("Nhap : ");
                App.text_input.setBounds(10, 50, 100, 25);
                input_student = new JFormattedTextField(0);
                input_student.setValue(0);
                input_student.setBounds(70, 50, 165, 25);
                input_column = new JFormattedTextField(0);
                input_column.setValue(0);
                input_column.setBounds(250, 50, 165, 25);
                App.outline = new JTextArea();
                JScrollPane pane = new JScrollPane(App.outline,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                pane.setBounds(70, 150, 345, 100);

                JButton button = new JButton("Output");
                button.setBounds( 190, 100, 100, 30);
                button.setForeground(Color.white);
                button.setBackground(new Color(50, 50, 50));
                panel.add(App.text_input);
                panel.add(text_column);
                panel.add(text_student);
                panel.add(input_column);
                panel.add(input_student);
                panel.add(pane);
                panel.add(button);
                panel.setLayout(null);
                window.setVisible(true);


                button.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent event) {

                        int student = (int) input_student.getValue();
                        int column = (int) input_column.getValue();
                        Handle(student,column);

                    }


                    public static void Handle(int student, int column) {

                        char[][] Char_array = {
                                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'}, {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}, {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
                        char[] arr = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
                        int result = 0;
                        String str = "";

                        for (int i = 0; i < student; i++) {
                            for (int j = 0; j < column; j++) {
                                if (Char_array[i][j] == arr[j]) {
                                    result++;
                                }
                            }
                            str = str + "học sinh " + (i+1) + " có số đáp án dúng : " + result + ", số điểm của học sinh " + (i+1) + " : " + result + "\n";
                            App.outline.setText(str);
                            result = 0;

                        }
                    }
                });
            }
        });
    }
}