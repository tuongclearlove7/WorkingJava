import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

interface METHOD4{

}

public class Handle_Button_Event_4 implements ActionListener,METHOD4 {

    private int i = 0;

    public static void main(String args[]){


    }

    @Override
    public void actionPerformed(ActionEvent event) {

        EventQueue.invokeLater(new Runnable()
        {
            public void run() {

                JFrame SCREEN = new JFrame();
                JPanel panel = new JPanel();
                Image icon = Toolkit.getDefaultToolkit().getImage(GUI.PATH_ICON);

                SCREEN.setIconImage(icon);
                SCREEN.setTitle("Practice7");
                SCREEN.setVisible(true);
                SCREEN.setSize(500, 250);
                SCREEN.add(panel);
                panel.setLayout(null);

                GUI.LABEL_INPUT = new JLabel("Input : ");
                GUI.LABEL_INPUT.setBounds(30, 50, 100, 25);
                GUI.LABEL_INPUT.setForeground(new Color(21, 160, 153));
                panel.add(GUI.LABEL_INPUT);

                GUI.USER_INPUT_PRIME = new JFormattedTextField();
                GUI.USER_INPUT_PRIME.setValue(0);
                GUI.USER_INPUT_PRIME.setBounds(120, 50, 345, 25);
                panel.add(GUI.USER_INPUT_PRIME);


                GUI.RESULT = new JTextField("Practice 7: Số siêu nguyên tố");
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

                        int n = (int) GUI.USER_INPUT_PRIME.getValue();
                        SuperPrimeNumber(n);

                        if(n == 6){

                            GUI.RESULT.setText("vui long nhap so nguyen be hon 6 !");

                        }

                        if(n > 6){

                            System.exit(0);
                        }

                        if(n == 0){

                            GUI.RESULT.setText("vui long nhap so nguyen lon hon 0 !");
                        }
                    }
                });
            }
        });
    }

    public static boolean CheckPrimeNumber(int n) {

        if (n < 2) {

            return false;
        }

        int squareRoot = (int) Math.sqrt(n);

        for (int i = 2; i <= squareRoot; i++) {

            if (n % i == 0) {

                return false;
            }
        }

        return true;
    }

    public static void SuperPrimeNumber(int n) {
        int count = 0;

        if (n > 0 || n < 10) {

            switch (n) {

                case 1:

                    String str1 = "";

                    for (int i = 0; i < 10; i++) {

                        if (CheckPrimeNumber(i) == true) {

                            str1 = str1 + i + " ";
                            count++;
                        }
                    }

                    GUI.RESULT.setText("so luong sieu so nguyen to co 2 chu so la: " + count + ", cac so nguyen to la : " + str1);

                    break;

                case 2 : {

                    String str2 = "";
                    int k = 0;

                    for (int i = 10; i < 100; i++) {

                        k = i;

                        while (CheckPrimeNumber(k) == true) {

                            k = k / 10;
                            if (k == 0) {

                                str2 = str2 + i + " ";
                                count++;
                            }
                        }
                    }

                    GUI.RESULT.setText("so luong sieu so nguyen to co 2 chu so la: " + count + ", cac so nguyen to la : " + str2);

                    break;
                }

                case 3: {

                    String str3 = "";
                    int  k = 0;

                    for (int i = 10; i < 1000; i++) {

                        k=i;

                        while (CheckPrimeNumber(k) == true) {

                            k = k / 10;

                            if (k == 0) {

                                str3 = str3 + i + " ";

                                count++;
                            }
                        }
                    }

                    GUI.RESULT.setText("so luong sieu so nguyen to co 2 chu so la: " + count + ", cac so nguyen to la : " + str3);

                    break;

                }

                case 4:

                    String str4 = "";

                    for (int i = 1000; i < 10000; i++) {

                        int f = i;

                        while (CheckPrimeNumber(f)) {

                            f = f / 10;
                        }
                        if (f == 0) {

                            str4 = str4 + i + " ";
                            count++;

                        }
                    }

                    GUI.RESULT.setText("so luong sieu so nguyen to co 2 chu so la: " + count + ", cac so nguyen to la : " + str4);

                    break;

                case 5:

                    String str5 = "";

                    for (int i = 10000; i < 100000; i++) {

                        int f = i;

                        while (CheckPrimeNumber(f)) {

                            f = f / 10;
                        }
                        if (f == 0) {

                            str5 = str5 + i + " ";
                            count++;

                        }

                            GUI.RESULT.setText("so luong sieu so nguyen to co 2 chu so la: " + count + ", cac so nguyen to la : " + str5);

                    }

                    break;

                case 6:

                    for (int i = 100000; i < 1000000; i++) {

                        int f = i;

                        while (CheckPrimeNumber(f)) {

                            f = f / 10;
                        }
                        if (f == 0) {

                            System.out.print(i + " ");
                            count++;
                        }

                    }
                    System.out.println("\nco " + count + " so nguyen to");
                    break;

                case 7:

                    for (int i = 1000000; i < 10000000; i++) {

                        int f = i;

                        while (CheckPrimeNumber(f)) {
                            f = f / 10;
                        }

                        if (f == 0) {

                            System.out.print(i + " ");
                            count++;
                        }

                    }

                    System.out.println("\nco " + count + " so nguyen to");

                    break;

                case 8:

                    for (int i = 10000000; i < 100000000; i++) {

                        int f = i;

                        while (CheckPrimeNumber(f)) {

                            f = f / 10;
                        }
                        if (f == 0) {

                            System.out.print(i + " ");
                            count++;
                        }

                    }

                    System.out.println("\nco " + count + " so nguyen to");
                    break;

                case 9:

                    for (int i = 100000000; i < 1000000000; i++) {

                        int f = i;

                        while (CheckPrimeNumber(f)) {
                            f = f / 10;
                        }
                        if (f == 0) {

                            System.out.print(i + " ");
                            count++;
                        }
                    }

                    System.out.println("\nco " + count + " so nguyen to");
                    break;

            }
        }
    }
}
