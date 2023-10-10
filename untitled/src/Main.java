interface manhinh{
    void manhinh_lap_fullHD();
    void manhinh_pc_fullHD();
}

abstract class thietbi implements manhinh{

    private String laptop = "_________________________Laptop__________________________";
    private String PC = "_________________________PC__________________________";
    public String computer_company;

    public thietbi(String laptop, String pc, String computer_company) {
        this.laptop = laptop;
        this.PC = pc;
        this.computer_company = computer_company;
    }

    public thietbi() {

    }

    public String getLaptop() {
        return laptop;
    }

    public String getPC() {
        return PC;
    }

    public abstract void banphim();

    public abstract void chuot();

    public void pc_CPU(){
        System.out.println("Đây là cục CPU của pc");
    }

    public void lap_CPU(){
        System.out.println("Đây là CPU của lap");
    }

    @Override
    public void manhinh_lap_fullHD() {
        System.out.println("Đây màn hình lap full HD");
    }

    @Override
    public void manhinh_pc_fullHD() {
        System.out.println("Đây màn hình pc full HD 32 inch");
    }

}

class maytinh extends thietbi{

    public maytinh(String laptop, String pc, String laptop_msi) {
        super(laptop, pc, laptop_msi);
    }

    public maytinh() {

    }

    @Override
    public void banphim() {
        System.out.println("Đây là bàn phím");
    }

    @Override
    public void chuot() {
        System.out.println("Đây là chuột");
    }
}

public class Main extends thietbi {

    public Main(String laptop, String pc, String computer_company) {
        super(laptop, pc, computer_company);
    }

    public Main(){
        super();

    }

    @Override
    public void banphim() {
    }
    @Override
    public void chuot() {
    }

    public static void main(String[] args) {

        Main m = new Main();
        maytinh lap = new maytinh();
        maytinh pc = new maytinh();

        System.out.println(lap.getLaptop());
        String MSI = lap.computer_company = "Laptop MSI Bravo 15";
        System.out.println(MSI);
        lap.banphim();
        lap.chuot();
        lap.lap_CPU();
        lap.manhinh_lap_fullHD();

        System.out.println(pc.getPC());
        String ASUS = lap.computer_company = "PC Asus Rog Strix G10DK-R5600G003W";
        System.out.println(ASUS);
        pc.banphim();
        pc.chuot();
        pc.pc_CPU();
        pc.manhinh_pc_fullHD();


    }



}