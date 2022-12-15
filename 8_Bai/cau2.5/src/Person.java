public class Person extends MyAddress {

    private String name;
    private int phone;

    public Person(String name, int phone, String province, String district) {


        super(province, district);
        this.name = name;
        this.phone = phone;
    }

    public Person(String name, int phone) {


        this.name = name;
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

    public int getPhone() {


        return phone;
    }

    public void setPhone(int phone) {


        this.phone = phone;
    }

    public void input() {

        super.input();

        System.out.println("name : ");
        name = input.nextLine();
        System.out.println("phone : ");
        phone = input.nextInt();
    }

    @Override
    public void Output(){

        super.Output();
        System.out.println("name : "+ name);
        System.out.println("phone : "+ phone);
    }

    @Override
    public String toString() {


        return super.toString()+"\n\t\tname : " + name + "\n\t\tphone : " + phone;
    }
}

