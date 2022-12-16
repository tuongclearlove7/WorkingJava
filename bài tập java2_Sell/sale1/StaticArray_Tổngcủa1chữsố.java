public class bai8 {

    public static int check(int n){
        int surplus, total = 0;
        while (n > 0) {
            surplus = n % 10;
            n = n / 10;
            total += surplus;
        }
        return total;
    }
    public static void totalnum(int arr[]){
        System.out.print("\nCac so trong mang co tong cac chu so lon hon 10 la : ");
        for (int i = 0; i<arr.length; i++) {
            if(check(arr[i]) > 10){
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static void output(int arr[]){
        for (int i = 0; i < arr.length;i++ ) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = {11,12,13,14,55,77,88};
        output(arr);
        totalnum(arr);
    }
}
