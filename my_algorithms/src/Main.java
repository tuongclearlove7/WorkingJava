import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class nUMBER{
    private int number;
    public nUMBER(){
    }
    public nUMBER(int number){
        this.number = number;
    }

    public int getNumber() {

        return number;
    }


    public void setNumber(int number) {

        this.number = number;
    }

    public void sortOop(ArrayList<nUMBER> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j).getNumber() > list.get(j + 1).getNumber()) {
                    Collections.swap(list, j, j + 1);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "nUMBER{" +
                "number=" + number +
                '}';
    }

    public void printArrayList(ArrayList<nUMBER> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i).getNumber() + " ");
        }
    }

}

public class Main {

    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    void sorted(int arr[]) {
        int n = arr.length;
        int flag;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < i + 1; j++){
                if (arr[i] < arr[j]) {
                    flag = arr[i];
                    arr[i]=arr[j];
                    arr[j] = flag;
                }
            }
        }
    }
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    void mergeSort(int arr[], int l, int m, int r) {

        // Tìm kích thước của 2 mảng con để merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Tạo mảng tạm
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy dữ liệu vào mảng tạm
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Merge các mảng tạm lại

        // Chỉ mục ban đầu của 2 mảng con
        int i = 0, j = 0;

        // Chỉ mục ban đầu của mảng phụ được hợp nhất
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Sao chép các phần tử còn lại của L[] nếu có
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Sao chép các phần tử còn lại của R[] nếu có
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void sort(int arr[], int l, int r) {
        if (l < r) {
            // Tìm điểm chính giữa
            int m = (l + r) / 2;
            // Hàm đệ quy tiếp tục chia đôi
            sort(arr, l, m);
            sort(arr, m + 1, r);
            mergeSort(arr, l, m, r);
        }
    }

    public static void sort_matrix(int arr[][]){

        int i, j, f;
        int n=arr.length;
        int m=arr[0].length;
        int nm = arr.length * arr[0].length - 1;

        for (i = 0; i < nm; ++i) {
            for (j = 0; j < nm - i; ++j) {
                if (arr[j / m][j % m] > arr[(j + 1) / m][(j + 1) % m]) {
                    f = arr[(j + 1) / m][(j + 1) % m];
                    arr[(j + 1) / m][(j + 1) % m] = arr[j / m][j % m];
                    arr[j / m][j % m] = f;
                }
            }
        }
        System.out.println("\nsort :");
        for (i = 0; i < n; ++i) {
            for (j = 0; j < m; ++j) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        ArrayList<nUMBER> list = new ArrayList<>();
        nUMBER n = new nUMBER();
        nUMBER n16 = new nUMBER(16);
        nUMBER n11 = new nUMBER(11);
        nUMBER n17 = new nUMBER(17);
        nUMBER n10 = new nUMBER(10);
        Main sorting = new Main();
        int arr[] = { 5, 1, 4, 2, 8 };
        int[][] matrix = {
                {2, 8, 9},
                {7, 11, 10},
                {1, 5, 41}
        };
        list.add(n16);
        list.add(n11);
        list.add(n17);
        list.add(n10);



        System.out.println("Mảng ban đầu:");
        sorting.printArray(arr);

        sorting.bubbleSort(arr);
        System.out.println("Bubble sort array :");
        sorting.printArray(arr);

        sorting.sorted(arr);
        System.out.println("Sorted array :");
        sorting.printArray(arr);

        sorting.sort(arr, 0, arr.length - 1);
        System.out.println("Merge sort array :");
        sorting.printArray(arr);

        System.out.println("Oop sort array :");
        n.sortOop(list);
        n.printArrayList(list);

        System.out.println("Sort amtrix :");
        sort_matrix(matrix);

    }
}