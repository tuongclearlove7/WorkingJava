import java.util.ArrayList;


public class Main {

    public static void main(String[] args){

        ArrayList<Officer> list_Officer = new ArrayList<>();
        Officer Off = new Officer();
        Officer Off1 = new Officer(10);
        Officer Off2 = new Officer(12);

        System.out.print("so sanh > 2 doi tuong theo luong la : ");
        System.out.println(Off1.getSalary() > Off2.getSalary());
        Off.Mylist(list_Officer);
        Off.Sort(list_Officer);


    }
}
