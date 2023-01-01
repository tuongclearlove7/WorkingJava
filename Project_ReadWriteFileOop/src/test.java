import java.io.*;
import java.util.Arrays;
import java.util.List;

/**
 *
 * Test chức năng
 *
 * */

class test {

     public static void main(String args[]) {

         String mydata = libRary.readFile(App.path);

         String[] getkey;


         String[] splitString = mydata.split(", ");

         for (int i =0 ; i < splitString.length; i++){

            System.out.println((i+1) + " " + splitString[i]);
         }

         List<String> myList = Arrays.asList(splitString);
         Object[] search_key = myList.stream().filter(s -> s.startsWith("Th")).toArray();

         for(int j = 0; j < search_key.length; j++){

             System.out.println("key : " + search_key[j]);
         }

             for (int x=0; x < splitString.length; x++) {

                 getkey = splitString[x].split(" : ");

                 for (int l = 0; l < getkey.length; l++){

                    // System.out.println(getkey[l]);
            }
        }
    }
}
