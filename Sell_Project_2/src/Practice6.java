import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Practice6 extends Practice3 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent event) {

        EventQueue.invokeLater(new Runnable() {

            public void run() {

                JFrame window = new JFrame();
                JPanel panel = new JPanel();
                window.setTitle("Practice6");
                window.setSize(500, 300);
                window.add(panel);
                App.text_input = new JLabel("Nhap chuoi : ");
                App.text_input.setBounds(30, 50, 100, 25);
                input_str = new JTextField();
                input_str.setText("DUYYYYYYYYYY Tannnnnnnnnnnnnnn");
                input_str.setBounds(120, 50, 250, 25);
                App.out = new JTextField();
                App.out.setBounds(70, 150, 345, 100);
                JScrollPane pane = new JScrollPane(App.out,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                pane.setBounds(70, 150, 345, 100);
                JButton button = new JButton("Output");
                button.setBounds( 190, 100, 100, 30);
                button.setForeground(Color.white);
                button.setBackground(new Color(50, 50, 50));
                panel.add(App.text_input);
                panel.add(input_str);
                panel.add(pane);
                panel.add(button);
                panel.setLayout(null);
                window.setVisible(true);

                button.addActionListener(new ActionListener() {


                    public void actionPerformed(ActionEvent event) {

                        String str = input_str.getText();
                        String[] str1 = new String[str.length()];
                        Encode_String(str,str1);

                    }

                    private static void Encode_String(String str, String[] str1){
                        int b;
                        int h = 0;
                        char g;
                        for (int i = 0; i < str.length(); i++) {
                            b = str.charAt(i);
                            if (b >= 'a' && b <= 'z') {
                                b = b - 97;
                                b = b + 5;
                                b = b % 26;
                                b = b + 97;
                                g = (char) (b - 32);
                                str1[i] = g + "";
                                h++;
                            }
                            else if (b >= 'A' && b <= 'Z') {
                                b = b - 65;
                                b = b + 5;
                                b = b % 26;
                                b = b + 65;
                                g = (char) b;
                                str1[i] = g + "";
                                h++;
                            }
                            else if (b == -65) {
                                str1[i] = " ";
                                h++;
                            }
                        }
                        String tostring = " ";

                        for (int j = 0; j < h ; j++) {
                            tostring  = tostring + str1[j] + " ";
                            App.out.setText("chuỗi sau khi mã hóa : " + tostring);

                        }
                    }
                });
            }
        });
    }
}
