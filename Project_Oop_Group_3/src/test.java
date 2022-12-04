import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class test extends JFrame {

    private static final long serialVersionUID = 1L;

    public test() {

        // set flow layout for the frame
        this.getContentPane().setLayout(new FlowLayout());

        JLabel label = new JLabel("Java Code Geeks - Java Examples");

        // if true the component paints every pixel within its bounds
        label.setOpaque(true);

        // sets the background color of this component
        // the background color is used only if the component is opaque
        label.setBackground(Color.BLUE);

        // add label to frame
        add(label);

    }

    private static void createAndShowGUI() {

        //Create and set up the window.

        JFrame frame = new test();

        //Display the window.

        frame.pack();

        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {

        //Schedule a job for the event-dispatching thread:

        //creating and showing this application's GUI.

        javax.swing.SwingUtilities.invokeLater(new Runnable() {

            public void run() {

                createAndShowGUI();

            }

        });
    }

}