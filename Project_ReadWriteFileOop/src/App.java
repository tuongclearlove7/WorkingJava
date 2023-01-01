import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * Xây dựng App
 *
 * */

public class App<T> extends JFrame{
    public static JLabel[] text_input = new  JLabel[20];
    public static JTextArea outline = new JTextArea(10,10);

    public static JTextField out = new JTextField();
    protected static JFormattedTextField userAmount;
    protected static JFormattedTextField userReceipt;
    protected static JTextField userreceipt_ID;

    protected static JTextField userdevice_ID;

    protected static JTextField userProduct;

    protected static JTextField userModel;

    protected static JFormattedTextField userSize;

    protected static JTextField userResolution;

    protected static JTextField userType;

    protected static JTextField userID_tivi;

    protected static JTextField userChip;

    protected static JTextField userRam;

    protected static JTextField userCapacity;

    protected static JTextField remove_receipt;

    private JScrollPane[] PANE = new JScrollPane[10];

    protected static DefaultTableModel AddData;

    public static JTable TABLE_Tivi = new JTable();

    public static JTable TABLE_Laptop = new JTable();

    protected static Object[] COLUMN = new String[]{

     "ID_hoa don","ID_thiet bi","san pham","mau","kich thuoc","nghi quyet","kieu","Chip","Ram","dung luong","So luong","Don gia","Thanh Tien"

    };

    protected static String path = "data.txt";

    protected static JFrame window = new JFrame("App");

