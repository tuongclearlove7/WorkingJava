import java.util.ArrayList;

public class HangDienMay extends HangHoa{

    protected String where_production;



    public HangDienMay(String id_hang, String date, double receipt_price, int amount, String where_production) {

        super(id_hang,date,receipt_price,amount);

        this.where_production = where_production;

    }

    public HangDienMay() {


    }


    public String getWhere_production() {
        return where_production;
    }

    public void setWhere_production(String where_production) {
        this.where_production = where_production;
    }

    @Override
    public double Check_Money(int amount, double receipt_price) {

        double money = 0;
        
        if(where_production.equals("trong nuoc")){

           money = amount * receipt_price;

            return money;
        }
        if(where_production.equals("nhap khau")){

            money = amount * receipt_price * 1.2;

            return money;
        }

        return money;
    }

    public void OutputMylist(ArrayList<String> list) {


        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));
        }
    }


    @Override
    public String toString() {

        return super.toString() + ", where_production : " + where_production;
    }
}
