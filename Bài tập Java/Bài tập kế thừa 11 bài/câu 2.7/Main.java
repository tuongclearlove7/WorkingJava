import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String args[]) throws IOException {

        ArrayList<SVCN> list = new ArrayList<>();
        SVCN s1 = new SVCN(8,"hoc bong 1 trieu USD","Tuong","TPM13",1000);
        SVCN s2 = new SVCN(2,"ko co hoc bong","Yeuthao","TPM13",1000);
        SVCN SV = new SVCN();

        SVCN svcn1 = new SVCN(8,"hoc bong 1 trieu USD","tuong","TPM13",1000);
        SVCN svcn2 = new SVCN(5,"ko co hoc bong","yeuThao","TPM13",1000);
        SVCN svcn3 = new SVCN(7,"hoc bong 1 ty VNĐ","NhieuLamHihi","TPM13",1000);
        list.add(svcn1);
        list.add(svcn2);
        list.add(svcn3);

        s1.cancel();
        System.out.print("\nso sanh 2 doi tuong theo diem trung binh la : ");
        System.out.print(s1.getMediumScore() > s2.getMediumScore());
        //SV.InputMylist(list);
        SV.OutputMylist(list);
        SV.Sort(list);

    }
}
