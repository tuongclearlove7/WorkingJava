import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Handle_Button_Event_READFILE extends JFrame implements ActionListener {

    DefaultListModel<String> listModel;
    private JList jList;

    @Override
    public void actionPerformed(ActionEvent e) {

        try {

            File file = new File(App.PATH_TXT);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            StringBuffer sb = new StringBuffer();
            String line;

            while((line=br.readLine()) != null) {

                sb.append(line);
                sb.append("\n");
            }

            fr.close();
            System.out.println("Contents of File: ");
            System.out.println(sb.toString());
            App.ShowData.setText(sb.toString());

            }

        catch (Exception err) {

            err.printStackTrace();
        }
    }
}
