public class ranNum_Arr2 {
    public static int[] InputRanNum(int arr[],int n) {

        for (int i = 1; i < n; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        return arr;
    }
    public static int randArr(int[] arr,int n) {

        int total = 0;
        int count = 0;
        int medium = 0;
        int Outline = 0;

        //System.out.println("so ngau nhien sinh ra : ");
        for (int i = 1; i < n; i++) {
            Outline++;
            count++;
            total = total + arr[i];
            //System.out.print(arr[i] + " ");
            if (Outline == 10) {
                System.out.print("\n");
                Outline = 0;
            }
        }
        medium = total / count;

        return medium;
    }

    public static int GreatMedium(int arr[],int n) {

        int flag = randArr(arr,n);
        int great = 0;

        for (int i = 1 ; i < n ; i++) {
            if (flag < arr[i]) {
                great++;
            }
        }

        return great;
    }

    public static void main(String[] args) {

        int n = 101;
        int[] arr = new int[n];
        int[] list = InputRanNum(arr,n);

        System.out.print("so trung binh cong la : " + randArr(list,n)
        +"\n"+"co " + GreatMedium(list,n) + " so lon hon so trung binh");
    }
}

















