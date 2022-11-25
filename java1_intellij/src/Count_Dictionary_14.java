import java.util.Scanner;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;
import java.util.Arrays;

public class Count_Dictionary_14 {

    public static Scanner input = new Scanner(System.in);
    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';
    public static final char DASH = '_';

    public static int DictionaryCount(String str) {

        int count = 0;
        int size = str.length();
        boolean notCounted = true;

        if (str == null) {
            
            return -1;
        }

        for (int i = 0; i < size; i++) {


            if (str.charAt(i) != SPACE && str.charAt(i) != TAB &&


                    str.charAt(i) != BREAK_LINE && str.charAt(i) != DASH) {

                if(notCounted) {


                    count++;
                    notCounted = false;
                }
            }
            else {

                notCounted = true;
            }
        }
        return count;
    }


    public static void main(String[] args) {

        System.out.print("Input : ");
        String str = input.nextLine();
        System.out.print("so tu trong chuoi la : "+ DictionaryCount(str));

    }
}
