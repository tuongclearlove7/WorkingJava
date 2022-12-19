import java.util.ArrayList;
import java.util.Collections;

public class Employee extends Person {

    private String room;

    private float salarySystem;

    private String DateCome;

    public Employee(int day, int month, int year,String room, float salarySystem, String DateCome, String name, String birthday, String address) {

        super(day,month,year,name, birthday, address);

        this.room = room;
        this.salarySystem = salarySystem;
        this.DateCome = DateCome;
    }

    public Employee() {

    }


    public String getRoom() {

        return room;
    }

    public void setRoom(String room) {

        this.room = room;
    }

    public float getSalary() {

        return salarySystem;
    }

    public void setSalary(float salarySystem) {

        this.salarySystem = salarySystem;
    }

    public String getDateCome() {

        return DateCome;
    }

    public void setDateCome(String DateCome) {

        this.DateCome = DateCome;
    }

    @Override
    public void input() {

        super.input();

        System.out.println("input phong ban : ");
        room = input.nextLine();

        System.out.println("input he so luong : ");
        salarySystem = input.nextFloat();

        input.nextLine();

        System.out.println("input ngay vao cong ty : ");
        DateCome = input.nextLine();
    }


    @Override
    public String toString() {


        return super.toString() + ", Phong ban : " + room + ", He so luong : " + salarySystem + ", Ngay vao cong ty : " + DateCome;

    }

    public void OutputMylist(ArrayList<Employee> list, double BasicSalary) {


        for (int i = 0; i < list.size(); i++) {

            System.out.println((i+1) + " Nhan_vien_" + list.get(i).getName()  + " : {" + list.get(i)

            + "\nluong cua nhan vien la : " + list.get(i).getSalary() * BasicSalary + " USD" + " } ");
        }
    }

    public void OutputSort(ArrayList<Employee> list, double BasicSalary) {

        for (int i = 0; i < list.size() - 1; i++) {

            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(i).getSalary() > list.get(j).getSalary()) {

                    Collections.swap(list, i, j);
                }
            }
        }

        System.out.println("\nSap xep cac nhan vien tang dan theo luong tham nien la : ");

        OutputMylist(list, BasicSalary);
    }
}
