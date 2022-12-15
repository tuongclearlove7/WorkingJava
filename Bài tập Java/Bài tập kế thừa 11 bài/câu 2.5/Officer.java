import java.util.ArrayList;
import java.util.Collections;

public class Officer extends Person {

    private double salary;

    public Officer(double salary, String name, int phone, String province, String district) {

        super(name, phone, province, district);
        this.salary = salary;
    }

    public Officer(double salary, String name, int phone) {

        super(name, phone);
        this.salary = salary;
    }

    public Officer(double salary) {


        this.salary = salary;
    }

    public Officer() {

    }

    public double getSalary() {


        return salary;
    }

    public void setSalary(double salary) {

        this.salary = salary;
    }

    public void input() {

        super.input();
        System.out.println("Salary : ");
        salary = input.nextDouble();

    }

    @Override
    public void Output() {

        super.Output();
        System.out.println("Salary : " + salary);

    }

    @Override
    public String toString() {


        return super.toString() + "\n\t\tSalary : " + salary + "\n}";
    }

    public void Mylist(ArrayList<Officer> list) {

        System.out.println("Nhap so nhan vien : ");

        int n = input.nextInt();

        for (int i = 0; i < n; i++) {

            Officer of = new Officer();
            System.out.println("Nhan vien : " + (i + 1));

            of.input();
            list.add(of);
        }
    }

    private void Cancel(ArrayList<Officer> list){

        System.out.print("\t\tBan co muon huy chuong trinh k?\n\t\t\tOption[choose yes or no]\nInput> ");

        input.nextLine();

        String user  = input.nextLine();

        System.out.println("Sap xep tang dan theo luong ");

        for (int i = 0; i < list.size(); i++) {

            if(user.equals("no")){

                System.out.println("Officer " + (i + 1) + " : {" + list.get(i));
            }
            if (user.equals("yes")){

                System.out.print("Cancel Program !!!");
            }
        }
    }
    public void OutputMylist(ArrayList<Officer> list) {

        Cancel(list);

    }

    public void MaxMylist(ArrayList<Officer> list) {

        double max = list.get(0).getSalary();


        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getSalary() > max){

                max = list.get(i).getSalary();
            }

            System.out.println("nhan vien " + list.get(i).getName() + " co luong la : " + list.get(i).getSalary());
        }

        System.out.println("nhan vien co luong cao nhat la : " + max);
    }

    public void Sort(ArrayList<Officer> list) {

        for (int i = 0; i < list.size() - 1; i++) {

            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(i).getSalary() > list.get(j).getSalary()) {

                    Collections.swap(list, i, j);
                }
            }
        }

        OutputMylist(list);
    }
}
