import java.util.Scanner;

public class Standardized_Char_15 {

    public static Scanner input = new Scanner(System.in);
    public static final char SPACE = ' ';
    public static final boolean SPACE_True = true;
    public static final boolean SPACE_False = false;

    public static final char TAB = '\t';

    public static final char BREAK_LINE = '\n';
    public static void Dictionary_Space(String str){

        char[] strArray = str.toCharArray();
        StringBuffer StrBuffer = new StringBuffer();

        for (int i = 0; i < strArray.length; i++) {

            if ((strArray[i] != SPACE) && (strArray[i] != TAB)) {

                StrBuffer.append(strArray[i]);
            }
        }

        String noSpaceStr = StrBuffer.toString();
        System.out.println(noSpaceStr);
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

        System.out.print("Input : ");
        String str = input.nextLine();
        System.out.print("chuoi k space la : ");
        Dictionary_Space(str);
        System.out.print("\nchuoi viet thuong  la : ");
        Dictionary_Lower(str);
        System.out.print("\nchuoi viet hoa ky tu dau la : "+Dictionary_UpperChar1(str));

    }
}
