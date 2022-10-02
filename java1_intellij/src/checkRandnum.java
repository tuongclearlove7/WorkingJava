import java.util.Scanner;


public class checkRandnum {

    public static void user(int[] arr) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 1; i++) {
            arr[i] = input.nextInt();
        }
    }
    public static void main(String[] args) {

        int arr[] = new int[10];
        for (int i=0; i<1; i++) {
            double randomDouble = Math.random();
            randomDouble = randomDouble * 100;
            int randomInt = (int) randomDouble;
            System.out.print("so ngau nhien la : " + randomInt);
            System.out.print("\nnhap vao so : ");
            user(arr);
            if(arr[i]<randomInt)
                System.out.print("\nso nhap vao be hon so ngau nhien");
            if(arr[i]>randomInt)
                System.out.print("\nso nhap vao lon hon so ngau nhien ");
            else if(arr[i]==randomInt)
                System.out.print("\nso nhap vao bang so ngau nhien");
        }
    }
}
