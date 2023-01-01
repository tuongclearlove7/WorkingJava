import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class action_add implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        ArrayList<String> list_dienmay = new ArrayList<>();
        ArrayList<String> list_thucong = new ArrayList<>();
        HangDienMay dienmay = new HangDienMay(App.user_id_hang.getText(),App.user_date.getText(), (int) App.user_receipt_price.getValue(),(int) App.user_amount.getValue(), App.user_where_production.getText());

        String money_dienmay = "\nThành tiền : " + dienmay.Check_Money(dienmay.amount, dienmay.receipt_price) + " USD";
        libRary.writeFile(list_dienmay, dienmay + money_dienmay);


        App.AddData.addRow(new Object[]{

                App.user_id_hang.getText(),App.user_date.getText(),
                App.user_receipt_price.getValue(),App.user_amount.getValue(),
                App.user_where_production.getText(),
                dienmay.Check_Money(dienmay.amount, dienmay.receipt_price) + " USD",

        });
    }
}
