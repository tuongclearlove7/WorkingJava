import java.util.ArrayList;

public class HangThuCong extends HangHoa{


    protected String producer;

    public HangThuCong(String id_hang, String date, double receipt_price, int amount, String producer) {

        super(id_hang, date, receipt_price, amount);

        this.producer = producer;
    }


    public HangThuCong() {


    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }



    @Override
    public double Check_Money(int amount, double receipt_price) {

        double money = 0;

        money = amount * receipt_price;

        return money;
    }

    public void OutputMylist(ArrayList<String> list) {


        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));
        }
    }


    @Override
    public String toString() {

        return super.toString() + ", producer : " + producer;
    }
}
