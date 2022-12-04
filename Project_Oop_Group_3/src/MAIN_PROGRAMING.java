import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class MAIN_PROGRAMING extends GUI {

    public static void main(String[] args){

        GUI GUI_Object = new GUI();
        Handle_Button_Event_1 Event1_Object = new Handle_Button_Event_1();

        JFrame my_gui = new JFrame("Algorithmn");
        JPanel panel = new JPanel();
        Font font = new Font("SansSerif", Font.BOLD, 13);
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\clearlove7\\Documents\\GitHub\\WorkingJava\\java1_intellij\\src\\logo\\Flizer.png");

        my_gui.setIconImage(icon);
        my_gui.setSize(700,570);
        my_gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        my_gui.add(panel);
        panel.setLayout(null);

       // JLabel background = new JLabel(new ImageIcon("C:\\Users\\clearlove7\\Documents\\GitHub\\WorkingJava\\java1_intellij\\src\\logo\\logo1.png"));
       // background.setBounds(300,0,300,85);
       // my_gui.add(background);

        //background.setLayout(new FlowLayout());

        GUI.LABEL_STUDENT = new JLabel("Input student : ");
        GUI.LABEL_STUDENT.setBounds(10,10,100,30);
        GUI.LABEL_STUDENT.setForeground(new Color(50, 50, 50));
        panel.add(GUI.LABEL_STUDENT);

        GUI.LABEL_ROW = new JLabel("Input row : ");
        GUI.LABEL_ROW.setBounds(10,60,80,30);
        GUI.LABEL_ROW.setForeground(new Color(50, 50, 50));
        panel.add(GUI.LABEL_ROW);

        GUI.LABEL_OUTPUT = new JLabel("Output : ");
        GUI.LABEL_OUTPUT.setBounds(10,340,50,30);
        GUI.LABEL_OUTPUT.setForeground(new Color(32,178,170));
        panel.add(GUI.LABEL_OUTPUT);

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

        GUI.RESULT = new JTextField(" ");
        GUI.RESULT.setBounds(60, 344, 570, 100);
        panel.add(GUI.RESULT);

        JButton BUTTON = new JButton("Practice1");
        BUTTON.setBounds(0, 120, 100, 25);
        BUTTON.setForeground(Color.cyan);
        BUTTON.setBackground(new Color(50, 50, 50));
        ActionListener listener1 = new Handle_Button_Event_1();
        BUTTON.addActionListener(listener1);
        panel.add(BUTTON);

        JButton BUTTON2 = new JButton("Practice3");
        BUTTON2.setBounds(185, 120, 100, 25);
        BUTTON2.setForeground(Color.cyan);
        BUTTON2.setBackground(new Color(50, 50, 50));
        ActionListener listener2 = new Handle_Button_Event_2();
        BUTTON2.addActionListener(listener2);
        panel.add(BUTTON2);

        JButton BUTTON3 = new JButton("Practice6");
        BUTTON3.setBounds(0, 200, 100, 25);
        BUTTON3.setForeground(Color.cyan);
        BUTTON3.setBackground(new Color(50, 50, 50));
        ActionListener listener3 = new Handle_Button_Event_3();
        BUTTON3.addActionListener(listener3);
        panel.add(BUTTON3);

        JButton BUTTON4 = new JButton("Practice7");
        BUTTON4.setBounds(185, 200, 100, 25);
        BUTTON4.setForeground(Color.cyan);
        BUTTON4.setBackground(new Color(50, 50, 50));
        ActionListener listener4 = new Handle_Button_Event_4();
        BUTTON4.addActionListener(listener4);
        panel.add(BUTTON4);

        JButton BUTTON5 = new JButton("Practice14");
        BUTTON5.setBounds(0, 280, 100, 25);
        BUTTON5.setForeground(Color.cyan);
        BUTTON5.setBackground(new Color(50, 50, 50));
        ActionListener listener5 = new Handle_Button_Event_5();
        BUTTON5.addActionListener(listener5);
        panel.add(BUTTON5);

        JButton BUTTON6 = new JButton("Practice15");
        BUTTON6.setBounds(185, 280, 100, 25);
        BUTTON6.setForeground(Color.cyan);
        BUTTON6.setBackground(new Color(50, 50, 50));
        ActionListener listener6 = new Handle_Button_Event_6();
        BUTTON6.addActionListener(listener6);
        panel.add(BUTTON6);

        JButton CleanBUTTON = new JButton("CleanOutput");
        CleanBUTTON.setBounds(0, 500, 120, 25);
        CleanBUTTON.setForeground(Color.red);
        CleanBUTTON.setBackground(Color.WHITE);
        ActionListener clean = new Handle_Button_EventClean();
        CleanBUTTON.addActionListener(clean);
        panel.add(CleanBUTTON);


        my_gui.setVisible(true);


    }
}
