import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;

public class App extends JFrame {

    public static JLabel[] text_input = new  JLabel[20];
    public static JTextArea outline = new JTextArea(10,10);

    public static JTextField out = new JTextField();

    protected static JTextField so_xe;

    protected static JTextField hang_xe;

    protected static JTextField nam_san_xuat;

    protected static JTextField color;

    protected static JFormattedTextField so_km;

    protected static JTextField remove_soxe;



    private JScrollPane[] PANE = new JScrollPane[10];

    protected static DefaultTableModel AddData;

    public static JTable TABLE_dienmay = new JTable();

    protected static Object[] COLUMN = new String[]{

            "so xe","hang xe","nam san xuat","color","so km"

    };

    protected static String path = "data.txt";

    protected static JFrame window = new JFrame("App");



    public App(){

        JPanel p = new JPanel();
        window.setSize(1200,500);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.add(p);


        text_input[0] = new JLabel("so xe");
        text_input[0].setBounds(10,35,100,50);
        p.add(text_input[0]);
        text_input[1] = new JLabel("hang xe");
        text_input[1].setBounds(10,80,100,50);
        p.add(text_input[1]);
        text_input[2] = new JLabel("nam sx");
        text_input[2].setBounds(10,130,100,50);
        p.add(text_input[2]);
        text_input[3] = new JLabel("mau xe");
        text_input[3].setBounds(10,180,100,50);
        p.add(text_input[3]);
        text_input[4] = new JLabel("so km");
        text_input[4].setBounds(10,230,100,50);
        p.add(text_input[4]);

        so_xe = new JTextField("47A");
        so_xe.setBounds(100,50,200,25);
        p.add(so_xe);

        hang_xe = new JTextField("mercedes");
        hang_xe.setBounds(100,100,200,25);
        p.add(hang_xe);

        nam_san_xuat = new JTextField("2023");
        nam_san_xuat.setBounds(100,150,200,25);
        p.add(nam_san_xuat);

        color = new JTextField("black");
        color.setBounds(100,200,200,25);
        p.add(color);

        so_km = new JFormattedTextField(100);
        so_km.setBounds(100,250,200,25);
        p.add(so_km);

        remove_soxe = new JTextField("47A");
        remove_soxe.setBounds(390, 400, 150, 25);
        p.add(remove_soxe);

        PANE[0] = new JScrollPane(TABLE_dienmay);
        PANE[0].setBounds(600,50,500,200);
        p.add(PANE[0]);

        AddData = (DefaultTableModel) TABLE_dienmay.getModel();
        AddData.setColumnIdentifiers(COLUMN);

        JScrollPane pane = new JScrollPane(outline,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        pane.setBounds(600, 250, 500, 200);
        p.add(pane);

        JButton btn1 = new JButton("Đọc File");
        btn1.setBounds(10, 350, 150, 25);
        btn1.setForeground(Color.white);
        btn1.setBackground(new Color(50, 50, 50));
        ActionListener action1 = new action_readfile();
        btn1.addActionListener(action1);
        p.add(btn1);

        JButton btn2 = new JButton("Thêm xe");
        btn2.setBounds(200, 350, 150, 25);
        btn2.setForeground(Color.white);
        btn2.setBackground(new Color(50, 50, 50));
        ActionListener action2 = new action_add();
        btn2.addActionListener(action2);
        p.add(btn2);

        JButton btn3 = new JButton("Xóa số xe");
        btn3.setBounds(390, 350, 150, 25);
        btn3.setForeground(Color.white);
        btn3.setBackground(new Color(50, 50, 50));
        ActionListener action3 = new action_remove();
        btn3.addActionListener(action3);
        p.add(btn3);

        JButton btn4 = new JButton("Xóa");
        btn4.setBounds(10, 400, 150, 25);
        btn4.setForeground(Color.white);
        btn4.setBackground(new Color(50, 50, 50));
        ActionListener action4 = new action_delete();
        btn4.addActionListener(action4);
        p.add(btn4);

        JButton btn5 = new JButton("Thùng rác");
        btn5.setBounds(200, 400, 150, 25);
        btn5.setForeground(Color.white);
        btn5.setBackground(new Color(50, 50, 50));
        ActionListener action5 = new action_trash();
        btn5.addActionListener(action5);
        p.add(btn5);

        p.setLayout(null);
        window.setVisible(true);


    }
}
