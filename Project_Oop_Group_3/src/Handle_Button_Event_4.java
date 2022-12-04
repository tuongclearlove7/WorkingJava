import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

interface METHOD4{

}

public class Handle_Button_Event_4 implements ActionListener,METHOD4 {

    private int i = 0;

    @Override
    public void actionPerformed(ActionEvent event) {

        i++;
        GUI.RESULT.setText(i + " Event 4\n");

    }
}
