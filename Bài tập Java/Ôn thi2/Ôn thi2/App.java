import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;

public class App extends JFrame {

    public static JLabel[] text_input = new  JLabel[20];
    public static JTextArea outline = new JTextArea(10,10);

    public static JTextField out = new JTextField();

    protected static JTextField user_id_hang;

    protected static JTextField user_date;

    protected static JFormattedTextField user_receipt_price;

    protected static JFormattedTextField user_amount;

    protected static JTextField user_where_production;

    protected static JTextField remove_id_hang;


    private JScrollPane[] PANE = new JScrollPane[10];

    protected static DefaultTableModel AddData;

    public static JTable TABLE_dienmay = new JTable();

    protected static Object[] COLUMN = new String[]{

            "id_hang","Date","đơn giá","số lượng","nơi sản xuất","thành tiền"

    };

    protected static String path = "data.txt";

    protected static JFrame window = new JFrame("App");

    public static void main(String[] args) {

        new App();
    }

    public App(){

        JPanel p = new JPanel();
        window.setSize(1200,500);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.add(p);


        text_input[0] = new JLabel("Input id_hang");
        text_input[0].setBounds(10,35,100,50);
        p.add(text_input[0]);
        text_input[1] = new JLabel("Date");
        text_input[1].setBounds(10,80,100,50);
        p.add(text_input[1]);
        text_input[2] = new JLabel("receipt_price");
        text_input[2].setBounds(10,130,100,50);
        p.add(text_input[2]);
        text_input[3] = new JLabel("amount");
        text_input[3].setBounds(10,180,100,50);
        p.add(text_input[3]);
        text_input[4] = new JLabel("production");
        text_input[4].setBounds(10,230,100,50);
        p.add(text_input[4]);

        user_id_hang = new JTextField("001");
        user_id_hang.setBounds(100,50,200,25);
        p.add(user_id_hang);

        user_date = new JTextField("16/1/2002");
        user_date.setBounds(100,100,200,25);
        p.add(user_date);

        user_receipt_price = new JFormattedTextField(1600);
        user_receipt_price.setBounds(100,150,200,25);
        p.add(user_receipt_price);

        user_amount = new JFormattedTextField(9);
        user_amount.setBounds(100,200,200,25);
        p.add(user_amount);

        user_where_production = new JTextField("trong nuoc");
        user_where_production.setBounds(100,250,200,25);
        p.add(user_where_production);

        remove_id_hang = new JTextField("001");
        remove_id_hang.setBounds(390, 400, 150, 25);
        p.add(remove_id_hang);

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

        JButton btn2 = new JButton("Thêm đơn");
        btn2.setBounds(200, 350, 150, 25);
        btn2.setForeground(Color.white);
        btn2.setBackground(new Color(50, 50, 50));
        ActionListener action2 = new action_add();
        btn2.addActionListener(action2);
        p.add(btn2);

        JButton btn3 = new JButton("Xóa đơn");
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
