import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class DynamicArr {

    public static void inputArr(int arr[]){
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < arr.length;i++ ){
            System.out.print("\nnhap vao so nguyen : ");
            arr[i] = input.nextInt();
        }
    }
    public static void outputArr(int arr[]){

        for (int i = 0; i < arr.length;i++ ) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int randArr(int arr[]){

        System.out.print("so ngau nhien sinh ra : ");
        for (int i = 0; i < arr.length;i++ ){
            arr[i] = (int) (Math.random() * 10);
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n");
        return 0;
    }


    public static int assign(int num, int numArr[]) {
        num = 1001;
        numArr[0] = 5555;
        return 0;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = 5;
        int[] list = new int[n];
        int n1 = (int) (Math.random() * 10);
        int n2 = (int) (Math.random() * 10);
        int n3 = (int) (Math.random() * 10);
        int n4 = (int) (Math.random() * 10);
        int n5 = (int) (Math.random() * 10);

        int x = 1;
        int y[] = new int[10];

        //inputArr(list);
        randArr(list);
        outputArr(new int[]{n1,n2,n3,n4,n5});
        assign(x,y);
        System.out.print("\n"+x);
        System.out.print("\n"+y[0]);
    }
}











