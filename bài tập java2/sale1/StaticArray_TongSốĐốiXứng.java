public class bai7 {

    public static int reverse(int number) {
        int res = 0;
        while (number > 0) {
            res = res * 10 + number % 10;
            number /= 10;
        }
        return res;
    }

    public static boolean Kiemtra_DX(int number) {
        if (number == reverse(number))
            return true;
        return false;
    }
    public static void output(int arr[]){
        for (int i = 0; i < arr.length;i++ ) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int output_dx(int arr[]){
        int sum = 0;

        System.out.print("\nso doi xung trong mang la : ");
        for (int i = 0; i < arr.length; i++)
            if (Kiemtra_DX(arr[i])){
                System.out.print(arr[i]+" ");
                sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        int arr[] = {11,12,13,14,55,66,77};
        output(arr);
        System.out.print("\ntong cua so doi xung la : "+output_dx(arr));
    }
}
