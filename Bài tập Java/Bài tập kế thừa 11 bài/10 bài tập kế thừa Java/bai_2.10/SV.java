import java.util.Scanner;


public class SV {

    public static Scanner input = new Scanner(System.in);
    private String MyClass;

    private String name;


    public SV(String MyClass, String name) {

        this.MyClass = MyClass;
        this.name = name;
    }

    public SV(){

    }

    public String getMyClass() {

        return MyClass;
    }

    public void setMyClass(String MyClass) {

        this.MyClass = MyClass;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void Input(){

        input.nextLine();

        System.out.print("Input Myclass : ");
        MyClass = input.nextLine();

        System.out.print("Input name : ");
        name = input.nextLine();

    }

    public void Output(){

        System.out.println("Myclass : " + getMyClass());
        System.out.println("name : " + getName());
    }

    @Override
    public String toString() {

        return "MyClass : " + MyClass + ", name : " + name;
    }
}





























