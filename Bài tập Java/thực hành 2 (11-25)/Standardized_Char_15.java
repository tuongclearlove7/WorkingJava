import java.util.Scanner;

public class Standardized_Char_15 {

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
        boolean B_Space = SPACE_True;
        for(int i = 0; i < charArray.length; i++) {
            if(Character.isLetter(charArray[i])) {
                if(B_Space) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    B_Space = SPACE_False;
                }
            }
            else {
                B_Space = SPACE_True;
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
