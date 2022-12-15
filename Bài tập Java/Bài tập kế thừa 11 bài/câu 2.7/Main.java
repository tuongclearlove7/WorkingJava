import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String args[]) throws IOException {

        ArrayList<SVCN> list = new ArrayList<>();
        SVCN s1 = new SVCN(8,"co","Tuong","TPM13",1000);
        SVCN s2 = new SVCN(2,"co","Tuong","TPM13",1000);
        SVCN SV = new SVCN();

        s1.cancel();

        System.out.print("\nso sanh 2 doi tuong theo diem trung binh la : ");
        System.out.print(s1.getMediumScore() > s2.getMediumScore());

        SV.InputMylist(list);
        SV.Sort(list);

    }
}
