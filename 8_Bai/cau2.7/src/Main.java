import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String args[]) throws IOException {

        ArrayList<SVCN> list = new ArrayList<>();

        SVTC STC = new SVTC(1,"tuong","tpm13");
        SVCN SV1 = new SVCN(5,"tuong","tpm13",7,"hoc bong toan phan");

        STC.Output();
        SV1.cancel();
        //System.out.println(SV1);

        SV1.Mylist(list);
        SV1.MaxMylist(list);
        SV1.Sort(list);

    }
}
