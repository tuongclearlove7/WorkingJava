import java.util.ArrayList;

public class Tivi extends Receipt_Hoa_Don{

    protected String tivi_ID;

    public Tivi(String receipt_ID, String device_ID, String product, String model, int size, String resolution, String type,double receipt, int amount, String tivi_ID) {

        super(receipt_ID,device_ID,product,model, size, resolution, type, receipt, amount);

        this.tivi_ID = tivi_ID;
    }


    public Tivi(){


    }


    public String getTivi_ID() {

        return tivi_ID;
    }

    public void setTivi_ID(String tivi_ID) {

        this.tivi_ID = tivi_ID;
    }

    @Override
    public void Input(){

        super.Input();

        System.out.println("input tivi_ID : ");
        tivi_ID = input.nextLine();

    }

    public int Output(){

        super.Output();

        System.out.print("tivi_ID : " + tivi_ID);

        return 0;
    }
    @Override
    public double Check_Money(int amount, double receipt) {

        double money = 0;

        if(amount >= 3){

            money = 2 * (receipt) + (receipt * (amount - 2) * (0.75));
        }

        return money;
    }

    public void OutputMylist(ArrayList<Tivi> list) {


        for (int i = 0; i < list.size(); i++) {

            System.out.println("Data_tivi_" + (i+1) + " = { " + list.get(i) + ", Thanh tien : " + Check_Money(getAmount(), getReceipt()) + " USD" + " } ");
        }
    }


    @Override
    public String toString() {

        return super.toString() + ", tivi_ID : " + tivi_ID;
    }
}
