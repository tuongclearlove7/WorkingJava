import java.util.ArrayList;

public class QLPTGT {

    public static void main(String[] args) {

        ArrayList<String> list_oto = new ArrayList<>();
        ArrayList<String> list_xetai = new ArrayList<>();

        xe_oto xe_con = new xe_oto("47A","Mercedes","2023","black",100);
        xe_tai xe_lon = new xe_tai("47B","Hyundai","2023","blue",200);

        list_oto.add(String.valueOf(xe_con));
        list_xetai.add(String.valueOf(xe_lon));

        xe_con.OutputMylist(list_oto);
        xe_lon.OutputMylist(list_xetai);

        System.out.println(xe_con.getcapphat(xe_con.getSo_km()));
        System.out.println(xe_lon.getcapphat(xe_lon.getSo_km()));

        libRary.writeFile(list_oto, xe_con.getcapphat(xe_con.getSo_km()));
        libRary.writeFile(list_xetai, xe_lon.getcapphat(xe_lon.getSo_km()));

    }
}
