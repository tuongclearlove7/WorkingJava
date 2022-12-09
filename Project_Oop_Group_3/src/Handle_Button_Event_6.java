import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

interface METHOD6{

}

public class Handle_Button_Event_6 implements ActionListener,METHOD6 {

    private int i = 0;

    public String standardString(String str) {

        String newStr="";
        String str2="";

        for(int i=0;i<str.length();i++){

            if((str.charAt(i)>='a'&&str.charAt(i)<='z')||

                    (str.charAt(i)>='A'&&str.charAt(i)<='Z')||str.charAt(i)==' '){str2=str2+str.charAt(i);
            }
        }

        String replaceStrings = str2.replaceAll("\\s{2,}", " ").trim();

        String replaceStrings1 = replaceStrings.toLowerCase();

        String[] arr = replaceStrings1.split(" ");

        for (String arr1 : arr) {

            char c = arr1.charAt(0);
            String sub = arr1.substring(1);
            String c1 = String.valueOf(c).toUpperCase();
            newStr = newStr+c1 + sub + " ";
        }

        return newStr;
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        EventQueue.invokeLater(new Runnable()
        {
            public void run() {

                JPanel panel = new JPanel();
                GUI.ICON = Toolkit.getDefaultToolkit().getImage(GUI.PATH_ICON);
                GUI.SCREEN.setIconImage(GUI.ICON);
                GUI.SCREEN.setTitle("Practice15");
                GUI.SCREEN.setVisible(true);
                GUI.SCREEN.setSize(800, 250);
                GUI.SCREEN.add(panel);
                panel.setLayout(null);

                GUI.LABEL_INPUT = new JLabel("Input String : ");
                GUI.LABEL_INPUT.setBounds(300, 50, 100, 25);
                GUI.LABEL_INPUT.setForeground(new Color(21, 160, 153));
                panel.add(GUI.LABEL_INPUT);

                GUI.USER_INPUT_PRACTICE15 = new JFormattedTextField();
                GUI.USER_INPUT_PRACTICE15.setText("");
                GUI.USER_INPUT_PRACTICE15.setBounds(400, 50, 345, 25);
                panel.add(GUI.USER_INPUT_PRACTICE15);

                GUI.RESULT = new JTextField("Practice 15: Chuẩn hóa chuỗi ký tự");
                GUI.RESULT.setBounds(400, 100, 345, 100);
                GUI.RESULT.setForeground(Color.red);
                panel.add(GUI.RESULT);

                JButton BUTTON = new JButton("Result");
                BUTTON.setBounds( 290, 130, 100, 30);
                BUTTON.setForeground(Color.cyan);
                BUTTON.setBackground(new Color(50, 50, 50));
                panel.add(BUTTON);
                BUTTON.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent event) {

                        String user = GUI.USER_INPUT_PRACTICE15.getText();

                        try {

                            GUI.RESULT.setText("the standard string is : " + standardString(user));

                        }
                        catch (Exception Error) {

                            GUI.RESULT.setText("vui long nhap vao 1 chuoi !!!");
                        }
                    }
                });
            }
        });
    }
}
