import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * Thêm đơn
 *
 * */

public class ACTION_ADD  implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {

        ArrayList<Laptop> list_laptop = new ArrayList<>();
        ArrayList<Tivi> list_tivi = new ArrayList<>();
        Laptop lap = new Laptop(App.userreceipt_ID.getText(), App.userdevice_ID.getText(), App.userProduct.getText(), App.userModel.getText(), (int) App.userSize.getValue(),  App.userResolution.getText(), App.userType.getText(), (int) App.userReceipt.getValue(), (Integer) App.userAmount.getValue(), App.userChip.getText(), App.userRam.getText(), App.userCapacity.getText());

        libRary.writeFile(list_laptop, lap);

        App.AddData.addRow(new Object[]{

            App.userreceipt_ID.getText(), App.userdevice_ID.getText(), App.userProduct.getText(),

            App.userModel.getText(), App.userSize.getText(), App.userResolution.getText(),

            App.userType.getText(), App.userChip.getText(), App.userRam.getText(),

            App.userCapacity.getText(), App.userAmount.getText(), App.userReceipt.getText(),

            lap.Check_Money((int) App.userAmount.getValue(),(int) App.userReceipt.getValue()) + " USD"
        });
    }
}
