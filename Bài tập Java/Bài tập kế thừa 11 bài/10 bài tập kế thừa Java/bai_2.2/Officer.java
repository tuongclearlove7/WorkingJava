import java.util.ArrayList;
import java.util.Collections;

public class Officer extends Person{
    private double salary;

    public Officer(int day, int month, int year, String name,String phone ,String address, double salary){

        super(day,month,year,name,phone,address);
        this.salary = salary;
    }


    public Officer(float salary) {


        this.salary = salary;
    }
    public Officer() {

    }
    public double getSalary() {

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

        return super.toString() + ", luong (format " +getSalary() + " * 1000) : " + (getSalary() * 1000)   + " USD";
    }

    public void  OutputOfficials(ArrayList<Officer> list){

        for (int i = 0; i < list.size(); i++) {

            if(list.get(i).getSalary() > 5){

                System.out.println((i + 1) + " Can bo vien chuc " + list.get(i).getName() + " : {" + list.get(i) + "}");
            }
        }
    }

    public void SortOfficerList(ArrayList<Officer> list) {

        System.out.print("Sap xep tang dan theo ngay thang (lay ngay + thang roi soft) : ");

        for (int i = 0; i < list.size() - 1; i++) {

            for (int j = i + 1; j < list.size(); j++) {

                int I_DayMonth = list.get(i).getDay() + list.get(i).getMonth();
                int J_DayMonth = list.get(j).getDay() + list.get(j).getMonth();

                if (I_DayMonth > J_DayMonth) {

                    Collections.swap(list, i, j);
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {

                System.out.print("\n" + (i + 1) + " Officer " + list.get(i).getName() + " : {" + list.get(i)+ "}");
        }
    }
}
