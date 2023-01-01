
public class Triangle extends MyColor{

    private int A;

    private int B;

    private int C;

    private int X;

    private int Y;

    private int Z;

    private int K;


    public Triangle(int a, int b, int c, int x, int y, int z, int k) {

        this.A = a;
        this.B = b;
        this.C = c;
        this.X = x;
        this.Y = y;
        this.Z = z;
        this.K = k;

    }

    public int getA() {

        return A;
    }

    public void setA(int a) {

        A = a;
    }


    public int getB() {

        return B;
    }

    public void setB(int b) {

        B = b;
    }

    public int getC() {


        return C;
    }

    public void setC(int c) {


        C = c;
    }

    public int getX() {

        return X;
    }

    public void setX(int x) {

        X = x;
    }

    public int getY() {

        return Y;
    }

    public void setY(int y) {

        Y = y;
    }

    public int getZ() {

        return Z;
    }

    public void setZ(int z) {

        Z = z;
    }

    public int getK() {

        return K;
    }

    public void setK(int k) {

        K = k;
    }

    public boolean move(int dx, int dy) {

        A = A + dx;
        A = A + dy;

        B = B + dx;
        B = B + dy;

        C = C + dx;
        C = C + dy;

        return false;
    }

    public void Output(){

        move(getA(),getB());
        System.out.println("toa do dinh la : " + getA());
        System.out.println("toa do dinh la : " + getB());
        System.out.println("toa do dinh la : " + getC());
        System.out.println("mau cua tam giac la : " + getK());
    }


    @Override
    public String toString() {

        return  "Triangle : {\n\n\t\tA : " + A + "\n\t\tB : " +

                        B + "\n\t\tC : " + C + "\n\t\tX : " +

                        X + "\n\t\tY : " + Y + "\n\t\tZ : " +

                        Z + "\n\t\tK : " + K + "\n}";
    }
}
