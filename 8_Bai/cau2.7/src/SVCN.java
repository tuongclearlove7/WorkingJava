import java.util.ArrayList;
import java.util.Collections;

public class SVCN extends SVTC {

    public static double MediumScore;

    public static String scholarship;


    public SVCN(double tuition, String name, String Class,double MediumScore, String scholarship){

        super(tuition, name, Class);

        this.MediumScore = MediumScore;
        this.scholarship = scholarship;

    }

    public SVCN(){

    }


    public  double getMediumScore() {

        return MediumScore;
    }

    public void setMediumScore(double MediumScore) {

        this.MediumScore = MediumScore;
    }

    public static String getScholarship() {

        return scholarship;
    }

    public void setScholarship(String scholarship) {


        this.scholarship = scholarship;
    }

    public void input() {

        super.input();

        System.out.println("nhap diem trung binh : ");
        MediumScore = input.nextInt();

        input.nextLine();

        System.out.println("nhap hoc bong : ");
        scholarship = input.nextLine();

    }

    public void Output(){


        System.out.println("name  : " + getName());
        System.out.println("Class  : " + getMyClass());
        System.out.println("hoc phi  : " + getTuition());
        System.out.println("diem trung binh  : " + getMediumScore());
        System.out.println("hoc bong  : " + getScholarship());

    }

    public void Mylist(ArrayList<SVCN> list) {

        System.out.println("Nhap so sinh vien : ");

        int n = input.nextInt();

        for (int i = 0; i < n; i++) {

            SVCN sv = new SVCN();
            System.out.println("sinh vien : " + (i + 1));

            sv.input();
            list.add(sv);
        }
    }

    public void OutputMylist(ArrayList<SVCN> list){

        for (int i = 0; i < list.size(); i++) {

            System.out.println("sinh vien " + (i + 1) + " : {" + list.get(i) + "\n}");
        }
    }

    public void MaxMylist(ArrayList<SVCN> list) {

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

        System.out.println("sap xep giam dan theo diem trung binh : ");

        for (int i = 0; i < list.size() - 1; i++) {

            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(i).getMediumScore() < list.get(j).getMediumScore()) {

                    Collections.swap(list, i, j);

                }
            }
        }

        OutputMylist(list);
    }



    @Override
    public String toString() {


        return super.toString() + "\n\t\tMediumScore : " + MediumScore + "\n\t\tscholarship : " + scholarship;
    }
}

