import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Handle_Button_Event_WriteFile implements ActionListener {

    private int I = 0;

    @Override
    public void actionPerformed(ActionEvent e) {

        I++;
        System.out.print(I);

        String BIGDATA[] = {

                App.ID.getText(), App.FIRSTNAME.getText(),

                App.LASTNAME.getText(), App.BIRTHDAY.getText(),

                App.HomeWorkScore.getText(), App.DiscussionScore.getText(),

                App.FrequentScore.getText(), App.FinalScore.getText(),

                App.MediumScore.getText(),
        };

        try {

            File file = new File(App.PATH_TXT);
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Insert " + I + "\n");

            for(int i = 0; i < App.COLUMN.length; i++){

               // bw.write(App.COLUMN[i] + "\t");
            }



            for(int i=0 ; i < App.TABLE.getRowCount(); i++){

                for(int j=0; j < App.COLUMN.length; j++){

                    bw.write(App.TABLE.getModel().getValueAt(i, j) + "  ");

                }

                bw.newLine();
            }

            bw.close();
            fw.close();
        }

        catch (Exception ignored){

            JLabel fail = new JLabel("              Lưu thất bại");

            App.MESSENGER.add(fail);

            App.MESSENGER.setSize(200, 100);

            App.MESSENGER.setVisible(true);

        }

        finally {

            JLabel success = new JLabel("              Lưu thành công");

            App.MESSENGER.add(success);

            App.MESSENGER.setSize(200, 100);

            App.MESSENGER.setVisible(true);
        }
    }
}
