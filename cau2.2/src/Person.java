import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Person extends Mydate{

    Scanner input = new Scanner(System.in);

    private String name;
    private String address;

    private String phone;


    public Person( String name, String address, String phone, int day, int month, int year) {

            super(day,month,year);

            this.name = name;
            this.address = address;
            this.phone = phone;

    }

    Person( String name, String address, String phone){

            this.name = name;
            this.address = address;
            this.phone = phone;
        
    }
    public Person() {


    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }


    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public String getPhone() {

        return phone;
    }

    public void setPhone(String name) {

        this.phone = phone;
    }
    @Override
    public void input(){

        super.input();

        System.out.print("\ninput name : ");
        name = input.nextLine();

        System.out.print("input address : ");
        address = input.nextLine();

        System.out.print("input phone : ");
        phone = input.nextLine();
    }

    public Officer Output(){

        super.Output();

        System.out.println("name  : " + getName());
        System.out.println("address  : " + getAddress());
        System.out.println("Phone  : " + getAddress());

        return null;
    }

    @Override
    public String toString() {

        return super.toString() +"\n\t\tname : " + getName()

                                + "\n\t\taddress : " + getAddress()

                                + "\n\t\tphone : " + getPhone();

    }
}
