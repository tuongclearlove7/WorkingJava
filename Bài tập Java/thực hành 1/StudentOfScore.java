import java.util.Scanner;

public class StudentOfScore {
    public static Scanner input = new Scanner(System.in);
    public static void InputScore(int ThreeArray[][][], int student, int exam, int part) {

        int[] arr = new int[student];
        int[] arrchoice = new int[student];
        int[] arressay = new int[student];
        int total = 0;
        int score = 0;
        int score_choice = 0;
        int essay = 0;
        int score_choice1 = 0;
        int essay1 = 0;
        int a;
        int n;

        for (int i = 0; i < student; i++) {
            int k = i + 1;
            System.out.println("\tNhap Diem Cho Hoc Sinh Thu" + k + "\n");
            for (int j = 0; j < exam; j++) {
                for (int t = 0; t < part; t++) {
                    if (t == 0) {
                        int g = j + 1;
                        do{
                            System.out.print("Nhap  Diem Trac Nghiem Lan Thu "+ g +" : ");
                            a = input.nextInt();
                        }
                        while(a<0||a>10);
                        ThreeArray[i][j][t]=a;
                        score = score + ThreeArray[i][j][t];
                        g = 0;
                        score_choice = score_choice + ThreeArray[i][j][t];
                    }
                    if(t==0){
                        int g = j + 1;
                        do{
                            System.out.print("Nhap  Diem Tu Luan Lan Thu "+ g + " : ");
                            n = input.nextInt();}
                        while(n<0||n>10);
                        ThreeArray[i][j][t]=n;
                        score = score + ThreeArray[i][j][t];
                        g = 0;
                        essay = essay + ThreeArray[i][j][t];
                    }
                }
                total = total + score;
                score = 0;
                score_choice1 = score_choice1 + score_choice;
                essay1 = essay1 + essay;
                score_choice = 0;
                essay = 0;
            }
            arrchoice[i] = score_choice1;
            arressay[i] = essay1;
            arr[i] = total;
            total = 0;
            score = 0;
            score_choice1 = 0;
            essay1 = 0;
            k = 0;
        }
        for (int f = 0; f < student; f++) {
            int l = f + 1;
            System.out.println("Tong diem trac nghiem Hoc Sinh Thu " + l + " La : " + arrchoice[f]);
            l = 0;
        }
        for (int c = 0; c < student; c++) {
            int b = c + 1;
            System.out.println("Tong diem tu luan Hoc Sinh Thu " + b + " La : " + arressay[c]);
            b = 0;
        }
        for (int v = 0; v < student; v++) {
            int s = v + 1;
            System.out.println("Tong diem cua Hoc Sinh Thu " + s + " La : " + arr[v]);
            s = 0;
        }
    }
    public static void main(String[] args) {

        int exam, part, student;
        System.out.print("Nhap so hoc sinh : ");
        student = input.nextInt();
        System.out.print("Nhap so ky thi : ");
        exam = input.nextInt();
        System.out.print("Nhap so phan thi :");
        part = input.nextInt();

        int[][][] ThreeArray = new int[student][exam][part];
        InputScore(ThreeArray, student, exam, part);

    }
}






