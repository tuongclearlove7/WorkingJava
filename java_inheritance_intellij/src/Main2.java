import java.util.ArrayList;
import java.util.Arrays;
/**?
 array list có thể hoán đổi các phần tử trong mảng
 * */

class ARRAY_LIST{

    void myarray(){

        Integer[] arr = {3,4,5,6,7,8,9};

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

        java.util.Collections.shuffle(list);

        System.out.println("My array = " + list);
    }
}

class ARRAY_LIST2 extends ARRAY_LIST{

    void Algorithm_CountAppearNumbers(int arr[][],int xnum){

        int count = 0;
        int line = 0;

        for (int i = 0; i < arr.length; i++){

            for (int j = 0; j < arr.length; j++){

               // System.out.print(arr[i][j]);

                /*line++;

                if( arr[i][j] == xnum){

                    System.out.print("\t");
                    line = 0;
                }*/

                if(arr[i][j] == xnum){

                    count++;

                }
            }
        }

        System.out.print("\n"+xnum + " xuat hien "+ count);

    }

    int Algorithm_CountCharacterNumbers(int arr[][],int xnum){

        int count = 0;

        System.out.print("\n" + xnum);

        while (xnum != 0) {

            xnum = xnum / 10;
            count++;
        }

        System.out.print(" co " + count + " chu so");

        return count;
    }
}

public class Main2 {

    public static void main(String args[]){

        ARRAY_LIST arr0 = new ARRAY_LIST();
        ARRAY_LIST2 arr1 = new ARRAY_LIST2();
        ARRAY_LIST arr2 = new ARRAY_LIST2();// array list 2 kế thừa array list 1

        ARRAY_LIST2 arr3 = new ARRAY_LIST2();

        arr0.myarray();
        arr2.myarray();

        int matrix[][] = {

                {22222, 2222, 222, 22, 2},
                {33333, 1, 1, 1, 3},
                {33333, 1, 1, 1, 3},
                {33333, 1, 1, 1, 3},
                {44444, 4, 4, 4, 4},
        };

        for (int i = 0; i < matrix.length; i++){

            for (int j = 0; j < matrix.length; j++){

                    arr3.Algorithm_CountAppearNumbers(matrix, matrix[i][j]);

            }

        }

        arr3.Algorithm_CountCharacterNumbers(matrix, matrix[0][0]);


    }
}











