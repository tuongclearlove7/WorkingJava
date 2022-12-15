import java.util.ArrayList;

public class Officer extends Person{
    private float salary;

    public Officer(float salary, int day, int month, int year, String name,String phone ,String address){

        this.salary = salary;
    }


    public Officer(float salary) {


        this.salary = salary;
    }
    public Officer() {

    }
    public float getSalary() {

        return salary;
    }


    public void setSalary(float salary) {

        this.salary = salary;
    }


    @Override
    public void input() {

        super.input();

        System.out.println("nhap luong : ");
        salary = input.nextInt();
    }

    public Officer Output(){

        super.Output();

        System.out.println("luong  : " + getSalary());

        return null;
    }

    @Override
    public String toString() {

        return super.toString() + "\n\t\tluong (format salary * 1000) : " + (getSalary() * 1000)   + " USD" + "\n}";
    }

    public void Mylist(ArrayList<Officer> list) {

        System.out.println("Nhap so nguoi : ");

        int number = input.nextInt();

        for (int i = 0; i < number; i++) {

            System.out.println("Person " + (i + 1));

            Officer o = new Officer();
            o.input();
            list.add(o);

        }
    }

    public void OutputMylist(ArrayList<Officer> list) {

        for (int i = 0; i < list.size(); i++) {

            System.out.println();
            System.out.println("Person " + (i+1) + " {" + list.get(i));
        }
    }

    public void Officials(ArrayList<Officer> list){


        for (int i = 0; i < list.size(); i++) {

            if(list.get(i).getSalary() > 1){

                System.out.println();
                System.out.println((i + 1) + " quan chuc " + list.get(i).getName() + " {" + list.get(i));
            }
        }
    }
}
