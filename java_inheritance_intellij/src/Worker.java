
public class Worker extends Person implements Tax{
    private String name;
    private String ID;
    private int phone;
    private String email;
    private double salary;
    private double other_income;

    public Worker(String name, String ID, int phone, String email, double salary, double other_income, String birthday, String gender, String blood_type) {

        super(birthday, gender, blood_type);

        this.name = name;
        this.ID = ID;
        this.phone = phone;
        this.email = email;
        this.salary = salary;
        this.other_income = other_income;
    }

    public Worker(String name, String ID, int phone, String email, double salary, double other_income) {

        this.name = name;
        this.ID = ID;
        this.phone = phone;
        this.email = email;
        this.salary = salary;
        this.other_income = other_income;
    }

    public Worker() {

    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getID() {

        return ID;
    }

    public void setID(String ID) {

        this.ID = ID;
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

    public double getSalary() {

        return salary;
    }

    public void setSalary(double salary) {

        this.salary = salary;
    }

    
    public double getOther_income() {

        return other_income;
    }

    public void setOther_income(double other_income) {

        this.other_income = other_income;
    }

    @Override
    public float Pay_Tax(float income, int start_time, int end_time) {

       if (income > 15000000){

           return (income * 1 / 100);
       }

        return 0;
    }
}
