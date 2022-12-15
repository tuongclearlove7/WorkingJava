public class SVTC extends SV {

    private double tuition;

    public SVTC(double tuition, String name, String Class) {

        super(name, Class);

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



    public void input() {

        super.input();

        System.out.println("nhap hoc phi : ");
        tuition = input.nextInt();

    }

    @Override
    public void Output(){

        System.out.println("Ten : " + getName());
        System.out.println("Lop : " + getMyClass());
        System.out.println("Hoc phi : " + getTuition());

    }

    @Override
    public String toString() {


        return super.toString() + "\n\t\ttuition : " + tuition;
    }
}
