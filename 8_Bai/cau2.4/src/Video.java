import java.util.ArrayList;

public class Video extends Media{
    private String Runtime;
    private double PriceVideo;

    public Video(String Runtime, double PriceVideo, String NameMedia, double PriceMedia) {


        super(NameMedia, PriceMedia);
        this.Runtime = Runtime;
        this.PriceVideo = PriceVideo;
    }

    public Video(String Runtime, double PriceVideo) {

        this.Runtime = Runtime;
        this.PriceVideo = PriceVideo;
    }

    public Video() {

    }

    public String getRunTime() {


        return Runtime;
    }

    public void setRunTime(String runTime) {


        this.Runtime = runTime;
    }

    public double getPriceVideo() {

        return PriceVideo;
    }

    public void setPriceVideo(double PriceVideo) {

        this.PriceVideo = PriceVideo;
    }
    
    public Video InputVideo(){


        System.out.println("thoi gian chay : ");
        Runtime = input.nextLine();

        System.out.println("gia video : ");
        PriceVideo = input.nextDouble();

        return null;
    }
    public Video OutputVideo(){

        System.out.println("thoi gian chay : " + getRunTime());
        System.out.println("gia video : " + getPriceVideo() + " USD");

        return null;
    }


    @Override
    public String toString() {

        return super.toString() + "\n\t\truntime : " + Runtime + "\n\t\tPriceVideo : " + PriceVideo;
    }
}
