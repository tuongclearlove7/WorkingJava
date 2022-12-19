import java.util.ArrayList;

public class Student extends Person implements Tax {

    private String name;
    private String StudentID;
    private int phone;
    private String email;
    private float income;

    public Student(String name, String StudentID, int phone, String email, String birthday, String gender, String blood_type, float income) {

        super(birthday, gender, blood_type);

        this.name = name;
        this.StudentID = StudentID;
        this.phone = phone;
        this.email = email;
        this.income=income;
    }

    public Student(String name, String StudentId, int phone, String email,float income) {

        this.name = name;
        this.StudentID = StudentId;
        this.phone = phone;
        this.email = email;
        this.income=income;
    }

    public Student() {
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getStudentID() {

        return StudentID;
    }

    public void setStudentID(String StudentId) {

        this.StudentID = StudentId;
    }

    public int getPhone() {

        return phone;
    }

    public void setPhone(int phone) {

        this.phone = phone;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public float getIncome() {

        return income;
    }

    public void setIncome(float income) {

        this.income = income;
    }
    
    @Override
    public float Pay_Tax(float income, int start_time, int end_time) {

        if (income > 11000000) {

            return (float) (income * 0.5 / 100);
        }
        return 0;

    }

    @Override
    public void Input() {

        super.Input();
        System.out.println("Input name : ");
        name = input.nextLine();

        System.out.println("Nhap ID : ");
        StudentID = input.nextLine();

        System.out.println("Nhap so dien thoai : ");
        phone = input.nextInt();
        input.nextLine();

        System.out.println("Nhap email : ");
        email = input.nextLine();

        System.out.println("Nhap so thu nhap : ");
        income = input.nextInt();
        
        
    }

    @Override
    public String toString() {

            return super.toString() +

                                    "\n\t\t\tname : " + name +

                                    "\n\t\t\tid : " + StudentID +

                                    "\n\t\t\tphone : " + phone +

                                    "\n\t\t\temail : " + email +

                                    "\n\t\t\tincome : " + income;
    }

    public void InputListStudent(ArrayList<Student> list) {

        System.out.println("Nhap so hoc sinh : ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {

            Student st = new Student();
            System.out.println("Hoc sinh "+(i+1));
            st.Input();
            list.add(st);
        }
    }
    public void OuputListStudent(ArrayList<Student> list) {

        for (int i = 0; i < list.size(); i++) {

            System.out.println("hoc sinh " + (i + 1) + " : {\n" + "\t\t" + list.get(i).getName()

                                           + " : {\n" + " " + list.get(i)

                                           + "\n\t\t\tThue cua hoc sinh " + list.get(i).getName()

                                           + " la : " + Pay_Tax(list.get(i).getIncome(), 2, 3)

                                           + "\n\t}" + "\n}");
        }
}
}
