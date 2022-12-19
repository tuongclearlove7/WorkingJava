import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        ArrayList<SVCN> list = new ArrayList<>();

        SV sv = new SV("TPM13","Tuong");
        SVTC svtc = new SVTC(3000000);
        SVTC svtc2 = new SVTC(9000000);
        SVTC svtc3 = new SVTC(7000000);

        SVCN svcn = new SVCN("tpm13","tuong",10000000,10,"1 ty VNĐ");

        SVCN svcn1 = new SVCN("tpm13","yeu",3000000,8,"1 trieu USD");
        SVCN svcn2 = new SVCN("tpm13","thao",1000000,6,"1 ty VNĐ");
        SVCN svcn3 = new SVCN("tpm13","nhieu",7000000,5,"2 ty VNĐ");
        SVCN svcn4 = new SVCN("tpm13","lam",6000000,10,"1 ty VNĐ");
        SVCN svcn5 = new SVCN("tpm13","hihihi",4000000,10,"ko co hoc bong");

        list.add(svcn1);
        list.add(svcn2);
        list.add(svcn3);
        list.add(svcn4);
        list.add(svcn5);

        sv.Output();
        svtc.Output();
        System.out.print("So sanh 2 doi tuong SVTC dua tren hoc phi la : ");
        System.out.println(svtc3.getTuition() > svtc2.getTuition());
        svcn.Output();

        svcn.OuputListSVCN(list);
        svcn.SortListSVCN(list);

    }
}





















