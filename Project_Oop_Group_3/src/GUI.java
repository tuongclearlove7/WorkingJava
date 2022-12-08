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

    public static JFormattedTextField USER_INPUT_ROW =  new JFormattedTextField();

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

    public static JPanel panel = new JPanel();


    public static Font font = new Font("Times New Roman", Font.BOLD, 13);

    public static Font Output_font = new Font("Times New Roman", Font.BOLD, 20);

    public static Font GR_FONT = new Font("Fantasy", Font.BOLD+Font.ITALIC, 50);


    public  static  JTextArea LINE = new JTextArea(10, 10);

    public static String PATH_ICON = "C:\\Users\\clearlove7\\Documents\\GitHub\\WorkingJava\\Project_Oop_Group_3\\src\\Model\\Logo\\logo1.png";


    //static JInternalFrame in = new JInternalFrame("Frame1",true,true,true,true);


    public void GUI() {


        Image icon = Toolkit.getDefaultToolkit().getImage(GUI.PATH_ICON);

        SCREEN.setIconImage(icon);
        SCREEN.setSize(250,250);
        SCREEN.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        SCREEN.add(panel);
        //panel.setLayout(null);

        GUI.LABEL_TEXT_GRUOP = new JLabel("Team 3");
        GUI.LABEL_TEXT_GRUOP.setBounds(230,10,200,50);
        GUI.LABEL_TEXT_GRUOP.setForeground(new Color(148, 27, 182));
        GUI.LABEL_TEXT_GRUOP.setFont(GR_FONT);
        panel.add(GUI.LABEL_TEXT_GRUOP);

        /*GUI.RESULT = new JTextField("");
        GUI.RESULT.setBounds(300, 320, 350, 425);
        panel.add(GUI.RESULT);*/

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

        JButton EXITBUTTON = new JButton("EXIT App");
        EXITBUTTON.setBounds(0, 820, 120, 25);
        EXITBUTTON.setForeground(Color.red);
        EXITBUTTON.setBackground(Color.WHITE);
        ActionListener EXIT = new Handle_Button_EventEXIT();
        EXITBUTTON.addActionListener(EXIT);
        panel.add(EXITBUTTON);

        SCREEN.setVisible(true);

    }
}
