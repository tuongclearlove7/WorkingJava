import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

interface METHOD5{

}


public class Handle_Button_Event_5 implements ActionListener,METHOD5 {

    private int i = 0;

    public int countWord(String str) {

        String str1 = str + " ";
        int count = 0;

        for (int i = 0; i < str1.length(); i++) {

            if (((str1.charAt(i) >= 'a' && str1.charAt(i) < 'z') || (str1.charAt(i) >= 'A' && str1.charAt(i) < 'Z'))

                    && !((str1.charAt(i + 1) >= 'a' && str.charAt(i + 1) < 'z')
                    || (str1.charAt(i + 1) >= 'A' && str1.charAt(i + 1) < 'Z'))) {

                count++;

            }
        }

        return count;
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        EventQueue.invokeLater(new Runnable() {

            public void run() {

                JFrame SCREEN = new JFrame();
                JPanel panel = new JPanel();
                GUI.ICON = Toolkit.getDefaultToolkit().getImage(GUI.PATH_ICON);
                SCREEN.setIconImage(GUI.ICON);
                SCREEN.setTitle("Practice14");
                SCREEN.setVisible(true);
                SCREEN.setSize(500, 250);
                SCREEN.add(panel);
                panel.setLayout(null);

                GUI.LABEL_INPUT = new JLabel("Input String : ");
                GUI.LABEL_INPUT.setBounds(30, 50, 100, 25);
                GUI.LABEL_INPUT.setForeground(new Color(21, 160, 153));
                panel.add(GUI.LABEL_INPUT);

                GUI.USER_INPUT_PRACTICE14 = new JTextField();
                GUI.USER_INPUT_PRACTICE14.setText("Khanh_Gioi_Tuong_Thanh Dai");
                GUI.USER_INPUT_PRACTICE14.setBounds(120, 50, 345, 25);
                panel.add(GUI.USER_INPUT_PRACTICE14);

                GUI.RESULT = new JTextField("Practice 14: Đếm số từ trong chuỗi");
                GUI.RESULT.setBounds(120, 100, 345, 100);
                GUI.RESULT.setForeground(Color.red);
                panel.add(GUI.RESULT);

                JButton BUTTON = new JButton("Output");
                BUTTON.setBounds( 10, 130, 100, 30);
                BUTTON.setForeground(Color.cyan);
                BUTTON.setBackground(new Color(50, 50, 50));
                panel.add(BUTTON);
                BUTTON.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent event) {


                        String user =  GUI.USER_INPUT_PRACTICE14.getText();

                        GUI.RESULT.setText("the number of word in String is :  " + countWord(user));

                    }
                });
            }
        });
    }
}
