import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Employee{

    private static Scanner input = new Scanner(System.in);


    public static void main(String[] args){

        ArrayList<Employee> list = new ArrayList<>();
        Person P1 = new Person("tuong","16/1/2002","dak lak");
        Person P2 = new Person("thao","9/9/2003","dak lak");
        Employee E = new Employee("1",2,"13/12/2022");
        double BasicSalary = 1000;

        System.out.print("So sanh P1 va P2 : " + P1.equals(P2));

        E.Mylist(list);
        E.OutputSort(list, BasicSalary); /**   Json ^^   **/

    }
}
