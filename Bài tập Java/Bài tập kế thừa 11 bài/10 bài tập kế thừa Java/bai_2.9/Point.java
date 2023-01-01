public class Point extends Main {

    private double x;
    private double y;

    public Point() {

        x = 0;
        y = 0;
    }

    public Point(double x, double y) {

        this.x = x;
        this.y = y;
    }

    public double getX() {

        return x;
    }

    public void setX(double x) {

        this.x = x;
    }

    public double getY() {

        return y;
    }

    public void setY(int y) {

        this.y = y;
    }

    public double distance(Point d2) {

        return Math.sqrt((this.x - d2.x) * (this.x - d2.x) + (this.y - d2.y) * (this.y - d2.y));
    }



    @Override
    public String toString() {

        return "dx : " + getX() + "\ndy : " + getY();
    }
}