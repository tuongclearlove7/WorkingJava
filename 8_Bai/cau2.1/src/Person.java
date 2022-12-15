import java.util.Objects;
import java.util.Scanner;

public class Person extends Mydate{

    Scanner input = new Scanner(System.in);

    private String name;
    private String birthday;
    private String address;



    public Person(String name, String birthDay, String address) {

        super();
        this.name = name;
        this.birthday = birthDay;
        this.address = address;

    }

    public Person() {


        super();
    }




    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getBirthday() {

        return birthday;
    }

    public void setBirthday(String birthday) {

        this.birthday = birthday;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }


    @Override
    public void input(){

        super.input();

        System.out.print("\ninput name : ");
        name = input.nextLine();

        System.out.print("input adress : ");
        address = input.nextLine();

        System.out.print("input birthday : ");
        birthday = input.nextLine();


    }


    public void Output(double BasicSalary){

        System.out.print("\nname : " + getName());
        System.out.print("\nbirthday : " + getBirthday());
        System.out.print("\naddress : " + getAddress());

    }


    @Override
    public String toString() {

        return super.toString() + "\n\t\tname : " + name
                                + "\n\t\tbirthday : " + birthday
                                + "\n\t\taddress : " + address ;
    }

}
