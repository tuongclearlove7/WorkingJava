import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;
import javax.swing.*;
import java.io.*;
import javax.swing.JTextField;

public class GUI extends JFrame{

    static final int ZeroPlayer = 0;

    private static final int One_Hundred = 100;

    public static String PATH = "C:\\Users\\clearlove7\\Documents\\GitHub\\WorkingJava\\Project_Oop_Group_3\\src\\File_Text\\test.txt";

    public static JFormattedTextField USER_INPUT_COLUMN =  new JFormattedTextField();

    public static JFormattedTextField USER_INPUT_STUDENT =  new JFormattedTextField();

    public static JFormattedTextField USER_INPUT_PRIME =  new JFormattedTextField();

    public static JTextField USER_INPUT_STR = new JTextField();

    public static JTextField USER_INPUT_PRACTICE14 = new JTextField();

    public static JTextField USER_INPUT_PRACTICE15 = new JTextField();

    public static JLabel LABEL_COLUMN = new JLabel();

    public static JLabel LABEL_STUDENT = new JLabel();

    public static JLabel LABEL_INPUT = new JLabel();

    public static JLabel LABEL_TEXT_GRUOP = new JLabel();

    public static JTextField RESULT = new JTextField();

    public static JLabel LABEL_OUTPUT = new JLabel();


    public static Scanner input = new Scanner(System.in);

    public static JFrame SCREEN = new JFrame("Algorithmn Team 3");

    public static JPanel PANEL = new JPanel();

    public static Font TEAM_FONT = new Font("Fantasy", Font.BOLD+Font.ITALIC, 50);


    public static JTextArea LINE = new JTextArea();

    public static String PATH_ICON = "C:\\Users\\clearlove7\\Documents\\GitHub\\WorkingJava\\Project_Oop_Group_3\\src\\Model\\Logo\\logo1.png";

    public static Image ICON = Toolkit.getDefaultToolkit().getImage(PATH_ICON);

    public void GUI() {

        SCREEN.setIconImage(ICON);

        SCREEN.setSize(250,250);
        SCREEN.add(PANEL);
        SCREEN.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ICON = Toolkit.getDefaultToolkit().getImage(GUI.PATH_ICON);
        //panel.setLayout(null);

        LABEL_TEXT_GRUOP = new JLabel("Team 3");
        LABEL_TEXT_GRUOP.setBounds(230,10,200,50);
        LABEL_TEXT_GRUOP.setForeground(new Color(148, 27, 182));
        LABEL_TEXT_GRUOP.setFont(TEAM_FONT);
        PANEL.add(GUI.LABEL_TEXT_GRUOP);

        JButton BUTTON = new JButton("Practice1");
        BUTTON.setBounds(0, 120, 100, 25);
        BUTTON.setForeground(Color.cyan);
        BUTTON.setBackground(new Color(50, 50, 50));
        ActionListener listener1 = new Handle_Button_Event_1();
        BUTTON.addActionListener(listener1);
        PANEL.add(BUTTON);

        JButton BUTTON2 = new JButton("Practice3");
        BUTTON2.setBounds(0, 220, 100, 25);
        BUTTON2.setForeground(Color.cyan);
        BUTTON2.setBackground(new Color(50, 50, 50));
        ActionListener listener2 = new Handle_Button_Event_2();
        BUTTON2.addActionListener(listener2);
        PANEL.add(BUTTON2);

        JButton BUTTON3 = new JButton("Practice6");
        BUTTON3.setBounds(0, 320, 100, 25);
        BUTTON3.setForeground(Color.cyan);
        BUTTON3.setBackground(new Color(50, 50, 50));
        ActionListener listener3 = new Handle_Button_Event_3();
        BUTTON3.addActionListener(listener3);
        PANEL.add(BUTTON3);

        JButton BUTTON4 = new JButton("Practice7");
        BUTTON4.setBounds(0, 420, 100, 25);
        BUTTON4.setForeground(Color.cyan);
        BUTTON4.setBackground(new Color(50, 50, 50));
        ActionListener listener4 = new Handle_Button_Event_4();
        BUTTON4.addActionListener(listener4);
        PANEL.add(BUTTON4);

        JButton BUTTON5 = new JButton("Practice14");
        BUTTON5.setBounds(0, 520, 100, 25);
        BUTTON5.setForeground(Color.cyan);
        BUTTON5.setBackground(new Color(50, 50, 50));
        ActionListener listener5 = new Handle_Button_Event_5();
        BUTTON5.addActionListener(listener5);
        PANEL.add(BUTTON5);

        JButton BUTTON6 = new JButton("Practice15");
        BUTTON6.setBounds(0, 620, 100, 25);
        BUTTON6.setForeground(Color.cyan);
        BUTTON6.setBackground(new Color(50, 50, 50));
        ActionListener listener6 = new Handle_Button_Event_6();
        BUTTON6.addActionListener(listener6);
        PANEL.add(BUTTON6);

        JButton CleanBUTTON = new JButton("Clean Text");
        CleanBUTTON.setBounds(0, 720, 120, 25);
        CleanBUTTON.setForeground(Color.red);
        CleanBUTTON.setBackground(Color.WHITE);
        ActionListener clean = new Handle_Button_EventClean();
        CleanBUTTON.addActionListener(clean);
        PANEL.add(CleanBUTTON);

        JButton EXITBUTTON = new JButton("EXIT App");
        EXITBUTTON.setBounds(0, 820, 120, 25);
        EXITBUTTON.setForeground(Color.red);
        EXITBUTTON.setBackground(Color.WHITE);
        ActionListener EXIT = new Handle_Button_EventEXIT();
        EXITBUTTON.addActionListener(EXIT);
        PANEL.add(EXITBUTTON);

        SCREEN.setVisible(true);

    }
}
