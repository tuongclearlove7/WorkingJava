
import java.util.ArrayList;
import java.util.Scanner;

public class Media {

    private String NameMedia;
    

    private double PriceMedia;


    static Scanner input = new Scanner(System.in);

    public Media(String NameMedia, double PriceMedia) {

        this.NameMedia = NameMedia;
        this.PriceMedia = PriceMedia;
    }

    public Media() {

    }



    public String getNameMedia() {


        return NameMedia;
    }

    public void setNameMedia(String NameMedia) {


            this.NameMedia = NameMedia;
    }

    public double getPriceMedia() {


        return PriceMedia;
    }

    public void setPriceMedia(double PriceMedia) {


        this.PriceMedia = PriceMedia;
    }

    public void InputMedia() {

        System.out.println("Media name : ");
        NameMedia = input.nextLine();
        System.out.println("gia media : ");
        PriceMedia = input.nextDouble();

    }

    public void OutputMedia() {

        System.out.println("Media name : " + getNameMedia());
        System.out.println("gia media : " + getPriceMedia() + " Bilions USD");
    }

    @Override
    public String toString() {

        return "Property : NameMedia : " + NameMedia + ", PriceMedia : " + PriceMedia;
    }
}
