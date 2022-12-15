import java.util.ArrayList;
import java.util.Collections;

public class Employee extends Person {

    private String room;

    private float salarySystem;

    private String DateCome;

    public Employee(String room, float salarySystem, String DateCome, String name, String birthday, String address) {

        super(name, birthday, address);
        this.room = room;
        this.salarySystem = salarySystem;
        this.DateCome = DateCome;
    }

    public Employee() {

        super();
    }

    public Employee(String room, float salarySystem, String DateCome) {

        this.room = room;
        this.salarySystem = salarySystem;
        this.DateCome = DateCome;
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


        return super.toString() + "\n\t\tPhong ban : " + room
                                + "\n\t\tHe so luong : " + salarySystem
                                + "\n\t\tNgay vao cong ty : " + DateCome;

    }

    public void Mylist(ArrayList<Employee> list) {

        System.out.println("\nNhap so nhan vien : ");

        int n = input.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Nhan vien " + (i + 1));
            Employee e = new Employee();
            e.input();
            list.add(e);

        }
    }

    public void OutputMylist(ArrayList<Employee> list, double BasicSalary) {


        for (int i = 0; i < list.size(); i++) {

            System.out.println("\nNhan_vien_" + (i + 1) + " : {\n\t"

                                  + list.get(i).getName()  + " : {"

                                  + list.get(i) + "\n\t\tluong cua nhan vien la : "

                                  + list.get(i).getSalary() * BasicSalary + " USD" + "\n\t}\n}");
        }
    }

    public void OutputSort(ArrayList<Employee> list, double BasicSalary) {

        ShowDate(Mydate.day,Mydate.month,Mydate.year);

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
