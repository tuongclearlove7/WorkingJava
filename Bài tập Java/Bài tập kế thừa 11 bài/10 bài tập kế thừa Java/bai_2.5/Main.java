import java.util.ArrayList;


public class Main {

    public static void main(String[] args){

        ArrayList<Officer> list = new ArrayList<>();
        Officer Off = new Officer();
        Officer Off_S1 = new Officer(10);
        Officer Off_S2 = new Officer(12);

        Officer Off1 = new Officer(2000000,"Tuong","091111116","Da Nang","Lien Chieu");
        Officer Off2 = new Officer(3000000,"yeu","091111116","Dak Lak","TT EaDrang");
        Officer Off3 = new Officer(1000000,"Thao","091111116","Da nang","Lien Chieu");
        Officer Off4 = new Officer(7000000,"nhieuhehe","091111116","Dak Lak","TT EaDrang");
        list.add(Off1);
        list.add(Off2);
        list.add(Off3);
        list.add(Off4);

        System.out.print("so sanh > 2 doi tuong theo luong la : ");
        System.out.println(Off_S1.getSalary() > Off_S2.getSalary());


        Off.SortMyList(list);


    }
}
