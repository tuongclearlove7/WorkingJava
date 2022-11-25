import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class triangle_angle {

    public static void Triangle(double xa,double ya,double xb,double yb,double xc,double yc){

        DecimalFormat Float_Format = new DecimalFormat("#");
        
        double AB = Math.sqrt((Math.pow(xb - xa,2) + Math.pow(yb - ya,2)));
        double BC = Math.sqrt((Math.pow(xc - xb,2) + Math.pow(yc - yb,2)));
        double CA = Math.sqrt((Math.pow(xa - xc,2) + Math.pow(ya - yc,2)));

        double A = BC * Math.cos((BC * BC - CA * CA - AB * AB) / (-2 * CA * AB));
        double B = BC * Math.cos((CA * CA - BC * BC - AB * AB) / (-2 * BC * AB));
        double C = BC * Math.cos((AB * AB - CA * CA - BC * BC) / (-2 * BC * CA));

        A = A * 180 / Math.PI;
        B = B * 180 / Math.PI;
        C = C * 180 / Math.PI;

        System.out.println("Goc A la : " + Float_Format.format(A));
        System.out.println("Goc B la : " + Float_Format.format(B));
        System.out.println("Goc C la : " + Float_Format.format(C));
        System.out.println(Float_Format.format(A+B+C));
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("nhap toa do (xa),(ya) : ");

        double xa = input.nextDouble();
        double ya = input.nextDouble();

        System.out.print("nhap toa do (xb),(yb) : ");

        double xb = input.nextDouble();
        double yb = input.nextDouble();

        System.out.print("nhap toa do (xc),(yc) : ");

        double xc = input.nextDouble();
        double yc = input.nextDouble();
        Triangle(xa,ya,xb,yb,xc,yc);

    };
}
