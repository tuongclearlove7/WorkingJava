import java.util.ArrayList;

public class SVCN extends SVNH {
    
    private double tuition;

    public SVCN(double tuition, double Medium_Score, String scholarship, String Class, String name) {

        super(Medium_Score, scholarship, Class, name);

        this.tuition = tuition;
    }

    public SVCN(double tuition, double Medium_Score, String scholarship) {

        super(Medium_Score, scholarship);

        this.tuition = tuition;
    }

    public SVCN(double tuition) {


        this.tuition = tuition;
    }

    public SVCN() {

    }

    public double getTuition() {


        return tuition;
    }

    public void setTuition(double tuition) {


        this.tuition = tuition;
    }
    
    public SVCN Output(){

        super.Output();

        System.out.println("Hoc phi  : " + tuition);

        return null;
    }



    @Override
    public String toString() {


        return super.toString() + ", Hoc phi : " + tuition;
    }
    
}
