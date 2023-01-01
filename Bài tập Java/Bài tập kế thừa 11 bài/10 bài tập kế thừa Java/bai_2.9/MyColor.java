public class MyColor extends Main{

    private int Color;

    public MyColor(int color) {

        this.Color = color;
    }


    public MyColor(){

    }

    public int getColor() {

        return Color;
    }

    public void setColor(int color) {

        this.Color = color;
    }

    public void Input(){

        System.out.print("nhap so mau : ");
        Color = input.nextInt();

    }

    public void Output(){

        System.out.print("so mau : " + getColor() + "\n");
    }


    @Override
    public String toString() {

        return "Color : " + Color;
    }
}
