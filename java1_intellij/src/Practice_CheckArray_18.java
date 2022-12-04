import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Practice_CheckArray_18 {

    public static Scanner input = new Scanner(System.in);

    public static void ErrorFunction(int arr[]){

        int c = 0;


        for (int i = 0; i < arr.length; i++) {


            c++;

            if(c == 2) {


                System.out.print("\nCac phan tu xuat hien " + c +" lan la " + arr[i]);
            }
        }
    }

    public static void addElement(Map<Integer, Integer> map, int element) {


        if (map.containsKey(element)) {


            int count = map.get(element) + 1;
            map.put(element, count);

        } else {


            map.put(element, 1);
        }
    }


    public static void Count_TwoElement(int arr[]) {

        for(int i = 0; i<arr.length ; i++){


            System.out.print(arr[i]+" ");
        }

        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

        for (int i = 0; i < arr.length; i++) {


            addElement(map, arr[i]);
        }

        System.out.print("\ncac phan tu xuat hien "+ 2 + " lan la : ");

        for (Integer key : map.keySet()) {


            if (map.get(key) == 2) {


                System.out.print(key +", ");
            }
        }
    }


    public static void Count_AppearElement(int arr[], int Xnumbers) {

        int count = 0;
        int i = 0;

        while (i < arr.length) {


            if (arr[i] == Xnumbers) {


                count++;
            }


            i++;
        }

        System.out.print("\nphan tu "+Xnumbers +" xuat hien "+count +" lan trong day");
    }


   public static void main(String args[]) {

        int[] arr = {1,1,2,2,3,4,5,5,5,5,6,6};

        Count_TwoElement(arr);

        for (int  i = 0; i < args.length ; i++){

            Count_AppearElement(arr,arr[i]);
        }
    }
}
