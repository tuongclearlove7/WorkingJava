
import java.util.ArrayList;


public class Main {

    public static void main(String[] args){

        ArrayList<Book> listBook = new ArrayList<>();
        ArrayList<Video> listVideo = new ArrayList<>();
        ArrayList<Media> listMedia = new ArrayList<>();

        Media M = new Media("VTV",100);
        Book B = new Book(500,"Thao");
        Video V = new Video("2h",2000);

        M.OutputMedia();
        B.OuputBook();
        V.OutputVideo();

        Media M1 = new Media();
        Book B1 = new Book();
        Video V1 = new Video();


        M1.InputMedia();
        B1.InputBook();
        V1.InputVideo();

        M1.OutputMedia();
        B1.OuputBook();
        V1.OutputVideo();

        System.out.println("___________________________Output Array Object________________________________");
        Book[] BookArray = {B1};
        System.out.println("Book ArrayObject : {\n" + BookArray[0] + "\n}");

        Video[] VideoArray = {V1};
        System.out.println("Video ArrayObject : {\n" + VideoArray[0] + "\n}");



        
    }
}
