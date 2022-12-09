

import java.util.Scanner;

public class Person {
    Scanner sc=new Scanner(System.in);
    private String birthday;
    private String gender; 
    private String blood_type; 

    public Person(String birthday, String gender, String blood_type) {
        this.birthday = birthday;
        this.gender = gender;
        this.blood_type = blood_type;
    }

    public Person() {
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBlood_type() {
        return blood_type;
    }

    public void setBlood_type(String blood_type) {
        this.blood_type = blood_type;
    }
    public void inputInfor(){

        System.out.println("Nhap ngay sinh : ");
        birthday=sc.nextLine();
        System.out.println("Nhap gioi tinh : ");
        gender=sc.nextLine();
        System.out.println("Nhap nhom mau : ");
        blood_type=sc.nextLine();
        
    }

    @Override
    public String toString() {

        return   ", ngay sinh : " + birthday + ", gioi tinh : " + gender + ", nhom mau : " + blood_type ;
    }
    
}
