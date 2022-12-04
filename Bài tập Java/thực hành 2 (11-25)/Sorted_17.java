public class Sorted_17 {

    public static void SortedArray(int arr[],int n) {

        int flag;
        n = arr.length;

        for(int i = 0; i<n ; i++)

            for(int j = i ; j<n; j++)

                if(arr[i] > arr[j]){

                    flag = arr[i];
                    arr[i]=arr[j];
                    arr[j] = flag;

                }
                
        for(int i = 0; i<n ; i++){

            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[]) {

        int[] RangeKey = {50,8,34,6,98,17,83,25,66,42,21,59,62,71,85,76};
        SortedArray(RangeKey,RangeKey.length);

    }
}
