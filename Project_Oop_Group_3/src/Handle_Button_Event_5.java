import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

interface METHOD5{

}

public class Handle_Button_Event_5 implements ActionListener,METHOD5 {

    private int i = 0;

    @Override
    public void actionPerformed(ActionEvent event) {

        i++;
        GUI.RESULT.setText(i + " Event 5\n");

    }
}
