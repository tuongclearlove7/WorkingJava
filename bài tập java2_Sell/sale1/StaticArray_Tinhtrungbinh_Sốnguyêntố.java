public class bai6 {

    public static boolean CheckPrimeNumber(int n) {

        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt (n); i ++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int OutputArray(int arr[]){

        int count = 0;
        int tb = 0;
        int total = 0;
        System.out.print("\nso nguyen to trong mang : ");
        for (int i = 0; i < arr.length;i++ ) {
            if(CheckPrimeNumber(arr[i])){
                System.out.print(arr[i] + " ");
                total = total + arr[i];
                count++;
                tb = total / count;

            }
        }
        return tb;
    }
    public static void output(int arr[]){
        for (int i = 0; i < arr.length;i++ ) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,23,43,11,17,47};
        output(arr);
        System.out.println("\ntrung binh cac so nguyen to la : "+OutputArray(arr));
    }
}
