import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args){

            ArrayList<Officer> list=new ArrayList<>();

            Mydate Date = new Mydate(16,1,2002);
            Person Per = new Person("tuong","dak lak","090777777");
            Officer Off = new Officer(1000);


            Off.Mylist(list);
            Off.OutputMylist(list);
            Off.Officials(list);

            Officer arr[] = {Off};
            Off.Output();



    }
}
