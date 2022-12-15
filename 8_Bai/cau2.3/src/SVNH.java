
public class SVNH extends SV {

    private double Medium_Score;
    private String scholarship;

    public SVNH(double Medium_Score, String scholarship, String Class, String name) {

        super(Class, name);

        this.Medium_Score = Medium_Score;
        this.scholarship = scholarship;
    }

    public SVNH(double Medium_Score, String scholarship) {

        this.Medium_Score = Medium_Score;
        this.scholarship = scholarship;
    }

    public SVNH() {
    }

    public double getMedium_Score() {
        

        return Medium_Score;
    }

    public void setMedium_Score(double medium_Score) {


        this.Medium_Score = medium_Score;
    }

    public String getScholarship() {


        return scholarship;
    }

    public void setScholarship(String scholarship) {


        this.scholarship = scholarship;
    }

    public SVCN Output() {

        super.Output();

        System.out.println("Diem trung binh : " + Medium_Score);
        System.out.println("Hoc bong : " + scholarship);

        return null;
    }

    @Override
    public String toString() {

        return super.toString() + "\n\t\tDiem trung binh : " + Medium_Score + "\n\t\tHoc bong : " + scholarship;
    }
}
