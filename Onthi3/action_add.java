import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class action_add implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        ArrayList<String> list_xe_oto = new ArrayList<>();
        ArrayList<String> list_xe_tai = new ArrayList<>();
        xe_oto xe_con = new xe_oto(App.so_xe.getText(),App.hang_xe.getText(),
                                    App.nam_san_xuat.getText(),App.color.getText(),
                                    (Integer) App.so_km.getValue());

        list_xe_oto.add(String.valueOf(xe_con));
        libRary.writeFile(list_xe_oto, xe_con.getcapphat(xe_con.getSo_km()));


        App.AddData.addRow(new Object[]{

                App.so_xe.getText(),App.hang_xe.getText(),
                App.nam_san_xuat.getText(),App.color.getText(),
                App.so_km.getValue(),

        });
    }
}
