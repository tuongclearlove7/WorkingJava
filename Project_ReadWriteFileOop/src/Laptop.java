import java.util.ArrayList;

public class Laptop extends  Receipt_Hoa_Don{


    private String chip;

    private String ram;

    private String capacity;


    public Laptop(String receipt_ID, String device_ID, String product, String model, int size, String resolution, String type,double receipt, int amount, String chip, String ram, String capacity) {

        super(receipt_ID,device_ID,product,model, size, resolution, type, receipt, amount);

        this.chip = chip;
        this.ram = ram;
        this.capacity = capacity;

    }

    public Laptop() {

    }


    public String getChip() {


        return chip;
    }

    public void setChip(String chip) {


        this.chip = chip;
    }

    public String getRam() {


        return ram;
    }

    public void setRam(String ram) {


        this.ram = ram;
    }

    public String getCapacity() {

        return capacity;
    }

    public void setCapacity(String capacity) {


        this.capacity = capacity;
    }

    @Override
    public void Input(){

        super.Input();

        System.out.println("input chip : ");
        chip = input.nextLine();

        System.out.println("input ram : ");
        ram = input.nextLine();

        System.out.println("input capacity : ");
        capacity = input.nextLine();

    }

    public int Output(){

        super.Output();

        System.out.println("chip : " + chip);
        System.out.println("ram : " + ram);
        System.out.println("capacity : " + capacity);

        return 0;
    }

    @Override
    public double Check_Money(int amount, double receipt) {

        double money = 0;

        if(amount >= 3){

            money = 2 * (receipt + (receipt * (amount - 2) * (0.65)));
        }

        return money;
    }


    public void OutputMylist(ArrayList<Laptop> list) {


        for (int i = 0; i < list.size(); i++) {

            System.out.println("Data_laptop_" + (i+1) + " = { " + list.get(i) + ", Thanh tien : " + Check_Money(getAmount(), getReceipt()) + " USD" + " } ");
        }
    }

    @Override
    public String toString() {

        return super.toString() + ", chip : " + chip + ", ram : " + ram  + ", capacity : " + capacity;
    }
}
