import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JTextField;

public class test {

    public static JFormattedTextField USER_INPUT_PRIME =  new JFormattedTextField();

    public static JTextField RESULT = new JTextField();

    public static JFrame SCREEN = new JFrame("Algorithmn Team 3");

    public static JPanel panel = new JPanel();


    public static void test() {

        SCREEN.setSize(250,250);
        SCREEN.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        SCREEN.add(panel);
        panel.setLayout(null);

        test.USER_INPUT_PRIME = new JFormattedTextField();
        test.USER_INPUT_PRIME.setValue(0);
        test.USER_INPUT_PRIME.setBounds(15, 60, 200, 25);
        panel.add(test.USER_INPUT_PRIME);

        test.RESULT = new JTextField("");
        test.RESULT.setBounds(15, 100, 200, 100);
        panel.add(test.RESULT);


        JButton BUTTON4 = new JButton("Practice7");
        BUTTON4.setBounds(60, 30, 100, 25);
        BUTTON4.setForeground(Color.cyan);
        BUTTON4.setBackground(new Color(50, 50, 50));
        ActionListener listener4 = new PRATICE7();
        BUTTON4.addActionListener(listener4);
        panel.add(BUTTON4);

        SCREEN.setVisible(true);

    }

    public static void main(String[] args)  {

        test();

    }
}

class PRATICE7 implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent event){

        int n = (int) test.USER_INPUT_PRIME.getValue();
        SuperPrimeNumber(n);

        if(n > 5){

            test.RESULT.setText("vui long nhap so nguyen be hon 6 !");
        }

        if(n == 0){

            test.RESULT.setText("vui long nhap so nguyen lon hon 0 !");
        }
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

                    for (int i = 1; i < 10; i++) {

                        int f = i;

                        while (CheckPrimeNumber(f)) {
                            f = f / 10;

                        }
                        if (f == 0) {

                            count++;

                            test.RESULT.setText((i + " co " + count + " so nguyen to"));
                        }

                    }
                    System.out.print("\nco " + count + " so nguyen to");
                    break;
                case 2: {
                    for (int i = 10; i < 100; i++) {

                        int f = i;

                        while (CheckPrimeNumber(f)) {
                            f = f / 10;
                        }
                        if (f == 0) {

                            count++;

                            test.RESULT.setText((i + " co " + count + " so nguyen to"));
                        }

                    }
                    System.out.print("\nco " + count + " so nguyen to");
                }
                break;
                case 3:
                    for (int i = 100; i < 1000; i++) {

                        int f = i;

                        while (CheckPrimeNumber(f)) {
                            f = f / 10;
                        }
                        if (f == 0) {

                            count++;

                            test.RESULT.setText((i + " co " + count + " so nguyen to"));
                        }

                    }
                    System.out.print("\nco " + count + " so nguyen to");

                    break;

                case 4:

                    for (int i = 1000; i < 10000; i++) {

                        int f = i;

                        while (CheckPrimeNumber(f)) {

                            f = f / 10;
                        }
                        if (f == 0) {

                            count++;

                            test.RESULT.setText((i + " co " + count + " so nguyen to"));

                        }
                    }

                    System.out.print("\nco " + count + " so nguyen to");

                    break;

                case 5:
                    for (int i = 10000; i < 100000; i++) {

                        int f = i;

                        while (CheckPrimeNumber(f)) {
                            f = f / 10;
                        }
                        if (f == 0) {

                            count++;

                            test.RESULT.setText((i + " co " + count + " so nguyen to"));
                        }

                    }
                    System.out.print("\nco " + count + " so nguyen to");

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

