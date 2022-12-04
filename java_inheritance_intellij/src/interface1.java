import javax.swing.*;
import java.util.Scanner;

interface user1{

    private static JLabel LABEL_STUDENT;

    // private static JTextField user_input_student;
    private static JLabel LABEL_ROW;

    private static JFormattedTextField USER_INPUT_STUDENT;

    private static JFormattedTextField USER_INPUT_ROW;

    private static JButton BUTTON;

    private static JLabel RESULT;

    public static Scanner input = new Scanner(System.in);

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
