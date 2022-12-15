import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test {
    // frame
    public static  JFrame screen = new JFrame();
    // Table
    public static JTable j;

    public static JTextField USER_INPUT =  new JTextField();

    public static String user;
    String s;




    // Constructor
    test()
    {

        JPanel panel = new JPanel();
        screen.setTitle("Practice1");
        screen.setVisible(true);
        screen.setSize(400, 300);
        screen.add(panel);
        screen.setDefaultCloseOperation(screen.EXIT_ON_CLOSE);
        panel.setLayout(null);

        USER_INPUT = new JTextField("");// label column
        USER_INPUT.setBounds(10, 20, 300, 25);
        USER_INPUT.setForeground(Color.red);
        panel.add(USER_INPUT);

        JButton BUTTON = new JButton("Result");// nút bấm
        BUTTON.setBounds( 100, 170, 100, 30);
        BUTTON.setForeground(Color.cyan);
        BUTTON.setBackground(new Color(50, 50, 50));
        panel.add(BUTTON);
        BUTTON.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {

                    test.user = USER_INPUT.getText();

                }
            }
        );

        String[] columnNames = { "First Name", "Middle Name", "Last Name", };

        String[][] data = {

                {test.user,test.user,test.user},
                {test.user,test.user,test.user},
                {test.user,test.user,test.user},
                {test.user,test.user,test.user},

        };

        System.out.print(test.user);

        j = new JTable(data,columnNames);
        j.setBounds(50, 70, 200, 65);
        panel.add(j);
        screen.setSize(500, 250);

        screen.setVisible(true);

    }


    public static void main(String[] args)
    {
        new test();
    }
}


