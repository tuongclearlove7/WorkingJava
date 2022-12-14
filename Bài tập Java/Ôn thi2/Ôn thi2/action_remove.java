import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.io.*;

public class action_remove implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        ArrayList<HangDienMay> list_dienmay = new ArrayList<>();
        ArrayList<HangThuCong> list_thucong = new ArrayList<>();
        HangDienMay dienmay = new HangDienMay(App.user_id_hang.getText(),App.user_date.getText(), (int) App.user_receipt_price.getValue(),(int) App.user_amount.getValue(), App.user_where_production.getText());
        list_dienmay.add(dienmay);

        try{

            String mydata =  libRary.readFile(App.path);
            String[] splitString = mydata.split(", ");
            String user = App.remove_id_hang.getText();

            for (int i = 0; i < list_dienmay.size(); i++){

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
