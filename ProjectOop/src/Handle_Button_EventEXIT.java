import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Handle_Button_EventEXIT implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.print("EXIT APP!!!");
        System.exit(0);

    }
}
