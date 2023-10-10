import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args){

            ArrayList<Officer> OfficerList = new ArrayList<>();
            ArrayList<Officer> list = new ArrayList<>();

            Mydate Date = new Mydate(16,1,2002);
            Person Per = new Person(16,1,2002,"Tuong","Dak Lak","090777777");
            Officer officials = new Officer(16,1,2002,"Tuong","090777777","Dak Lak",10);
            Officer Off1 = new Officer(16,1,2002,"Tuong","090777777","Dak Lak",3);
            Officer Off2 = new Officer(17,2,2004,"Yeu","090999999","Dak Lak",2);
            Officer Off3 = new Officer(9,9,2003,"Thao","090999999","Dak Lak",9);
            Officer Off4 = new Officer(19,3,2005,"Nhieulamhihi","090777777","Dak Lak",5);

            Date.input();
            //Date.ShowDate(16,1,2002);
            Mydate mydata1 =  new Mydate(2002);
            Mydate mydata2 = new Mydate(1998);
            System.out.print("\nPerson : ");
            Per.Output();

            System.out.print("So sanh 2 doi tuong Mydate bang toan tu so sanh > : ");
            System.out.print(mydata1.getYear() > mydata2.getYear());
            System.out.println();

            OfficerList.add(officials);
            officials.OutputOfficials(OfficerList);

            list.add(Off1);
            list.add(Off2);
            list.add(Off3);
            list.add(Off4);
            Off1.SortOfficerList(list);



    }


     



}
