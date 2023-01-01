import java.util.Scanner;

public class SVTC extends SV {

    private double tuition;

    public SVTC(String name, String Class, double tuition) {

        super(name, Class);
        this.tuition = tuition;
    }


    public SVTC(double tuition) {

        this.tuition = tuition;
    }

    public SVTC() {

    }

    public double getTuition() {


        return tuition;
    }

    public void setTuition(double tuition) {


        this.tuition = tuition;
    }

    public void Input(){

        super.Input();

        System.out.println("nhap hoc phi : ");
        tuition = input.nextInt();

    }

    public void Output(){

        super.Output();

        //System.out.println("tuition : " + getTuition());

    }

    @Override
    public String toString() {

        return super.toString() + ", tuition : " + tuition;
    }
}
