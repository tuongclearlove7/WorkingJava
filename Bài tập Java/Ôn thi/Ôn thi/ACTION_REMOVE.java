import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 *
 * Xóa đơn
 *
 * */

public class ACTION_REMOVE implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        ArrayList<Laptop> list_laptop = new ArrayList<>();
        Laptop lap = new Laptop(App.userreceipt_ID.getText(), App.userdevice_ID.getText(), App.userProduct.getText(), App.userModel.getText(), (int) App.userSize.getValue(),  App.userResolution.getText(), App.userType.getText(), (int) App.userReceipt.getValue(), (Integer) App.userAmount.getValue(), App.userChip.getText(), App.userRam.getText(), App.userCapacity.getText());
        list_laptop.add(lap);

        try{

            String mydata =  libRary.readFile(App.path);
            String[] splitString = mydata.split(", ");
            String user = App.remove_receipt.getText();

            for (int i = 0; i < list_laptop.size(); i++){

                for (int j = 0; j < splitString.length; j++) {

                    String[] getkey = splitString[j].split(" : ");

                        for (int k = 0; k < getkey.length; k++) {

                            if (user.equals(getkey[k])) {

                                FileWriter fw = new FileWriter(App.path, false);
                                BufferedWriter bw = new BufferedWriter(fw);

                                bw.write("Hóa đơn bạn vừa xóa là : " + getkey[k]);
                                App.outline.setText("Hóa đơn bạn vừa xóa là : " + getkey[k]);

                                bw.close();
                                fw.close();
                            }
                        }
                    }
                }
            }

        catch (Exception err) {

            App.outline.setText("Bạn không thể xóa vì không có đơn nào trong file txt !");

        }
    }
}