    public static void main(String[] arg){

        new App<>();

    }
    public App() {


        JPanel p = new JPanel();
        window.setSize(1500,800);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.add(p);


        text_input[0] = new JLabel("Input receipt ID");
        text_input[0].setBounds(10,35,100,50);
        p.add(text_input[0]);
        text_input[1] = new JLabel("Device ID");
        text_input[1].setBounds(10,80,100,50);
        p.add(text_input[1]);
        text_input[2] = new JLabel("Product");
        text_input[2].setBounds(10,130,100,50);
        p.add(text_input[2]);
        text_input[3] = new JLabel("Model");
        text_input[3].setBounds(10,180,100,50);
        p.add(text_input[3]);
        text_input[4] = new JLabel("Size");
        text_input[4].setBounds(10,230,100,50);
        p.add(text_input[4]);
        text_input[5] = new JLabel("Size");
        text_input[5].setBounds(10,280,100,50);
        p.add(text_input[5]);
        text_input[5] = new JLabel("Resolution");
        text_input[5].setBounds(10,330,100,50);
        p.add(text_input[5]);
        text_input[6] = new JLabel("Type");
        text_input[6].setBounds(10,380,100,50);
        p.add(text_input[6]);
        text_input[7] = new JLabel("amount ");
        text_input[7].setBounds(10,430,100,50);
        p.add(text_input[7]);
        text_input[8] = new JLabel("Receipt");
        text_input[8].setBounds(10,480,100,50);
        p.add(text_input[8]);
        text_input[8] = new JLabel("ID_Tivi");
        text_input[8].setBounds(10,530,100,50);
        p.add(text_input[8]);
        text_input[8] = new JLabel("Chip");
        text_input[8].setBounds(10,580,100,50);
        p.add(text_input[8]);
        text_input[8] = new JLabel("Ram");
        text_input[8].setBounds(10,630,100,50);
        p.add(text_input[8]);
        text_input[8] = new JLabel("Capacity");
        text_input[8].setBounds(10,680,100,50);
        p.add(text_input[8]);


        text_input[19] = new JLabel("Nhập hóa đơn muốn xóa");
        text_input[19].setBounds(1100,600,200,50);
        p.add(text_input[19]);

        userreceipt_ID = new JTextField("Hoadon_lap_1");
        userreceipt_ID.setBounds(100,50,200,25);
        p.add(userreceipt_ID);

        userdevice_ID = new JTextField("thietbi_laptop_1");
        userdevice_ID.setBounds(100,100,200,25);
        p.add(userdevice_ID);

        userProduct = new JTextField("san pham1");
        userProduct.setBounds(100,150,200,25);
        p.add(userProduct);

        userModel = new JTextField("model1");
        userModel.setBounds(100,200,200,25);
        p.add(userModel);

        userSize = new JFormattedTextField();
        userSize.setValue(43);
        userSize.setBounds(100,250,200,25);
        p.add(userSize);

        userModel = new JTextField("MSI");
        userModel.setBounds(100,300,200,25);
        p.add(userModel);

        userResolution = new JTextField("Nghi quyet 133");
        userResolution.setBounds(100,350,200,25);
        p.add(userResolution);

        userType = new JTextField("Bravo15");
        userType.setBounds(100,400,200,25);
        p.add(userType);

        userAmount = new JFormattedTextField();
        userAmount.setValue(40);
        userAmount.setBounds(100,450,200,25);
        p.add(userAmount);

        userReceipt = new JFormattedTextField();
        userReceipt.setValue(1000);
        userReceipt.setBounds(100,500,200,25);
        p.add(userReceipt);

        userID_tivi = new JTextField("Tivi_1");
        userID_tivi.setBounds(100,550,200,25);
        p.add(userID_tivi);

        userChip = new JTextField("AMD Ryzen");
        userChip.setBounds(100,600,200,25);
        p.add(userChip);

        userRam = new JTextField("RAM 32GB");
        userRam.setBounds(100,650,200,25);
        p.add(userRam);

        remove_receipt = new JTextField("Hoadon_lap_1");
        remove_receipt.setBounds(1100,650,150,25);
        p.add(remove_receipt);

        userCapacity = new JTextField("1000GB");
        userCapacity.setBounds(100,700,200,25);
        p.add(userCapacity);

        JScrollPane pane = new JScrollPane(outline,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        pane.setBounds(450, 300, 1000, 250);
        p.add(pane);

        PANE[0] = new JScrollPane(TABLE_Laptop);
        PANE[0].setBounds(450,50,1000,250);
        p.add(PANE[0]);

        AddData = (DefaultTableModel) TABLE_Laptop.getModel();
        AddData.setColumnIdentifiers(COLUMN);

        JButton btn1 = new JButton("Đọc File");
        btn1.setBounds(450, 700, 150, 25);
        btn1.setForeground(Color.white);
        btn1.setBackground(new Color(50, 50, 50));
        ActionListener action1 = new ACTION1();
        btn1.addActionListener(action1);
        p.add(btn1);

        JButton btn2 = new JButton("Thêm đơn");
        btn2.setBounds(650, 700, 150, 25);
        btn2.setForeground(Color.white);
        btn2.setBackground(new Color(50, 50, 50));
        ActionListener action_add = new ACTION_ADD();
        btn2.addActionListener(action_add);
        p.add(btn2);

        JButton btn3 = new JButton("Xóa");
        btn3.setBounds(900, 700, 150, 25);
        btn3.setForeground(Color.white);
        btn3.setBackground(new Color(50, 50, 50));
        ActionListener action_delete = new ACTION_DELETE();
        btn3.addActionListener(action_delete);
        p.add(btn3);

        JButton btn4 = new JButton("Xóa đơn");
        btn4.setBounds(1100, 700, 150, 25);
        btn4.setForeground(Color.white);
        btn4.setBackground(new Color(50, 50, 50));
        ActionListener action_remove = new ACTION_REMOVE();
        btn4.addActionListener(action_remove);
        p.add(btn4);

        JButton btn5 = new JButton("Thùng rác");
        btn5.setBounds(1300, 700, 150, 25);
        btn5.setForeground(Color.white);
        btn5.setBackground(new Color(50, 50, 50));
        ActionListener action_undo = new ACTION_UNDO();
        btn5.addActionListener(action_undo);
        p.add(btn5);

        p.setLayout(null);
        window.setVisible(true);

    }
}

