import java.util.Scanner;
import java.text.DecimalFormat;

 class Equation_1 {

    private int a,b;
    Equation_1(){
        a = 0;
        b = 0;
    }
     Equation_1(int numA, int numB) {

        this.a = numA;
        this.b = numB;
    }

    int getA(int numA){


        a = numA;
        return a;
    }
    int getB(int numB){


        b = numB;
        return b;
    }
     void setA(int numA){


        this.a = numA;
    }
     void setB(int numB){


        this.b = numB;
    }
    int Method_Equation_1(int numA,int numB){


        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double result;

        if (numA == 0) {

            if (numB == 0) {

                System.out.println("Phương trình này có vô số nghiệm.");
            } else {

                System.out.println("Phương trình vô nghiệm.");
            }
        } else {

            result = (double) -numB / numA;
            System.out.println("Phương trình có nghiệm x = " + decimalFormat.format(result) + ".");
        }

        return numA;
    }

}
class Equation_2 extends Equation_1{

    private String id;
    private String name;
    private int balance;

    public Equation_2(String id, String name, int balance) {
        
        this.id = id;
        this.name = name;
    }
    public static void main(String[] args) {

        Equation_1 E = new Equation_1();
        Equation_1 getNum = new Equation_1(E.getA(0), E.getB(2));
        int A = getNum.getA(0);
        int B = getNum.getB(0);

        System.out.println("so A : " + A);
        System.out.println("so B : " + B);

        E.Method_Equation_1(A, B);
    }
}