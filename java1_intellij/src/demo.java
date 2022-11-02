import java.util.Scanner;
class demo{
    private int x0 , y0 ;
    private double modul ;
    Scanner input = new Scanner(System.in);
    public void nhapToaDo(Scanner input){
        x0 = input.nextInt();
        y0 = input.nextInt();

    }
    public demo(){

        x0 = y0 = 0;
    }
    public void setX0callback(int x){

        x0 = x ;
    }
    public void setY0callback(int y){

        y0 = y ;
    }
    public int getX0(){

        return x0 ;
    }
    public int getY0(){

        return y0 ;
    }
    @Override
    public  String toString() {

        return x0 + " " + y0 ;
    }

    public demo Modul(){
        demo n = new demo();
        n.modul = Math.sqrt(Math.pow(x0,2)+ Math.pow(y0, 2));
        return n ;
    }
    public double Module(){
        double modul = Math.sqrt(Math.pow(x0,2) + Math.pow(y0,2));
        return modul;
    }
    public double MyInstance(demo b){
        double instance = Math.sqrt((b.x0 - x0) * (b.x0 - x0) + (b.y0 - y0) * (b.y0 - y0));
        return instance;
    }
}

















