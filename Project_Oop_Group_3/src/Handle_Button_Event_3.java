import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

interface METHOD3{

}
public class Handle_Button_Event_3 implements ActionListener, METHOD3 {

    private int i = 0;

    @Override
    public void actionPerformed(ActionEvent event) {

        i++;
        GUI.RESULT.setText(i + " Event 3\n");

    }
}
