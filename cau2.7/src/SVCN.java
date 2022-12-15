import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SVCN extends SVTC {

    public  double MediumScore;

    public  String scholarship;


    public SVCN(double MediumScore, String scholarship, String name, String Class, double tuition) {

        super(name, Class, tuition);

        this.MediumScore = MediumScore;
        this.scholarship = scholarship;
    }

    public SVCN(double MediumScore, String scholarship) {

        this.MediumScore = MediumScore;
        this.scholarship = scholarship;
    }

    public SVCN() {


    }


    public double getMediumScore() {

        return MediumScore;
    }

    public void setMediumScore(double mediumScore) {

        this.MediumScore = mediumScore;
    }

    public String getScholarship() {

        return scholarship;
    }

    public void setScholarship(String scholarship) {

        this.scholarship = scholarship;
    }

    public void Input(){

        super.Input();

        input.nextLine();

        System.out.println("nhap diem trung binh : ");
        MediumScore = input.nextInt();

        input.nextLine();

        System.out.println("nhap hoc bong : ");
        scholarship = input.nextLine();

    }

    public void Output(){

        super.Output();

        System.out.println("name : " + getName());
        System.out.println("Class : " + getMyClass());
        System.out.println("tuition : " + getTuition());
        System.out.println("Medium score : " + getMediumScore());
        System.out.println("Scholarship : " + getScholarship());

    }

    public void InputMylist(ArrayList<SVCN> list) {

        System.out.println("\nNhap so sinh vien : ");

        int n = input.nextInt();

        input.nextLine();

        for (int i = 0; i < n; i++) {

            SVCN sv = new SVCN();
            System.out.println("Sinh vien " + (i + 1));

            sv.Input();
            list.add(sv);

        }
    }

    public void OutputMylist(ArrayList<SVCN> list) {

        for (int i = 0; i < list.size(); i++) {

            System.out.println("Sinh vien " + (i+1) + " {" + list.get(i) + "\n}");
        }
    }

    public void CompareMylist(ArrayList<SVCN> list) {

        double max = list.get(0).getMediumScore();


        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getMediumScore() > max){

                max = list.get(i).getMediumScore();
            }

            System.out.println("sinh vien " + list.get(i).getName() + " co diem trung binh  : " + list.get(i).getMediumScore());
        }

        System.out.println("sinh vien co diem trung binh cao nhat la : " + max);
    }

    public void Sort(ArrayList<SVCN> list) {

        for (int i = 0; i < list.size() - 1; i++) {

            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(i).getMediumScore() < list.get(j).getMediumScore()) {

                    Collections.swap(list, i, j);
                }
            }
        }

        System.out.println("Sap xep giam dan theo diem trung binh : ");
        OutputMylist(list);
    }

    @Override
    public String toString() {

        return super.toString() + "\n\t\tMediumScore : " + MediumScore + "\n\t\tscholarship : " + scholarship;
    }
}

