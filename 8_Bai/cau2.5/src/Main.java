import java.util.ArrayList;


public class Main {

    public static void main(String[] args){

        ArrayList<Officer> list_Officer = new ArrayList<>();
        Officer Off = new Officer();

        Off.Mylist(list_Officer);
        Off.Sort(list_Officer);
        Off.MaxMylist(list_Officer);

    }
}
