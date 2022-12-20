import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JTextField;

public class App<T> extends JFrame{


    public static JLabel text_input = new JLabel();
    public static JTextArea outline = new JTextArea(10,10);
    public static JTextField out = new JTextField();


    public void main(String[] arg){

        new App<T>();

    }
    public App() {

        JFrame window = new JFrame("App");
        JPanel p = new JPanel();
        window.setSize(500,200);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.add(p);
        JButton btn1 = new JButton("Practice1");
        btn1.setBounds(50, 50, 100, 25);
        btn1.setForeground(Color.white);
        btn1.setBackground(new Color(50, 50, 50));
        ActionListener action1 = new Practice1();
        btn1.addActionListener(action1);
        JButton btn2 = new JButton("Practice3");
        btn2.setBounds(200, 50, 100, 25);
        btn2.setForeground(Color.white);
        btn2.setBackground(new Color(50, 50, 50));
        ActionListener action2 = new Practice3();
        btn2.addActionListener(action2);
        JButton btn3 = new JButton("Practice6");
        btn3.setBounds(350, 50, 100, 25);
        btn3.setForeground(Color.white);
        btn3.setBackground(new Color(50, 50, 50));
        ActionListener action3 = new Practice6();
        btn3.addActionListener(action3);
        JButton btn4 = new JButton("Practice7");
        btn4.setBounds(50, 100, 100, 25);
        btn4.setForeground(Color.white);
        btn4.setBackground(new Color(50, 50, 50));
        ActionListener action4 = new Practice7();
        btn4.addActionListener(action4);
        JButton btn5 = new JButton("Practice14");
        btn5.setBounds(200, 100, 100, 25);
        btn5.setForeground(Color.white);
        btn5.setBackground(new Color(50, 50, 50));
        ActionListener action5 = new Practice14();
        btn5.addActionListener(action5);
        JButton btn6 = new JButton("Practice15");
        btn6.setBounds(350, 100, 100, 25);
        btn6.setForeground(Color.white);
        btn6.setBackground(new Color(50, 50, 50));
        ActionListener action6 = new Practice15();
        btn6.addActionListener(action6);
        p.add(btn1);
        p.add(btn2);
        p.add(btn3);
        p.add(btn4);
        p.add(btn5);
        p.add(btn6);
        p.setLayout(null);
        window.setVisible(true);

    }
}























































