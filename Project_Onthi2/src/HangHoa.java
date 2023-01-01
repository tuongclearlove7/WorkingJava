public abstract class HangHoa {


    protected String id_hang;

    protected String date;

    protected double receipt_price;

    protected int amount;


    public HangHoa(String id_hang, String date, double receipt_price, int amount) {


        this.id_hang = id_hang;
        this.date = date;
        this.receipt_price = receipt_price;
        this.amount = amount;
    }

    public HangHoa() {

    }

    public String getId_hang() {

        return id_hang;
    }

    public void setId_hang(String id_hang) {

        this.id_hang = id_hang;
    }

    public String getDate() {

        return date;
    }

    public void setDate(String date) {

        this.date = date;
    }

    public double getReceipt_price() {
        return receipt_price;
    }

    public void setReceipt_price(double receipt_price) {
        this.receipt_price = receipt_price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public abstract double Check_Money(int amount, double receipt_price);


    @Override
    public String toString() {

        return "id_hang : " + id_hang + ", date : " + date  + ", receipt_price : " + receipt_price + ", amount : " + amount;
    }
}
