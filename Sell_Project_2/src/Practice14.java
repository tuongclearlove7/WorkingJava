import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Practice14 extends Practice6 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent event) {



        EventQueue.invokeLater(new Runnable() {

            public void run() {

                JFrame window = new JFrame();
                JPanel panel = new JPanel();
                window.setTitle("Practice14");
                window.setSize(500, 300);
                window.add(panel);
                App.text_input = new JLabel("Nhap chuoi : ");
                App.text_input.setBounds(30, 50, 100, 25);
                input_str = new JTextField();
                input_str.setText("Hello___DUY_///./?&&&___TaN.......'//./;// ha");
                input_str.setBounds(120, 50, 250, 25);
                App.out = new JTextField();
                App.out.setBounds(70, 150, 345, 100);
                JButton button = new JButton("Output");
                button.setBounds( 190, 100, 100, 30);
                button.setForeground(Color.white);
                button.setBackground(new Color(50, 50, 50));
                panel.add(input_str);
                panel.add(App.text_input);
                panel.add(button);
                panel.add(App.out);
                panel.setLayout(null);
                window.setVisible(true);

                button.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent event) {


                        String user =  input_str.getText();

                        Count_String(user);

                    }

                    public static void Count_String(String str) {

                        String str1 = str + " ";
                        int count = 0;

                        for (int i = 0; i < str1.length(); i++) {
                            if (((str1.charAt(i) >= 'a' && str1.charAt(i) < 'z') || (str1.charAt(i) >= 'A' && str1.charAt(i) < 'Z')) && !((str1.charAt(i + 1) >= 'a' && str.charAt(i + 1) < 'z') || (str1.charAt(i + 1) >= 'A' && str1.charAt(i + 1) < 'Z'))) {

                                count++;

                            }
                        }
                        App.out.setText("so tu trong chuoi la : " + count);
                    }
                });
            }
        });
    }
}

