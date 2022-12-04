import java.util.Scanner;
/**
 * @author  Clearlove7
 * @Name Tran The Tuong
 * :)))
 */
public class Pratice_ReplaceString_20 {

    public static Scanner input = new Scanner(System.in);

    public static final char CharSPACE = ' ';

    public static final String StringSPACE = " ";
    public static final String NoStringSPACE = "";
    public static final boolean SPACE_True = true;
    public static final boolean SPACE_False = false;

    public static final char TAB = '\t';

    public static final char BREAK_LINE = '\n';
    public static final char[] CharacterArray = new char[100];

    public static void AlgorithmDeleteSpace(String str){

        char[] strArray = str.toCharArray();
        StringBuffer StrBuffer = new StringBuffer();

        for (int i = 0; i < strArray.length; i++) {

            if ( strArray[i] != CharSPACE && strArray[i] != TAB && strArray[i] != BREAK_LINE) {

                StrBuffer.append(strArray[i]);
            }
        }

        String noSpaceStr = StrBuffer.toString();
        System.out.println(noSpaceStr);
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

        char[] charArray;
        charArray = str.toCharArray();
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
        System.out.print(myString[myString.length-1] + StringSPACE);

        for(int i = 1; i < myString.length-1 ; i++ ){

            System.out.print(myString[i] + StringSPACE);
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

        String str = "yeu em rat nhieu";
        System.out.print("Input : " + str);
        String StringNoSpace = "yeuemratnhieu";
        char character[] = {'t','u','o','n','g'};

        System.out.print("\nChuoi bi xoa khoang cach <Space> : ");
        AlgorithmDeleteSpace(str);

        System.out.print("\nDao nguoc tu trong chuoi : ");
        Algorihm_String_Reverse(str);

        System.out.print("\n___________________________Replace__________________________\n");

        System.out.print("Chuoi viet hoa ky tu dau la : " + Dictionary_Upper(str));

        System.out.print("\nXoa Space dung ham : "+str.replace(StringSPACE,NoStringSPACE));

        System.out.print("\nTach chuoi thanh cac mang dung ham split la : " + FuncSplit_String(str,StringNoSpace));

        System.out.print("\nLiet ke so lan xuat hien cua cac ky tu trong chuoi la. \n");

        for (int i = 0; i < character.length; i++){

            Algorihm_Count_Character(str,character[i]);
        }

        System.out.print("Dao nguoc chuoi dung ham : " + Function_String_Reverse(str));
    }
}
