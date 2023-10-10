import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class action_trash implements ActionListener {

    static ArrayList<String> DATA(ArrayList<String> list){

        String a = libRary.readFile("data2.txt");
        list.add(a);

        return list;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        ArrayList<String> list = new ArrayList<>();

        DATA(list);

        for (int i = 0 ; i < list.size(); i++){

            App.outline.setText(list.get(i));
        }
    }
}
