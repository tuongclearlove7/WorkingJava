import java.util.ArrayList;

public class ColorPrinter extends Printer {

    private String color;


    public ColorPrinter(String color) {

        this.color = color;

    }


    public ColorPrinter() {

    }


    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public void Output(){


        System.out.println("Color  : " + getColor());

    }



    @Override
    public String toString() {


        return super.toString() + "\n\t\tcolor : " + getColor() + "\n}";
    }

}

