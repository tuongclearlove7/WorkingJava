import java.util.Arrays;

public class test2 {


    public static int[] addX(int n, int arr[], int x)
    {
        int i;

        int newarr[] = new int[n + 1];

        for (i = 0; i < arr.length; i++)

            newarr[i] = arr[i];

        newarr[arr.length] = x;

        return newarr;
    }


    public static void find_X(int arr[],int x) {

        for(int i = 0; i< arr.length ; i++){

            if(x==arr[i]){

                System.out.println(x + " o vi tri " + i + " trong mang ");
            }

        }


    }

    public static void main(String args[]) {

        int[] array_X = {50,8,34,6,98,17,83,25,66,42,21,59,62,71,85,76};
        int x = 76;

        find_X(array_X,x);

        System.out.print("Array chua chen X : " + Arrays.toString(array_X));

        array_X = addX(array_X.length, array_X, x);

        System.out.println("\nArray chen " + x + " : " + Arrays.toString(array_X));



    }
}
