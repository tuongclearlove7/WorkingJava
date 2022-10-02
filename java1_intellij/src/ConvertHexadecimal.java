import java.util.Scanner;


public class ConvertHexadecimal {
        public static int hexToDecimal(String hexnum){
            String hstring = "0123456789ABCDEF";
            hexnum = hexnum.toUpperCase();
            int num = 0;
            for (int i = 0; i < hexnum.length(); i++) {
                char ch = hexnum.charAt(i);
                int n = hstring.indexOf(ch);
                num = 16 * num + n;
            }

            return num;
        }
        public static int FuncHexTodecimal(String hexnum){

            int num = Integer.parseInt(hexnum,16);

            return num;
        }
        public static void main(String args[]){
            Scanner input = new Scanner(System.in);

            System.out.print("nhap : ");
            String Text = input.nextLine();

            System.out.println("gia tri thap phan cua " + Text + " la : "+hexToDecimal(Text));
            System.out.println("gia tri thap phan cua " + Text + " la : "+FuncHexTodecimal(Text));
        }
}
