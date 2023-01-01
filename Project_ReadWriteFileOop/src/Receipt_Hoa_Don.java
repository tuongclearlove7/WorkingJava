import java.util.Scanner;

public abstract  class Receipt_Hoa_Don {

    protected String receipt_ID;

    protected String device_ID;

    protected String product;

    protected String model;

    protected int size;

    protected String resolution;

    protected String type;

    protected double receipt;

    protected int amount;

    public Scanner input = new Scanner(System.in);


    public Receipt_Hoa_Don(String receipt_ID, String device_ID, String product, String model, int size, String resolution, String type,double receipt, int amount) {

        this.receipt_ID = receipt_ID;
        this.device_ID = device_ID;
        this.product = product;
        this.model = model;
        this.size = size;
        this.resolution = resolution;
        this.type = type;
        this.receipt = receipt;
        this.amount = amount;


    }

    public Receipt_Hoa_Don() {

    }


    public String getReceipt_ID() {


        return receipt_ID;
    }

    public void setReceipt_ID(String receipt_ID) {


        this.receipt_ID = receipt_ID;
    }

    public String getDevice_ID() {


        return device_ID;
    }

    public void setDevice_ID(String device_ID) {


        this.device_ID = device_ID;
    }

    public String getProduct() {

        return product;
    }

    public void setProduct(String product) {


        this.product = product;
    }

    public String getModel() {

        return model;
    }

    public void setModel(String model) {

        this.model = model;
    }

    public int getSize() {

        return size;
    }

    public void setSize(int size) {

        this.size = size;
    }

    public String getResolution() {


        return resolution;
    }

    public void setResolution(String resolution) {


        this.resolution = resolution;
    }

    public String getType() {


        return type;
    }

    public void setType(String type) {


        this.type = type;
    }

    public double getReceipt() {

        return receipt;
    }

    public void setReceipt(double receipt) {


        this.receipt = receipt;
    }

    public int getAmount() {

        return amount;
    }

    public void setAmount(int amount) {


        this.amount = amount;
    }


    public void Input(){

        System.out.println("input receipt_ID : ");
        receipt_ID = input.nextLine();

        System.out.println("input device_ID : ");
        device_ID = input.nextLine();

        System.out.println("input product : ");
        product = input.nextLine();

        System.out.println("input model : ");
        model = input.nextLine();

        System.out.println("input size : ");
        size = input.nextInt();

        System.out.println("input resolution : ");
        resolution = input.nextLine();

        System.out.println("input type : ");
        type = input.nextLine();

        System.out.println("input receipt : ");
        receipt = input.nextDouble();

        System.out.println("input amount : ");
        amount = input.nextInt();


    }

    public int Output(){

        System.out.println("receipt_ID : " + receipt_ID);
        System.out.println("device_ID : " + device_ID);
        System.out.println("product : " + product);
        System.out.println("model : " + model);
        System.out.println("size : " + size);
        System.out.println("resolution : " + resolution);
        System.out.println("type : " + type);
        System.out.println("receipt : " + receipt);
        System.out.println("amount : " + amount);

        return 0;
    }


    public abstract double Check_Money(int amount, double receipt);


    @Override
    public String toString() {


        return "receipt_ID : " + receipt_ID + ", device_ID : " + device_ID  + ", product : " +
                product  + ", model : " + model + ", size : " + size + ", resolution : " + resolution +
                ", type : '" + type + ", receipt : " + receipt + ", amount : " + amount;
    }
}
