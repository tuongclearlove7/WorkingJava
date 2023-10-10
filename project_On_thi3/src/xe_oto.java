import java.util.ArrayList;

public class xe_oto extends xe{


    public xe_oto(String so_xe,String hang_xe, String nam_san_xuat, String color, int so_km) {

        super(so_xe,hang_xe, nam_san_xuat, color, so_km);
    }

    public xe_oto() {

    }


    public void OutputMylist(ArrayList<String> list) {

        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));
        }
    }

    @Override
    public String getcapphat(int km) {

        if(km > 50) {

            return "xe oto giam 0.15 lit xang";
        }

        return "";
    }
}
