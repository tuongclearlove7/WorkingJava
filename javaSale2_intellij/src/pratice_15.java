import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class pratice_15 {

    public static Scanner input = new Scanner(System.in);
    public static final char SPACE = ' ';
    public static final boolean SPACE_True = true;
    public static final boolean SPACE_False = false;
    public static void Dictionary_Space(String str){

        String[] myString;
        myString = str.split(" ");

        for(int i = 0; i < myString.length ; i++ ){

            if (str.charAt(i) != SPACE) {

                System.out.print(myString[i]);
            }
        }
    }

    public static void Dictionary_Lower(String str){

        String[] myString;
        myString = str.split(" ");

        for(int i = 0; i < myString.length ; i++ ){

            System.out.print(myString[i].toLowerCase()+" ");
        }
    }

    public static String Dictionary_UpperChar1(String str){

        char[] charArray = str.toCharArray();
        boolean Bool_Space = SPACE_True;

        for(int i = 0; i < charArray.length; i++) {

            if(Character.isLetter(charArray[i])) {
                if(Bool_Space) {

                    charArray[i] = Character.toUpperCase(charArray[i]);
                    Bool_Space = SPACE_False;
                }
            }
            else {
                Bool_Space = SPACE_True;
            }
        }
        str = String.valueOf(charArray);
        return str;
    }

    public static void main(String[] args) {


        String str = "em bi ngu";
        System.out.print("Input : " + str);

        System.out.print("\nXoa Space la : "+str.replace(" ",""));

        System.out.print("\nchuoi viet thuong  la : ");
        Dictionary_Lower(str);

        System.out.print("\nchuoi viet hoa ky tu dau la : "+Dictionary_UpperChar1(str));

    }
}
