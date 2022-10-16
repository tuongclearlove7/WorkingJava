import java.io.FileNotFoundException;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.io.File;
import java.io.IOException;
import java.io.File;

class MyClass1{
    public String name;
    public String Myabout;
    public String Mycrush;
    public int id;
    public boolean check = true;
    public char character;
    void Me(String about) {
        Myabout = about;
        System.out.println(Myabout);
    }
}

class MyClass2 extends MyClass1 {
    void Mycrush(String crush) {
        Mycrush = crush;
        System.out.println(Mycrush);
    }
}

public class Structure_Inheritance extends MyClass1{

    private String id;
    private String name;
    private int balance;

    public Structure_Inheritance(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;

    }
    public String getId() {

        return id;
    }

    public String getName() {

        return name;
    }

    public int getBalance() {

        return balance;
    }

    public int credit(int amount){
        balance = amount;
        return balance;
    }

    public  int debit(int amount){
        if(amount <= balance){
            balance = balance - amount;
        }
        else{
            System.out.println("Amount exceeded balance " + (balance - amount));
        }
        return balance;
    }

    public int transferTo(int amount){
        if(amount<=balance){
            int anotherAmount = amount;
        }
        else{
            System.out.println("Amount exceeded balance " + (amount - balance));
        }
        return balance;
    }
    @Override
    public String toString() {
        return "AccountObject {\n" + "\t\tid : " + id + "\n\t\tname : " + name + "\n\t\tbalance : " + balance + "\n}";
    }

    public static void main(String[] args) {
        //Inheritance
        MyClass1 class_stance = new MyClass1();
        MyClass2 class_stance2 = new MyClass2();
        MyClass1 MyObj = new MyClass1();

        class_stance.Me("I love Thao");//chi duoc truyen vao 1 tham so function("");
        class_stance2.Me("function me ke thua tu MyClass2 ");
        class_stance2.Mycrush("My crush is Thao");

        System.out.println("name String type "+MyObj.name);//data type in class
        System.out.println("id int type "+MyObj.id);
        System.out.println("check boolean type "+MyObj.check);
        System.out.println("character char type "+MyObj.character);
        //methods
        Structure_Inheritance account = new Structure_Inheritance("1","Tuong",0);
        System.out.println("Id is "+account.getId());
        System.out.println("Name is "+account.getName());
        System.out.println("Credit is "+account.credit(200));
        System.out.println("Debit is "+account.debit(100));
        System.out.println("Balance is "+account.getBalance());
        System.out.println("TransferTo is "+account.transferTo(100));
        System.out.print(account.toString());
    }
}
