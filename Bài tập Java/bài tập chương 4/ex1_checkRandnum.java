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
        int k = 0;

            for (int i=0; i<1; i++) {
                do {
                    try {
                        double randomDouble = Math.random();
                        randomDouble = randomDouble * 100;
                        int randomInt = (int) randomDouble;
                        System.out.print("\nso ngau nhien la : " + randomInt);
                        System.out.print("\nnhap vao so : ");
                        user(arr);
                        if (arr[i] < randomInt){
                            System.out.println(arr[i]+" be hon so ngau nhien "+randomInt);
                            break;
                        }

                        if (arr[i] > randomInt){
                            System.out.println(arr[i]+" lon hon so ngau nhien "+randomInt);
                            break;
                        }

                        else if (arr[i] == randomInt) {
                            System.out.println(arr[i]+" bang so ngau nhien "+randomInt);
                            break;
                        }
                    }
                    catch (Exception e) {
                        System.out.print("ban da nhap sai !");
                    }
            }while (true);
        }
    }
}