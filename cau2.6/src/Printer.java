interface METHOD{

    void import_warehouse(int q);

    void out_warehouse(int q);
}

public class Printer implements METHOD{

    private String NamePrinter;

    private int amount;


    public Printer(String NamePrinter, int amount) {

        this.NamePrinter = NamePrinter;
        this.amount = amount;
    }

    public Printer() {

    }


    public String getNamePrinter() {


        return NamePrinter;
    }

    public void setNamePrinter(String namePrinter) {


        this.NamePrinter = NamePrinter;
    }

    public int getAmount() {


        return amount;
    }

    public void setAmount(int amount) {


        this.amount = amount;
    }

    public void Output(){

       System.out.println("name printer : " + getNamePrinter());
        System.out.println("amount : "+ getAmount());

    }

    @Override
    public  void import_warehouse(int q){

        System.out.println("Nhap kho : " + q);
    }

    @Override
    public void out_warehouse(int q) {

        System.out.println("Xuat kho : " + q);
    }

    @Override
    public String toString() {


        return "\n\t\tName printer : " + getNamePrinter() + "\n\t\tamount : " + getAmount();
    }
}
