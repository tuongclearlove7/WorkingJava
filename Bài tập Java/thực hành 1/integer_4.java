import java.util.Scanner;

public class integer_4 {
    public static Scanner input = new Scanner(System.in);

    public static void InputArrNum(int arr[],int n) {
        System.out.println("Nhập vào mảng số có " + n + " giá trị: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

    }
    public static int find_x(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (i == x) {
                return arr[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.print("Nhập số lượng số: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        InputArrNum(arr,n);
        System.out.print("Nhập vào vị trí cần tìm: ");
        int x = input.nextInt();
        System.out.print("Giá trị tại vị trí " + x + " là: " + find_x(arr, x-1));
    }
}
