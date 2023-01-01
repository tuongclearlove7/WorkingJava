import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        SVCN svcn1 = new SVCN(10000, 8, "hoc bong 1 trieu dong", "TPM13", "Tuong");

        svcn1.Output();

        SVCN svcn2 = new SVCN(20000, 9, "hoc bong 2 trieu dong", "TPM13", "Thao");

        SVCN svcn3 = new SVCN(30000, 10, "hoc bong 3 trieu dong", "TPM13", "Mai");

        ArrayList<SVCN> list = new ArrayList<>();

        list.add(svcn1);
        list.add(svcn2);
        list.add(svcn3);

        for (int i = 0; i < list.size(); i++){

            System.out.println("Sinh vien : " + (i+1) + " {" + list.get(i) + "}");
        }
    }
}
