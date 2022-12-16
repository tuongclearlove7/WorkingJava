


import javax.swing.*;
public class test
{
    JFrame f;
    JTextArea ta;
    JScrollPane scrolltxt;

    public test()
    {
        // TODO Auto-generated constructor stub

        f=new JFrame();
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(500,500);
        ta=new JTextArea();
        ta.setBounds(5,5,100,200);

        scrolltxt=new JScrollPane(ta);
        scrolltxt.setBounds(3,3,400,400);

        f.add(scrolltxt);

    }

    public static void main(String[] args)
    {
        new test();
    }
}