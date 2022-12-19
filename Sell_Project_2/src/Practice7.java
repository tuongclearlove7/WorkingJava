import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;


public class Practice7 implements ActionListener {

    private JFormattedTextField input_primenumbers;

    @Override
    public void actionPerformed(ActionEvent event) {

        EventQueue.invokeLater(new Runnable() {

            public void run() {

                JFrame window = new JFrame();
                JPanel panel = new JPanel();
                window.setTitle("Practice 7");
                window.setSize(500, 300);
                window.add(panel);
                App.text_input = new JLabel("Nhap so snt  : ");
                App.text_input.setBounds(10, 50, 100, 25);
                input_primenumbers = new JFormattedTextField();
                input_primenumbers.setValue(0);
                input_primenumbers.setBounds(120, 50, 250, 25);
                App.outline = new JTextArea();
                JScrollPane pane = new JScrollPane(App.outline,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                pane.setBounds(70, 150, 345, 100);
                JButton button = new JButton("Output");
                button.setBounds( 190, 100, 100, 30);
                button.setForeground(Color.white);
                button.setBackground(new Color(50, 50, 50));
                panel.add(App.text_input);
                panel.add(input_primenumbers);
                panel.add(button);
                panel.add(pane);
                panel.setLayout(null);
                window.setVisible(true);

                button.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent event) {

                        int n = (int) input_primenumbers.getValue();

                        if(n == 0){
                            App.outline.setText("không có số nào " + String.valueOf(0));
                        }

                        super_prime_number(n);
                    }

                    public static boolean check(int n) {

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

                    public static void super_prime_number(int n) {

                        int count = 0;
                        String str = "";

                        if (n > 0 || n < 10) {
                            if(n == 1){
                                for (int i = 0; i < 10; i++) {
                                    if (check(i) == true) {

                                        str = str + i + " ";
                                        count++;
                                    }
                                }

                                App.outline.setText("có : " + count + " số siêu nguyên tố có " + n + " chữ số " + "\ndãy số nguyên tố : " + str);
                            }

                            if (n == 2) {
                                int k = 0;
                                for (int i = 10; i < 100; i++) {
                                    k = i;

                                    while (check(k) == true) {
                                        k = k / 10;
                                        if (k == 0) {
                                            str = str + i + " ";
                                            count++;
                                        }
                                    }
                                }

                                App.outline.setText("có : " + count + " số siêu nguyên tố có " + n + " chữ số " + "\ndãy số nguyên tố : " + str);
                            }

                            if(n == 3) {

                                int  k = 0;

                                for (int i = 10; i < 1000; i++) {
                                    k=i;
                                    while (check(k) == true) {

                                        k = k / 10;

                                        if (k == 0) {

                                            str = str + i + " ";

                                            count++;
                                        }
                                    }
                                }

                                App.outline.setText("có : " + count + " số siêu nguyên tố có " + n + " chữ số " + "\ndãy số nguyên tố : " + str);
                            }

                            if ( n == 4) {

                                for (int i = 1000; i < 10000; i++) {
                                    int f = i;
                                    while (check(f)) {
                                        f = f / 10;
                                    }
                                    if (f == 0) {
                                        str = str + i + " ";
                                        count++;

                                    }
                                }

                                App.outline.setText("có : " + count + " số siêu nguyên tố có " + n + " chữ số " + "\ndãy số nguyên tố : " + str);
                            }

                            if(n == 5){

                                for (int i = 10000; i < 100000; i++) {
                                    int f = i;
                                    while (check(f)) {
                                        f = f / 10;
                                    }
                                    if (f == 0) {
                                        str = str + i + " ";
                                        count++;

                                    }

                                    App.outline.setText("có : " + count + " số siêu nguyên tố có " + n + " chữ số " + "\ndãy số nguyên tố : " + str);
                                }

                                if (n == 6){
                                    for (int i = 100000; i < 1000000; i++) {
                                        int f = i;
                                        while (check(f)) {
                                            f = f / 10;
                                        }
                                        if (f == 0) {

                                            System.out.print(i + " ");
                                            count++;
                                        }

                                    }

                                    System.out.println("co : " + count + " so nguyen to co " + n + " chu so " + "\ndãy số nguyên tố : " + str);
                                }

                                if (n == 7){
                                    for (int i = 1000000; i < 10000000; i++) {
                                        int f = i;
                                        while (check(f)) {
                                            f = f / 10;
                                        }

                                        if (f == 0) {
                                            System.out.print(i + " ");
                                            count++;
                                        }

                                    }

                                    System.out.println("co : " + count + " so nguyen to co " + n + " chu so " + "\ndãy số nguyên tố : " + str);
                                }

                                if (n == 8){
                                    for (int i = 10000000; i < 100000000; i++) {
                                        int f = i;
                                        while (check(f)) {
                                            f = f / 10;
                                        }
                                        if (f == 0) {
                                            System.out.print(i + " ");
                                            count++;
                                        }

                                    }

                                    System.out.println("co : " + count + " so nguyen to co " + n + " chu so " + "\ndãy số nguyên tố : " + str);
                                }

                                if (n == 9){
                                    for (int i = 100000000; i < 1000000000; i++) {
                                        int f = i;
                                        while (check(f)) {
                                            f = f / 10;
                                        }
                                        if (f == 0) {

                                            System.out.print(i + " ");
                                            count++;
                                        }
                                    }

                                    System.out.println("co : " + count + " so nguyen to co " + n + " chu so " + "\ndãy số nguyên tố : " + str);
                                }
                            }
                        }
                    }
                });
            }
        });
    }
}
