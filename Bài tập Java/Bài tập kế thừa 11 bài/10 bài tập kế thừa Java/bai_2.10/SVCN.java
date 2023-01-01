import java.util.ArrayList;
import java.util.Collections;

public class SVCN extends SVTC{

    private float MediumScore;

    private String scholarship;


    public SVCN(String MyClass, String name, double tuition, float MediumScore, String scholarship) {

        super(MyClass, name, tuition);

        this.MediumScore = MediumScore;
        this.scholarship = scholarship;

    }

    public SVCN(float MediumScore, String scholarship) {

        this.MediumScore = MediumScore;
        this.scholarship = scholarship;
    }

    public SVCN(){

    }




    public  float getMediumScore() {

        return MediumScore;
    }

    public void setMediumScore(float mediumScore) {

        this.MediumScore = mediumScore;
    }


    public String getScholarship() {

        return scholarship;
    }

    public void setScholarship(String scholarship) {

        this.scholarship = scholarship;
    }

    @Override
    public void Input(){

        super.Input();

        System.out.print("Input MediumScore : ");
        MediumScore = input.nextFloat();

        input.nextLine();

        System.out.print("Input scholarship : ");
        scholarship = input.nextLine();
    }

    public void InputListSVCN(ArrayList<SVCN> list) {

        System.out.print("Nhap so sinh vien : ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {

            SVCN sv = new SVCN();
            System.out.println("Sinh vien " + (i+1));
            sv.Input();
            list.add(sv);
        }
    }

    public void OuputListSVCN(ArrayList<SVCN> list) {

        for (int i = 0; i < list.size(); i++) {

            System.out.println("hoc sinh " + (i+1) + " : {" + list.get(i) + "}");
        }
    }

    public void SortListSVCN(ArrayList<SVCN> list){

        for (int i = 0; i < list.size() - 1; i++){

            for (int j = i + 1; j < list.size(); j++){

                if (list.get(i).getTuition() < list.get(j).getTuition()) {

                    Collections.swap(list, i, j);
                }
            }
        }

        System.out.println("Sap xep cac doi tuong giam dan theo hoc phi la : ");

        for (int i = 0; i < list.size(); i++) {

            System.out.println((i+1) + " hoc sinh " + list.get(i).getName() + " : {" + "tuition : " + list.get(i).getTuition() + "}");
        }
    }

    @Override
    public void Output(){

        System.out.println("MediumScore : " + getMediumScore());
        System.out.println("scholarship : " + getScholarship());
    }

    @Override
    public String toString() {

        return super.toString() + ", MediumScore : " + MediumScore + ", scholarship : " + scholarship;
    }
}

























