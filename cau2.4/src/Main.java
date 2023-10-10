
import java.util.ArrayList;


public class Main {

    public static void main(String[] args){

        ArrayList<Media> listMedia = new ArrayList<>();
        ArrayList<Book> listBook = new ArrayList<>();
        ArrayList<Video> listVideo = new ArrayList<>();


        Media M = new Media("VTV",100);
        Book B = new Book(500,"Thao");
        Video V = new Video("2h",2000);

        M.OutputMedia();
        B.OuputBook();
        V.OutputVideo();

       // M.InputMedia();
      //  B.InputBook();
       // V.InputVideo();

        System.out.println("___________________________Output ArrayList Object________________________________");

        listBook.add(B);
        System.out.println(listBook.get(0));

        listVideo.add(V);
        System.out.println(listVideo.get(0));


    }
}
