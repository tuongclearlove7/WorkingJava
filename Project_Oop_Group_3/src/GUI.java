import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;
import javax.swing.*;
import java.io.*;
import javax.swing.JTextField;

public class GUI {

    static final int ZeroPlayer = 0;

    private static final int One_Hundred = 100;
    public static JFormattedTextField USER_INPUT_ROW =  new JFormattedTextField();
    public static JFormattedTextField USER_INPUT_STUDENT =  new JFormattedTextField();

    public static JFormattedTextField USER_INPUT_PRIME =  new JFormattedTextField();

    public static JTextField USER_INPUT_STR = new JTextField();

    public static JTextField USER_INPUT_PRACTICE14 = new JTextField();

    public static JTextField USER_INPUT_PRACTICE15 = new JTextField();
    public static JLabel LABEL_ROW = new JLabel();
    public static JLabel LABEL_STUDENT = new JLabel();

    public static JLabel LABEL_OUTPUT = new JLabel();

    public static JLabel LABEL_TEXT_GRUOP = new JLabel();

    public static JTextField RESULT = new JTextField();



    public static Scanner input = new Scanner(System.in);


    public static void GUI(){

        Handle_Button_Event_1 Event1_Object = new Handle_Button_Event_1();

        JFrame my_gui = new JFrame("Algorithmn Team 3");
        JPanel panel = new JPanel();
        Font font = new Font("Times New Roman", Font.BOLD, 13);
        Font Output_font = new Font("Times New Roman", Font.BOLD, 20);
        Font GR_FONT = new Font("Fantasy", Font.BOLD+Font.ITALIC, 50);
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\clearlove7\\Documents\\GitHub\\WorkingJava\\Project_Oop_Group_3\\src\\Model\\Flizer.png");

        my_gui.setIconImage(icon);
        my_gui.setSize(700,800);
        my_gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        my_gui.add(panel);
        panel.setLayout(null);

        // JLabel background = new JLabel(new ImageIcon("C:\\Users\\clearlove7\\Documents\\GitHub\\WorkingJava\\java1_intellij\\src\\logo\\logo1.png"));
        // background.setBounds(300,0,300,85);
        // my_gui.add(background);

        //background.setLayout(new FlowLayout());

        GUI.LABEL_STUDENT = new JLabel("Input student : ");
        GUI.LABEL_STUDENT.setBounds(120,90,100,30);
        GUI.LABEL_STUDENT.setForeground(new Color(50, 50, 50));
        panel.add(GUI.LABEL_STUDENT);

        GUI.LABEL_ROW = new JLabel("Input row : ");
        GUI.LABEL_ROW.setBounds(300,90,80,30);
        GUI.LABEL_ROW.setForeground(new Color(50, 50, 50));
        panel.add(GUI.LABEL_ROW);

        GUI.LABEL_OUTPUT = new JLabel("Output : ");
        GUI.LABEL_OUTPUT.setBounds(450,280,100,30);
        GUI.LABEL_OUTPUT.setFont(Output_font);
        GUI.LABEL_OUTPUT.setForeground(new Color(21, 160, 153));
        panel.add(GUI.LABEL_OUTPUT);

        GUI.LABEL_TEXT_GRUOP = new JLabel("Team 3");
        GUI.LABEL_TEXT_GRUOP.setBounds(230,10,200,50);
        GUI.LABEL_TEXT_GRUOP.setForeground(new Color(21,160,153));
        GUI.LABEL_TEXT_GRUOP.setFont(GR_FONT);
        panel.add(GUI.LABEL_TEXT_GRUOP);

        GUI.USER_INPUT_STUDENT = new JFormattedTextField();
        GUI.USER_INPUT_STUDENT.setValue(0);
        GUI.USER_INPUT_STUDENT.setBounds(120, 120, 165, 25);
        GUI.USER_INPUT_STUDENT.setFont(font);
        panel.add(GUI.USER_INPUT_STUDENT);

        GUI.USER_INPUT_ROW = new JFormattedTextField();
        GUI.USER_INPUT_ROW.setValue(0);
        GUI.USER_INPUT_ROW.setBounds(300,120,165, 25);
        GUI.USER_INPUT_ROW.setFont(font);
        panel.add(GUI.USER_INPUT_ROW);

        GUI.USER_INPUT_STR = new JTextField("");
        GUI.USER_INPUT_STR.setText("String : ");
        GUI.USER_INPUT_STR.setBounds(120,320,165, 25);
        GUI.USER_INPUT_STR.setFont(font);
        panel.add(GUI.USER_INPUT_STR);

        GUI.USER_INPUT_PRIME = new JFormattedTextField();
        GUI.USER_INPUT_PRIME.setValue(0);
        GUI.USER_INPUT_PRIME.setBounds(120,420,165, 25);
        GUI.USER_INPUT_PRIME.setFont(font);
        panel.add(GUI.USER_INPUT_PRIME);

        GUI.USER_INPUT_PRACTICE14 = new JTextField("");
        GUI.USER_INPUT_PRACTICE14.setText("Practice14 ");
        GUI.USER_INPUT_PRACTICE14.setBounds(120,520,165, 25);
        GUI.USER_INPUT_PRACTICE14.setFont(font);
        panel.add(GUI.USER_INPUT_PRACTICE14);

        GUI.USER_INPUT_PRACTICE15 = new JTextField("");
        GUI.USER_INPUT_PRACTICE15.setText("Practice15 ");
        GUI.USER_INPUT_PRACTICE15.setBounds(120,620,165, 25);
        GUI.USER_INPUT_PRACTICE15.setFont(font);
        panel.add(GUI.USER_INPUT_PRACTICE15);

        GUI.RESULT = new JTextField("");
        GUI.RESULT.setBounds(300, 320, 350, 425);
        panel.add(GUI.RESULT);

        JButton BUTTON = new JButton("Practice1");
        BUTTON.setBounds(0, 120, 100, 25);
        BUTTON.setForeground(Color.cyan);
        BUTTON.setBackground(new Color(50, 50, 50));
        ActionListener listener1 = new Handle_Button_Event_1();
        BUTTON.addActionListener(listener1);
        panel.add(BUTTON);

        JButton BUTTON2 = new JButton("Practice3");
        BUTTON2.setBounds(0, 220, 100, 25);
        BUTTON2.setForeground(Color.cyan);
        BUTTON2.setBackground(new Color(50, 50, 50));
        ActionListener listener2 = new Handle_Button_Event_2();
        BUTTON2.addActionListener(listener2);
        panel.add(BUTTON2);

        JButton BUTTON3 = new JButton("Practice6");
        BUTTON3.setBounds(0, 320, 100, 25);
        BUTTON3.setForeground(Color.cyan);
        BUTTON3.setBackground(new Color(50, 50, 50));
        ActionListener listener3 = new Handle_Button_Event_3();
        BUTTON3.addActionListener(listener3);
        panel.add(BUTTON3);

        JButton BUTTON4 = new JButton("Practice7");
        BUTTON4.setBounds(0, 420, 100, 25);
        BUTTON4.setForeground(Color.cyan);
        BUTTON4.setBackground(new Color(50, 50, 50));
        ActionListener listener4 = new Handle_Button_Event_4();
        BUTTON4.addActionListener(listener4);
        panel.add(BUTTON4);

        JButton BUTTON5 = new JButton("Practice14");
        BUTTON5.setBounds(0, 520, 100, 25);
        BUTTON5.setForeground(Color.cyan);
        BUTTON5.setBackground(new Color(50, 50, 50));
        ActionListener listener5 = new Handle_Button_Event_5();
        BUTTON5.addActionListener(listener5);
        panel.add(BUTTON5);

        JButton BUTTON6 = new JButton("Practice15");
        BUTTON6.setBounds(0, 620, 100, 25);
        BUTTON6.setForeground(Color.cyan);
        BUTTON6.setBackground(new Color(50, 50, 50));
        ActionListener listener6 = new Handle_Button_Event_6();
        BUTTON6.addActionListener(listener6);
        panel.add(BUTTON6);

        JButton CleanBUTTON = new JButton("CleanFieldText");
        CleanBUTTON.setBounds(0, 720, 120, 25);
        CleanBUTTON.setForeground(Color.red);
        CleanBUTTON.setBackground(Color.WHITE);
        ActionListener clean = new Handle_Button_EventClean();
        CleanBUTTON.addActionListener(clean);
        panel.add(CleanBUTTON);

        my_gui.setVisible(true);

    }
}
