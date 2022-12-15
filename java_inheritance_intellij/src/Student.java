import java.util.ArrayList;

public class Student extends Person implements Tax {

    private String name;
    private String StudentId;
    private int phone;
    private String email;
    private float income;

    public Student(String name, String StudentId, int phone, String email, String birthday, String gender, String blood_type, float income) {

        super(birthday, gender, blood_type);
        this.name = name;
        this.StudentId = StudentId;
        this.phone = phone;
        this.email = email;
        this.income=income;
    }

    public Student(String name, String StudentId, int phone, String email,float income) {

        this.name = name;
        this.StudentId = StudentId;
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

    public String getStudentId() {

        return StudentId;
    }

    public void setStudentId(String StudentId) {

        this.StudentId = StudentId;
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
    public float payTax(float income, int start_time, int end_time) {

        if (income > 11000000) {
            return (float) (income * 0.5 / 100);
        }
        return 0;

    }

    @Override
    public void inputInfor() {

        super.inputInfor();
        System.out.println("input name : ");
        name = input.nextLine();

        System.out.println("input student ID : ");
        StudentId = input.nextLine();

        System.out.println("input phone number : ");
        phone = input.nextInt();
        input.nextLine();

        System.out.println("input email : ");
        email = input.nextLine();

        System.out.println("input student's income: ");
        income = input.nextInt();
        
        
    }

    @Override
    public String toString() {

        return "hoc sinh : { \n" + super.toString() +
                "\n\t\tname : " + name +
                "\n\t\tid : " + StudentId +
                "\n\t\tso dien thoai : " + phone +
                "\n\t\temail : " + email + "\n}";
    }

    public void listStudent(ArrayList<Student> listStudent) {

        System.out.println("nhap so hoc sinh : ");
        int number = input.nextInt();

        for (int i = 0; i < number; i++) {

            Student st = new Student();
            System.out.println("============= Hoc sinh "+(i+1)+"=============");
            st.inputInfor();
            listStudent.add(st);
        }
    }
    public void ouputListStudent(ArrayList<Student> listStudent){

        for(int i=0;i<listStudent.size();i++){

            System.out.println("the student "+(i+1)+" ");
            System.out.println(listStudent.get(i));
        }
    }
    public void countTax(ArrayList<Student> listStudent){

        for(int i=0;i<listStudent.size();i++){

            System.out.println("Thue cua hoc sinh "+(i+1)+" la : "  +
            payTax(listStudent.get(i).getIncome(), 2,3));
        }
       
    }

}
