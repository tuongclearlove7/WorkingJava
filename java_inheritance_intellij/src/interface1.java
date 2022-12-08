import javax.swing.*;
import java.util.Scanner;

interface user1{

    void BAI1();
    void BAI2();
    void BAI3();

}

class interface1 implements user1{

    public static void main(String a[]){

        interface1 object = new interface1();

        object.BAI1();
        object.BAI2();
        object.BAI2();


    }

    @Override
    public void BAI1(){

        System.out.println();
    }
    @Override
    public void BAI2(){

        System.out.println();
    }
    public void BAI3(){

        System.out.println();
    }

}
