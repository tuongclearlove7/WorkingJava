import java.util.Scanner;
class ClassArray{

    private int arr[];
    private int num;
    Scanner input = new Scanner(System.in);
    int NFuction(int n){
        num = n;
        return num;
    }
    void InFuction(int list[],int n){
        arr = list;
        for(int i = 0; i < NFuction(n); i++) {
            System.out.print("Input Array : ");
            arr[i] =  input.nextInt();
        }
    }
    void OutFuction(int list[],int n){
        arr = list;
        for(int i = 0; i < NFuction(n); i++) {
            System.out.println("Output Array = [" + arr[i] + "]");
        }
    }
    void SortFunction(int list[],int n){
        arr = list;
        int temp;
        for(int i = 0;i < NFuction(n);i++){
            for(int j = 0; j < NFuction(n); j++){
                if(arr[i] > arr[j]){
                   temp = arr[i];
                   arr[i]=arr[j];
                   arr[j] = temp;
                }
            }
        }
        for(int i = 0; i < NFuction(n); i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
class ClassArray2 extends ClassArray{

}