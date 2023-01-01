import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class action_readfile implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        App.outline.setText(libRary.readFile(App.path));

        System.out.println("Show data!!!");
    }
}
