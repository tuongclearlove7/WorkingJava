

public class SVTC extends SV{

    protected double tuition;


    public SVTC(String MyClass, String name, double tuition) {

        super(MyClass, name);

        this.tuition = tuition;

    }

    public SVTC(double tuition) {

        this.tuition = tuition;
    }

    public SVTC(){

    }

    public double getTuition() {

        return tuition;
    }

    public void setTuition(double tuition) {

        this.tuition = tuition;
    }

    @Override
    public void Input(){

        super.Input();

        System.out.print("Input tuition : ");
        tuition = input.nextDouble();

    }

    @Override
    public void Output(){

        System.out.println("tuition : " + getTuition());
    }

    @Override
    public String toString() {

        return super.toString() + ", tuition : " + tuition;
    }
}





























