import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Practice15 extends Practice14 implements ActionListener{

    private static char space = ' ';

    @Override
    public void actionPerformed(ActionEvent event) {

        EventQueue.invokeLater(new Runnable()
        {
            public void run() {

                JFrame window = new JFrame();
                JPanel panel = new JPanel();
                window.setTitle("Practice15");
                window.setSize(500, 300);
                window.add(panel);
                App.text_input = new JLabel("Nhap chuoi : ");
                App.text_input.setBounds(30, 50, 100, 25);
                input_str = new JTextField();
                input_str.setText("hello%^*()_duy          tan");
                input_str.setBounds(120, 50, 250, 25);
                App.out = new JTextField();
                App.out.setBounds(70, 150, 345, 100);
                JButton button = new JButton("Output");
                button.setBounds( 190, 100, 100, 30);
                button.setForeground(Color.white);
                button.setBackground(new Color(50, 50, 50));
                panel.add(App.text_input);
                panel.add(input_str);
                panel.add(App.out);
                panel.add(button);
                panel.setLayout(null);
                window.setVisible(true);

                button.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent event) {

                        String user = input_str.getText();

                        capitalizeString(user);

                    }

                    public static void capitalizeString(String str) {

                        String tostring = "";
                        String result = "";

                        for (int i = 0; i < str.length(); i++){
                            if((str.charAt(i)>='a'&&str.charAt(i)<='z')|| (str.charAt(i)>='A'&&str.charAt(i)<='Z')|| str.charAt(i) == space){

                                tostring = tostring + str.charAt(i);

                            }
                        }

                        String s = tostring.replaceAll("\\s+", "");
                        String[] arr = s.split(" ");

                        for (String word : arr) {
                            result = result + word.substring(0,1).toUpperCase() + word.substring(1,word.length()) + " ";
                            App.out.setText("Chuẩn hóa chuỗi ký tự : "+ result);
                        }
                    }
                });
            }
        });
    }
}

