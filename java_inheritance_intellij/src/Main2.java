import java.util.ArrayList;
import java.util.Arrays;
/**?
 array list
 co thể hoán đổi cac phần tử trong mảng
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

                System.out.print(arr[i][j]);

                line++;

                if( arr[i][j] == xnum){

                    System.out.print("\t");
                    line = 0;
                }

                if(arr[i][j] == xnum){

                    count++;

                }
            }
        }

        System.out.print("\n"+xnum + " xuat hien "+ count);

    }
}

public class Main2 {

    public static void main(String args[]){

        ARRAY_LIST arr0 = new ARRAY_LIST();
        ARRAY_LIST arr2 = new ARRAY_LIST2();// array list 2 kế thừa array list 1

        ARRAY_LIST2 arr3 = new ARRAY_LIST2();

        arr0.myarray();
        arr2.myarray();

        int matrix[][] = {

                {2, 2, 2, 2, 2},
                {3, 1, 1, 1, 3},
                {3, 1, 1, 1, 3},
                {3, 1, 1, 1, 3},
                {4, 4, 4, 4, 4},
        };

        arr3.Algorithm_CountAppearNumbers(matrix, 1);


    }
}











