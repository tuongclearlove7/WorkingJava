import java.util.Scanner;

public class Fraction {
    private int a,b;
    public Fraction(int x, int y) {

        this.a = x;
        this.b = y;
    }

    public int getx() {
        return a;
    }

    public void setx(int x) {
        this.a = x;
    }

    public int gety() {

        return b;
    }

    public void sety(int y) {

        this.b = y;
    }
    public int USCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public void Simplify_Fraction() {
        int i = USCLN(this.getx(), this.gety());
        this.setx(this.getx() / i);
        this.sety(this.gety() / i);
    }
    
    public void Total_Fraction(Fraction Frac) {
        int XA = this.getx() * Frac.gety() + Frac.getx() * this.gety();
        int BY = this.gety() * Frac.gety();
        Fraction total_F = new Fraction(XA, BY);
        System.out.println("Tổng hai phân số = " + total_F.a + "/" + total_F.b);
    }

    public void Sub_Fraction(Fraction Frac) {
        int XA = this.getx() * Frac.gety() - Frac.getx() * this.gety();
        int BY = this.gety() * Frac.gety();
        Fraction Sub_F = new Fraction(XA, BY);
        System.out.println("Hiệu hai phân số = " + Sub_F.a + "/" + Sub_F.b);
    }

    public void Multi_Fraction(Fraction Frac) {
        int XA = this.getx() * Frac.getx();
        int BY = this.gety() * Frac.gety();
        Fraction Multi_F = new Fraction(XA, BY);
        System.out.println("Tích hai phân số = " + Multi_F.a + "/" + Multi_F.b);
    }

    public void Division_Fraction(Fraction Frac) {
        int XA = this.getx() * Frac.gety();
        int BY = this.getx() * Frac.gety();
        Fraction phanSoThuong = new Fraction(XA, BY);
        System.out.println("Thương hai phân số = " + phanSoThuong.a + "/" + phanSoThuong.b);
    }
}
