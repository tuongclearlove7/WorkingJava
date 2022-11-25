import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;
import java.util.Arrays;

public class pratice_20 {


    public static Scanner input = new Scanner(System.in);
    public static final char SPACE = ' ';
    public static final boolean SPACE_True = true;
    public static final boolean SPACE_False = false;

    public static final char TAB = '\t';

    public static final char BREAK_LINE = '\n';

    public static void AlgorithmDeleteSpace(String str){

        String[] myString;
        myString = str.split(" ");

        for(int i = 0; i < myString.length ; i++ ){

            if (str.charAt(i) != SPACE) {

                System.out.print(myString[i]);
            }
        }
    }
    public static String FuncSplit_String(String str, String StrNospace){

        String[] myString;
        myString = str.split(" ");

        for(int i = 0; i < myString.length ; i++ ){

            return str.replace(StrNospace,myString[i]);

        }

        return "";
    }
    public static String Dictionary_Upper(String str){

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

    public static void Algorihm_String_Reverse(String str){

        String[] myString;
        myString = str.split(" ");
        System.out.print(myString[myString.length-1] + " ");

        for(int i = 1; i < myString.length-1 ; i++ ){

            System.out.print(myString[i]+" ");
        }

        System.out.print(myString[0]);
    }

    public static void Algorihm_Count_Character(String str, char character) {

        int countcharacter = 0;

        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == character){

                countcharacter++;
            }
        }

        System.out.println("Ky tu "+ character + " xuat hien " + countcharacter + " lan.");
    }

    public static String Function_String_Reverse(String str){

        String Reverse = new StringBuffer(str).reverse().toString();

        return Reverse;
    }

    public static void main(String[] args) {


        String str = "phuoc tuan";

        System.out.print("Input : " + str);

        String StringNoSpace = "phuoctuan";

        System.out.print("\nInput2 : " + StringNoSpace);

        char[] character = new char[100];

        character[0] = SPACE;
        character[1] = 't';
        character[2] = 'u';
        character[3] = 'o';
        character[4] = 'n';
        character[5] = 'n';
        character[6] = 'h';
        character[7] = 'i';
        character[8] = 'e';
        character[9] = 'l';
        character[10] = 'a';
        character[11] = 'm';

        System.out.print("\nChuoi viet hoa ky tu dau la : " + Dictionary_Upper(str));

        System.out.print("\nXoa Space dung ham : "+str.replace(" ",""));

        System.out.print("\nTach chuoi thanh cac mang dung ham split la : " + FuncSplit_String(str,StringNoSpace));

        System.out.println();
        Algorihm_Count_Character(str,character[0]);
        Algorihm_Count_Character(str,character[1]);
        Algorihm_Count_Character(str,character[2]);
        Algorihm_Count_Character(str,character[3]);
        Algorihm_Count_Character(str,character[4]);
        Algorihm_Count_Character(str,character[5]);
        Algorihm_Count_Character(str,character[7]);
        Algorihm_Count_Character(str,character[8]);
        Algorihm_Count_Character(str,character[9]);
        Algorihm_Count_Character(str,character[10]);
        Algorihm_Count_Character(str,character[11]);

        System.out.print("\nDao nguoc chuoi dung ham : " + Function_String_Reverse(str));


    }
}
