import java.util.Scanner;

public class myname {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input : ");
        String str = input.nextLine();

        int k = str.indexOf(' ');

        String firstname = str.substring(0,k);
        String lastname = str.substring(k+1);

        System.out.print("firstname : "+firstname+'\n');
        System.out.print("lastname : "+lastname);
    }
}
