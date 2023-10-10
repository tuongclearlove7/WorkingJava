import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Handle_Button_Event_Clean implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println("Clean text !!!");

        
        App.ShowData.setText("");

        boolean clean_file = false;

        try {

            File file = new File(App.PATH_TXT);
            FileWriter fw = new FileWriter(file, clean_file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("");
            JLabel cleansuccess = new JLabel("Xóa thành công!");
            App.MESSENGER2.add(cleansuccess);
            App.MESSENGER2.setSize(200, 100);
            App.MESSENGER2.setVisible(true);
            bw.close();
            fw.close();

        }

        catch (Exception err) {
            JLabel cleanfail = new JLabel("Xóa thất bại!");
            App.MESSENGER2.add(cleanfail);
            App.MESSENGER2.setSize(200, 100);
            App.MESSENGER2.setVisible(true);
        }

    }
}
