import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

interface METHOD3{

}
public class Handle_Button_Event_3 implements ActionListener, METHOD3 {

    private int i = 0;

    @Override
    public void actionPerformed(ActionEvent event) {

        EventQueue.invokeLater(new Runnable()
        {
            public void run() {

                JFrame SCREEN = new JFrame();
                JPanel panel = new JPanel();
                Image icon = Toolkit.getDefaultToolkit().getImage(GUI.PATH_ICON);

                SCREEN.setIconImage(icon);
                SCREEN.setTitle("Practice6");
                SCREEN.setVisible(true);
                SCREEN.setSize(500, 250);
                SCREEN.add(panel);
                panel.setLayout(null);

                GUI.LABEL_INPUT = new JLabel("Input : ");
                GUI.LABEL_INPUT.setBounds(30, 50, 100, 25);
                GUI.LABEL_INPUT.setForeground(new Color(21, 160, 153));
                panel.add(GUI.LABEL_INPUT);

                GUI.USER_INPUT_STR = new JTextField();
                GUI.USER_INPUT_STR.setText("");
                GUI.USER_INPUT_STR.setBounds(120, 50, 345, 25);
                panel.add(GUI.USER_INPUT_STR);

                GUI.RESULT = new JTextField("Practice 6: Mã hóa và giải mã chuỗi");
                GUI.RESULT.setBounds(120, 100, 345, 100);
                GUI.RESULT.setForeground(Color.red);
                panel.add(GUI.RESULT);


                JButton BUTTON = new JButton("Result");
                BUTTON.setBounds( 10, 130, 100, 30);
                BUTTON.setForeground(Color.cyan);
                BUTTON.setBackground(new Color(50, 50, 50));
                panel.add(BUTTON);
                BUTTON.addActionListener(new ActionListener() {


                    public void actionPerformed(ActionEvent event) {

                        String str = GUI.USER_INPUT_STR.getText();
                        String[] str1 = new String[str.length()];
                        Encode_String(str,str1);

                    }
                });
            }
        });
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

        for (int j = 0; j < h; j++) {

            GUI.RESULT.setText("Chuoi sau khi ma hoa la :\n" + Arrays.toString(str1));
            System.out.println("Chuoi sau khi ma hoa la : " + Arrays.toString(str1));

            break;
        }
    }
}
