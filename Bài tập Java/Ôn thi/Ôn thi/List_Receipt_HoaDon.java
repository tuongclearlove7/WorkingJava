import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * Console App
 *
 * */

public class List_Receipt_HoaDon {

    public void Mydata(){
    }

    public static void main(String[] args) {

        ArrayList<Laptop> list_laptop = new ArrayList<>();
        ArrayList<Tivi> list_tivi = new ArrayList<>();
        Tivi tivi = new Tivi("hoadon_tivi1", "thietbi_tivi1", "sanpham_tivi1", "model_tivi1", 42, "TiviSony", "man hinh cong", 500, 200,"tivi_1");
        Laptop lap = new Laptop("hoadon_laptop1", "thietbi_laptop1", "sanpham_laptop1", "model_laptop1", 42, "LaptopMSI", "mong nhe", 1000, 100, "CPU chip core i9 ", "RAM DDR4", "1000GB");
        String moneytivi = "Thanh tien lap tivi : " + lap.Check_Money(200,500) + "USD\n";
        String moneylap = "Thanh tien laptop : " + lap.Check_Money(100,1000) + "USD\n";

        tivi.Output();
        lap.Output();
        System.out.println("============================Output ArraysList==============================");
        list_laptop.add(lap);
        list_tivi.add(tivi);

        lap.OutputMylist(list_laptop);
        tivi.OutputMylist(list_tivi);

        System.out.println(moneytivi);
        System.out.println(moneylap);

        try{

            FileWriter fw = new FileWriter(App.path, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(tivi + "\n" + moneytivi);
            bw.write(lap + "\n" + moneylap);


            bw.close();
            fw.close();
        }

        catch (Exception err){

            err.printStackTrace();
        }
    }
}
