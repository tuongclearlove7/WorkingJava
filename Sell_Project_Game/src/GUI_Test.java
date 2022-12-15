/*import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class GUI_Test extends JFrame{

    protected static JLabel LABEL_ID;

    protected static JLabel LABEL_FIRSTNAME;

    protected static JLabel LABEL_LASTNAME;

    protected static JLabel LABEL_BIRTHDAY;

    protected static JLabel LABEL_HomeWorkScore;

    protected static JLabel LABEL_DiscussionScore;

    protected static JLabel LABEL_FrequentScore;

    protected static JLabel LABEL_FinalScore;

    protected static JLabel LABEL_MediumScore;
    protected static JTextField ID;

    protected static JTextField FIRSTNAME;

    protected static JTextField LASTNAME;

    protected static JTextField BIRTHDAY;

    protected static JTextField HomeWorkScore;

    protected static JTextField DiscussionScore;

    protected static JTextField FinalScore;

    protected static JTextField FrequentScore;

    protected static JTextField MediumScore;

    protected JTable TABLE = new JTable();

    protected JScrollPane PANE;

    protected Object[] COLUMN = new String[]{"ID","Firstname","Lastname","Birthday","ScoreHomeWork","DiscussionScore","FrequentScore","FinalScore","MediumScore"};

    protected static DefaultTableModel model;

    protected JFrame SCREEN = new JFrame("Quản lý sinh viên");
    public GUI_Test(){

        JPanel panel = new JPanel();


        LABEL_ID = new JLabel("Input ID : ");
        LABEL_ID.setBounds(10, 25, 100, 25);
        LABEL_ID.setForeground(Color.red);
        panel.add(LABEL_ID);
        ID = new JTextField(20);
        ID.setBounds(130,30,150,20);
        panel.add(ID);


        LABEL_FIRSTNAME = new JLabel("Input FirstName : ");
        LABEL_FIRSTNAME.setBounds(10, 55, 100, 25);
        LABEL_FIRSTNAME.setForeground(Color.red);
        panel.add(LABEL_FIRSTNAME);
        FIRSTNAME = new JTextField(20);
        FIRSTNAME.setBounds(130, 60, 150, 20);
        panel.add(FIRSTNAME);


        LABEL_LASTNAME = new JLabel("Input LastName : ");
        LABEL_LASTNAME.setBounds(10, 85, 100, 25);
        LABEL_LASTNAME.setForeground(Color.red);
        panel.add(LABEL_LASTNAME);
        LASTNAME = new JTextField(20);
        LASTNAME.setBounds(130, 90, 150, 20);
        panel.add(LASTNAME);

        LABEL_BIRTHDAY = new JLabel("Input Birthday : ");
        LABEL_BIRTHDAY.setBounds(10, 115, 100, 25);
        LABEL_BIRTHDAY.setForeground(Color.red);
        panel.add(LABEL_BIRTHDAY);
        BIRTHDAY = new JTextField(20);
        BIRTHDAY.setBounds(130, 120, 150, 20);
        panel.add(BIRTHDAY);

        LABEL_HomeWorkScore = new JLabel("Input HomeWorkScore : ");
        LABEL_HomeWorkScore.setBounds(10, 145, 100, 25);
        LABEL_HomeWorkScore.setForeground(Color.red);
        panel.add(LABEL_HomeWorkScore);
        HomeWorkScore = new JTextField(20);
        HomeWorkScore.setBounds(130, 150, 150, 20);
        panel.add(HomeWorkScore);

        LABEL_DiscussionScore = new JLabel("Input DiscussionScore : ");
        LABEL_DiscussionScore.setBounds(10, 175, 100, 25);
        LABEL_DiscussionScore.setForeground(Color.red);
        panel.add(LABEL_DiscussionScore);
        DiscussionScore = new JTextField(20);
        DiscussionScore.setBounds(130, 180, 150, 20);
        panel.add(DiscussionScore);

        LABEL_FrequentScore = new JLabel("Input FrequentScore : ");
        LABEL_FrequentScore.setBounds(10, 205, 100, 25);
        LABEL_FrequentScore.setForeground(Color.red);
        panel.add(LABEL_FrequentScore);
        FrequentScore = new JTextField(20);
        FrequentScore.setBounds(130, 210, 150, 20);
        panel.add(FrequentScore);

        LABEL_FinalScore = new JLabel("Input FinalScore : ");
        LABEL_FinalScore.setBounds(10, 235, 100, 25);
        LABEL_FinalScore.setForeground(Color.red);
        panel.add(LABEL_FinalScore);
        FinalScore = new JTextField(20);
        FinalScore.setBounds(130, 240, 150, 20);
        panel.add(FinalScore);

        LABEL_MediumScore = new JLabel("MediumScore is : ");
        LABEL_MediumScore.setBounds(10, 265, 100, 25);
        LABEL_MediumScore.setForeground(Color.red);
        panel.add(LABEL_MediumScore);
        MediumScore = new JTextField(20);
        MediumScore.setBounds(130, 270, 150, 20);
        panel.add(MediumScore);

        JButton BUTTON = new JButton("ADD");
        BUTTON.setBounds(150, 380, 100, 25);
        BUTTON.setForeground(new Color(50, 50, 50));
        BUTTON.setBackground(Color.cyan);
        ActionListener listener1 = new Handle_Button_Event_ADD(this);
        BUTTON.addActionListener(listener1);
        panel.add(BUTTON);

        JButton BUTTON_CLEAN = new JButton("DELETE");
        BUTTON_CLEAN.setBounds(10, 380, 100, 25);
        BUTTON_CLEAN.setForeground(new Color(20, 50, 50));
        BUTTON_CLEAN.setBackground(Color.cyan);
        ActionListener listener_clean = new Handle_Button_Event_Clean();
        BUTTON_CLEAN.addActionListener(listener_clean);
        panel.add(BUTTON_CLEAN);

        PANE = new JScrollPane(TABLE);
        PANE.setBounds(300,10,750,400);
        panel.add(PANE);
        panel.setLayout(null);


        model = (DefaultTableModel) TABLE.getModel();
        model.setColumnIdentifiers(COLUMN);
        Color color = Color.decode("#bdb76b");
        getContentPane().setBackground(color);

        SCREEN.setSize(1100,600);
        SCREEN.add(panel);
        SCREEN.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SCREEN.setVisible(true);
        
    }

    public static void main(String[] args){

        new GUI_Test();
    }
}*/


