import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Employee{

    //private static Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        ArrayList<Employee> list = new ArrayList<>();

        Mydate date = new  Mydate(16,1,2002);
        Person P1 = new Person("tuong","16/1/2002","dak lak");
        Person P2 = new Person("thao","9/9/2003","dak lak");
        Employee E1 = new Employee(16,1,2002,"100A",2,"18/12/2022","Tuong","16/1/2002","Dak Lak");
        Employee E2 = new Employee(9,9,2003,"100B",5,"18/12/2022","Thao","09/09/2003","Da Nang");
        Employee E3 = new Employee(13,3,1998,"200C",3,"18/12/2022","Mai","13/03/1998","Da Nang");

        double BasicSalary = 1000;

        System.out.print("So sanh P1 va P2 : " + P1.equals(P2) + "\n");
        date.input();

        list.add(E1);
        list.add(E2);
        list.add(E3);
        E1.OutputSort(list, BasicSalary); /**   Json ^^   **/

    }
}
