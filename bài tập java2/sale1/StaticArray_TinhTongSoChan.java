public class StaticArray_TinhTongSoChan {
    public static int sochan(int arr[]){

        int total = 0;

        System.out.print("\nso chan trong mang la : ");
        for (int i = 0; i < arr.length;i++ ) {
            if (arr[i]%2 == 0 ){
                System.out.print(arr[i] + " ");
                total = total + arr[i];
            }
        }
        return total;
    }
    public static void output(int arr[]){
        for (int i = 0; i < arr.length;i++ ) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {

        int arr[] = {1,3,2,12,56,8};
        output(arr);
        System.out.print("\ntong cac so chan la : "+sochan(arr));

    }
}
