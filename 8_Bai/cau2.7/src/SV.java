import java.util.Scanner;


public class SV {

    private String name;
    private String Class;

    Scanner input = new Scanner(System.in);

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


        this.Class = Class;
    }

    public void input() {

        System.out.println("input name : ");
        name = input.nextLine();

        System.out.println("input Class : ");
        Class = input.nextLine();

    }

    public void Output() {

       // System.out.println("name : " + name);
       // System.out.println("Class : " + Class);
    }

    public void cancel(){

        System.out.print("ban co muon huy chuong trinh k ?\n\t\tOption[yes or no] : ");
        String user = input.nextLine();

        if(user.equals("no")){

            Output();

        }
        if(user.equals("yes")){

            System.out.print("Cancel Program!!!\n");
        }
    }

    @Override
    public String toString() {

        return "\n\t\tname : " + name + "\n\t\tClass : " + Class;
    }
}