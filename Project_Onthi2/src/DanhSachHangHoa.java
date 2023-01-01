import java.util.ArrayList;
import java.io.*;

public class DanhSachHangHoa {


    public static void main(String[] args) {


        ArrayList<String> list_dienmay = new ArrayList<>();
        ArrayList<String> list_thucong = new ArrayList<>();

        HangDienMay dienmay = new HangDienMay("001","16/1/2002",1600,9,"nhap khau");
        HangThuCong thucong = new HangThuCong("002","9/9/2003",3000,5,"Clearlove7");

        list_dienmay.add(String.valueOf(dienmay));
        list_thucong.add(String.valueOf(thucong));

        dienmay.OutputMylist(list_dienmay);
        thucong.OutputMylist(list_thucong);

        String money_dienmay = "\nThanh tien dien may : " + dienmay.Check_Money((int) dienmay.getAmount(), dienmay.getReceipt_price()) + " USD";
        String money_thucong = "\nThanh tien thu cong : " + thucong.Check_Money((int) thucong.getAmount(), thucong.getReceipt_price()) + " USD";

        System.out.print(money_dienmay);
        System.out.print(money_thucong);

        libRary.writeFile(list_dienmay, dienmay + money_dienmay);
        libRary.writeFile(list_thucong, thucong + money_thucong);


    }
}
