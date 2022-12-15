public class Laser extends Printer {

    private String DPI;


    public Laser(String DPI) {


        this.DPI = DPI;

    }

    public Laser() {

    }

    public String getDPI() {

        return DPI;
    }

    public void setDPI(String DPI) {

        this.DPI = DPI;
    }

    public void Output() {

        System.out.println("DPI : " + getDPI());

    }

    @Override
    public String toString() {

        return super.toString() + "\n\t\tDPI : " + getDPI();
    }
}

