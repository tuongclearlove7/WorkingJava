

import java.util.Scanner;

public class Person {

    Scanner input =new Scanner(System.in);

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
    public void Input(){

        System.out.println("Nhap ngay sinh : ");
        birthday = input.nextLine();

        System.out.println("Nhap gioi tinh : ");
        gender = input.nextLine();

        System.out.println("Nhap nhom mau : ");
        blood_type = input.nextLine();
        
    }

    @Override
    public String toString() {

        return  "\t\t\tbirthday : " + birthday + "\n\t\t\tgender : " + gender + "\n\t\t\tblood_type : " + blood_type;
    }
}
