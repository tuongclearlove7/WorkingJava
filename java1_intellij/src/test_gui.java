import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test_gui
{
    private static final int FRAME_WIDTH = 100;
    private static final int FRAME_HEIGHT = 100;

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        JButton button1 = new JButton("Click me!");
        panel.add(button1);
        JButton button2 = new JButton("Click me!");
        panel.add(button2);
        frame.add(panel);

        ActionListener listener = new Clicked();
        button1.addActionListener(listener);


        ActionListener listener2 = new Clicked();
        button2.addActionListener(listener2);

        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

