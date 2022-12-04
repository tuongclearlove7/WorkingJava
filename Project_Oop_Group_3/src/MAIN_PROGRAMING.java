import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MAIN_PROGRAMING {

    public static void main(String[] args){

        JFrame my_gui = new JFrame("Algorithmn");
        JPanel panel = new JPanel();
        Font font = new Font("SansSerif", Font.BOLD, 16);
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\clearlove7\\Documents\\GitHub\\WorkingJava\\java1_intellij\\src\\logo\\Flizer.png");


        my_gui.setIconImage(icon);
        my_gui.setSize(300,360);
        my_gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        my_gui.setVisible(true);
        my_gui.add(panel);
        panel.setLayout(null);

        GUI.LABEL_STUDENT = new JLabel("Input student : ");
        GUI.LABEL_STUDENT.setBounds(10,10,100,30);
        panel.add(GUI.LABEL_STUDENT);

        GUI.LABEL_ROW = new JLabel("Input row : ");
        GUI.LABEL_ROW.setBounds(10,60,80,30);
        panel.add(GUI.LABEL_ROW);

        GUI.USER_INPUT_STUDENT = new JFormattedTextField();
        GUI.USER_INPUT_STUDENT.setValue(0);
        GUI.USER_INPUT_STUDENT.setBounds(100, 10, 165, 25);
        GUI.USER_INPUT_STUDENT.setFont(font);
        panel.add(GUI.USER_INPUT_STUDENT);

        GUI.USER_INPUT_ROW = new JFormattedTextField();
        GUI.USER_INPUT_ROW.setValue(10);
        GUI.USER_INPUT_ROW.setBounds(100,60,165, 25);
        GUI.USER_INPUT_ROW.setFont(font);
        panel.add(GUI.USER_INPUT_ROW);

        GUI.RESULT = new Label("");
        GUI.RESULT.setBounds(10, 170, 300, 25);
        panel.add(GUI.RESULT);

        JButton BUTTON = new JButton("BAI1");
        BUTTON.setBounds(10, 120, 80, 25);
        ActionListener listener1 = new Handle_Button_Event_1();
        BUTTON.addActionListener(listener1);
        panel.add(BUTTON);

        JButton BUTTON2 = new JButton("BAI2");
        BUTTON2.setBounds(185, 120, 80, 25);
        ActionListener listener2 = new Handle_Button_Event_2();
        BUTTON2.addActionListener(listener2);
        panel.add(BUTTON2);

        JButton BUTTON3 = new JButton("BAI3");
        BUTTON3.setBounds(10, 200, 80, 25);
        panel.add(BUTTON3);

        JButton BUTTON4 = new JButton("BAI4");
        BUTTON4.setBounds(185, 200, 80, 25);
        panel.add(BUTTON4);

        JButton BUTTON5 = new JButton("BAI5");
        BUTTON5.setBounds(10, 280, 80, 25);
        panel.add(BUTTON5);

        JButton BUTTON6 = new JButton("BAI6");
        BUTTON6.setBounds(185, 280, 80, 25);
        panel.add(BUTTON6);



        my_gui.setVisible(true);


    }
}
