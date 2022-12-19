import java.util.Scanner;


public class SV {

    private String name;
    private String Class;

    public static Scanner input = new Scanner(System.in);

    public SV(String name, String Class) {


        this.name = name;
        this.Class = Class;
    }

    public SV() {


    }

    public String getName() {


        return name;
    }

    public void setName(String name) {

        this.name = name;
    }


    public String getMyClass() {

        return Class;
    }

    public void setMyClass(String Class) {

        this.Class =  Class;
    }

    public void Input(){

        System.out.println("input name : ");
        name = input.nextLine();

        System.out.println("input class : ");
        Class = input.nextLine();


    }

    public void Output(){

       // System.out.println("name : " + getName());
       // System.out.println("Class : " + getMyClass());

    }

    protected void cancel(){

        System.out.print("ban co muon huy chuong trinh k?\n\t\tOption[yes or no] : ");
        String user  = input.nextLine();

        if(user.equals("no")){

            Output();
        }

        if (user.equals("yes")){

            System.out.print("Cancel!!!\n");

        }
    }

    @Override
    public String toString() {

        return "name : " + name + ", Class : " + Class;
    }
}