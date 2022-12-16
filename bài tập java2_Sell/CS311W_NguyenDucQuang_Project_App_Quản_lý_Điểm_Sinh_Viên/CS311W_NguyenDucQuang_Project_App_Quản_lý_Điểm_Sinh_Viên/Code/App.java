import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class App extends JFrame {

    protected static JLabel LABEL_ID;

    protected static JLabel LABEL_FIRSTNAME;

    protected static JLabel LABEL_LASTNAME;

    protected static JLabel LABEL_BIRTHDAY;

    protected static JLabel LABEL_HomeWorkScore;

    protected static JLabel LABEL_DiscussionScore;

    protected static JLabel LABEL_FrequentScore;

    protected static JLabel LABEL_FinalScore;

    protected static JLabel LABEL_MediumScore;

    public static JLabel LABEL_CHECK;

    public static JLabel LABEL_SHOWDATA;
    protected static JTextField ID;

    protected static JTextField FIRSTNAME;

    protected static JTextField LASTNAME;

    protected static JTextField BIRTHDAY;

    protected static JFormattedTextField HomeWorkScore;

    protected static JFormattedTextField DiscussionScore;

    protected static JFormattedTextField FinalScore;

    protected static JFormattedTextField FrequentScore;

    protected static JTextField MediumScore;

    protected static JTextArea ShowData = new  JTextArea(10,10);

    protected static JTable TABLE = new JTable();

    protected JScrollPane PANE;

    protected static JFormattedTextField Check_MediumScore;

    protected static DefaultTableModel AddData;

    protected static JFrame SCREEN = new JFrame("Quản lý sinh viên");

    JScrollBar SCROLLBAR = new JScrollBar(JScrollBar.HORIZONTAL);

    protected static String PATH_TXT = "C:\\Users\\clearlove7\\Documents\\GitHub\\WorkingJava\\Sell_Project_Game\\src\\Text\\Data.txt";

    private static String PATH_ICON = "C:\\Users\\clearlove7\\Documents\\GitHub\\WorkingJava\\Sell_Project_Game\\src\\Model\\icon\\clearlove7.png";

    private static Image ICON = Toolkit.getDefaultToolkit().getImage(PATH_ICON);

    static JDialog MESSENGER = new JDialog(App.SCREEN, "Messenger box");

    protected static Object[] COLUMN = new String[]{

            "ID","Firstname","Lastname","Birthday","HomeWorkScore",

            "DiscussionScore","FrequentScore","FinalScore","MediumScore"
    };

    public App(){

        JPanel panel = new JPanel();
        SCREEN.setIconImage(ICON);

        LABEL_ID = new JLabel("Input ID : ");
        LABEL_ID.setBounds(10, 25, 100, 25);
        LABEL_ID.setForeground(Color.red);
        panel.add(LABEL_ID);
        ID = new JTextField("2342345345");
        ID.setBounds(130,30,150,20);
        panel.add(ID);


        LABEL_FIRSTNAME = new JLabel("Input FirstName : ");
        LABEL_FIRSTNAME.setBounds(10, 55, 100, 25);
        LABEL_FIRSTNAME.setForeground(Color.red);
        panel.add(LABEL_FIRSTNAME);
        FIRSTNAME = new JTextField("Nguyễn Văn");
        FIRSTNAME.setBounds(130, 60, 150, 20);
        panel.add(FIRSTNAME);

        LABEL_LASTNAME = new JLabel("Input LastName : ");
        LABEL_LASTNAME.setBounds(10, 85, 100, 25);
        LABEL_LASTNAME.setForeground(Color.red);
        panel.add(LABEL_LASTNAME);
        LASTNAME = new JTextField("A");
        LASTNAME.setBounds(130, 90, 150, 20);
        panel.add(LASTNAME);

        LABEL_BIRTHDAY = new JLabel("Input Birthday : ");
        LABEL_BIRTHDAY.setBounds(10, 115, 100, 25);
        LABEL_BIRTHDAY.setForeground(Color.red);
        panel.add(LABEL_BIRTHDAY);
        BIRTHDAY = new JTextField("19/12/2022");
        BIRTHDAY.setBounds(130, 120, 150, 20);
        panel.add(BIRTHDAY);

        LABEL_HomeWorkScore = new JLabel("Input HomeWorkScore : ");
        LABEL_HomeWorkScore.setBounds(10, 145, 100, 25);
        LABEL_HomeWorkScore.setForeground(Color.red);
        panel.add(LABEL_HomeWorkScore);
        HomeWorkScore = new JFormattedTextField();
        HomeWorkScore.setValue(0);
        HomeWorkScore.setBounds(130, 150, 150, 20);
        panel.add(HomeWorkScore);

        LABEL_DiscussionScore = new JLabel("Input DiscussionScore : ");
        LABEL_DiscussionScore.setBounds(10, 175, 100, 25);
        LABEL_DiscussionScore.setForeground(Color.red);
        panel.add(LABEL_DiscussionScore);
        DiscussionScore = new JFormattedTextField();
        DiscussionScore.setValue(0);
        DiscussionScore.setBounds(130, 180, 150, 20);
        panel.add(DiscussionScore);

        LABEL_FrequentScore = new JLabel("Input FrequentScore : ");
        LABEL_FrequentScore.setBounds(10, 205, 100, 25);
        LABEL_FrequentScore.setForeground(Color.red);
        panel.add(LABEL_FrequentScore);
        FrequentScore = new JFormattedTextField();
        FrequentScore.setValue(0);
        FrequentScore.setBounds(130, 210, 150, 20);
        panel.add(FrequentScore);

        LABEL_FinalScore = new JLabel("Input FinalScore : ");
        LABEL_FinalScore.setBounds(10, 235, 100, 25);
        LABEL_FinalScore.setForeground(Color.red);
        panel.add(LABEL_FinalScore);
        FinalScore = new JFormattedTextField();
        FinalScore.setValue(0);
        FinalScore.setBounds(130, 240, 150, 20);
        panel.add(FinalScore);

        LABEL_MediumScore = new JLabel("MediumScore is : ");
        LABEL_MediumScore.setBounds(10, 265, 100, 25);
        LABEL_MediumScore.setForeground(Color.red);
        panel.add(LABEL_MediumScore);
        MediumScore = new JTextField("Điểm trung bình");
        MediumScore.setBounds(130, 270, 150, 20);
        panel.add(MediumScore);

        LABEL_CHECK = new JLabel("Check MediumScore");
        LABEL_CHECK.setBounds(140, 420, 200, 25);
        LABEL_CHECK.setForeground(Color.red);
        panel.add(LABEL_CHECK);
        Check_MediumScore = new JFormattedTextField();
        Check_MediumScore.setValue(0);
        Check_MediumScore.setBounds(130, 450, 150, 25);
        panel.add(Check_MediumScore);

        JScrollPane SCROLL = new JScrollPane(ShowData,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        SCROLL.setBounds(300, 500, 750, 150);
        SCREEN.getContentPane().add(SCROLL);

        JButton BUTTON = new JButton("ADD");
        BUTTON.setBounds(150, 380, 100, 25);
        BUTTON.setForeground(Color.CYAN);
        BUTTON.setBackground(new Color(20, 50, 50));
        ActionListener listener1 = new Handle_Button_Event_ADD(this);
        BUTTON.addActionListener(listener1);
        panel.add(BUTTON);

        JButton BUTTON_CLEAN = new JButton("DELETE");
        BUTTON_CLEAN.setBounds(10, 380, 100, 25);
        BUTTON_CLEAN.setForeground(Color.CYAN);
        BUTTON_CLEAN.setBackground(new Color(20, 50, 50));
        ActionListener listener_clean = new Handle_Button_Event_Clean();
        BUTTON_CLEAN.addActionListener(listener_clean);
        panel.add(BUTTON_CLEAN);

        JButton BUTTON_CHECK = new JButton("CHECK");
        BUTTON_CHECK.setBounds(10, 450, 100, 25);
        BUTTON_CHECK.setForeground(Color.CYAN);
        BUTTON_CHECK.setBackground(new Color(20, 50, 50));
        ActionListener listener_check = new Handle_Button_Event_Check();
        BUTTON_CHECK.addActionListener(listener_check);
        panel.add(BUTTON_CHECK);

        JButton BUTTON_WRITEFILE = new JButton("SAVE");
        BUTTON_WRITEFILE.setBounds(10, 520, 100, 25);
        BUTTON_WRITEFILE.setForeground(Color.CYAN);
        BUTTON_WRITEFILE.setBackground(new Color(20, 50, 50));
        ActionListener listener_WriteFile = new Handle_Button_Event_WriteFile();
        BUTTON_WRITEFILE.addActionListener(listener_WriteFile);
        panel.add(BUTTON_WRITEFILE);

        JButton BUTTON_READFILE = new JButton("SHOW DATA");
        BUTTON_READFILE.setBounds(130, 520, 150, 25);
        BUTTON_READFILE.setForeground(Color.CYAN);
        BUTTON_READFILE.setBackground(new Color(20, 50, 50));
        ActionListener listener_ReadFile = new Handle_Button_Event_READFILE();
        BUTTON_READFILE.addActionListener(listener_ReadFile);
        panel.add(BUTTON_READFILE);

        PANE = new JScrollPane(TABLE);
        PANE.setBounds(300,31,750,445);
        panel.add(PANE);

        panel.setLayout(null);

        AddData = (DefaultTableModel) TABLE.getModel();
        AddData.setColumnIdentifiers(COLUMN);

        SCREEN.setSize(1100,710);
        SCREEN.add(panel);
        SCREEN.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SCREEN.setVisible(true);

    }

    public void show(){

        System.out.println("*** Developer Clearlove7 ***");
    }

    public static void main(String[] args){

        new App();

    }
}
