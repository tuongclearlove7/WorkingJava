public class Complex {

    private double a,j;
    public Complex() {
        a = 0;
        j = 0;
    }

    public Complex(double real_number, double fake_number) {

        this.a = real_number;
        this.j = fake_number;
    }
    public void ComplexInput(double real,double fake) {

        a = real;
        j = fake;
    }
    public void ShowComplex() {
        if (j < 0) {
            System.out.println(a + " - " + Math.abs(j) + "*i");
        } else {
            System.out.println(a + " + " + j + "*i");
        }
    }

    // Ham cong 2 so phuc
    public Complex ComplexTotal(Complex comp_num) {
        double real = a + comp_num.a;
        double fake = j + comp_num.j;
        return new Complex(real, fake);
    }

    // Ham tru 2 so phuc
    public Complex ComplexSubtraction(Complex comp_num) {
        double real = a - comp_num.a;
        double fake = j - comp_num.j;
        return new Complex(real, fake);
    }

    // Ham nhan 2 so phuc
    public Complex ComplexMulti(Complex comp_num) {
        double real = a * comp_num.a - j * comp_num.j;
        double fake = a * comp_num.j + comp_num.a * j;
        return new Complex(real, fake);
    }

    // Ham chia 2 so phuc
    public Complex ComplexDivision(Complex comp_num) {
        double real = (a * comp_num.a + j * comp_num.j) / (comp_num.a * comp_num.a + comp_num.j * comp_num.j);
        double fake = (comp_num.a * j - a * comp_num.j) / (comp_num.a * comp_num.a + comp_num.j * comp_num.j);
        return new Complex(real, fake);
    }
}
