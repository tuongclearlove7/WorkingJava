import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.Security;

interface Clean_METHOD{

     void CleanFunc();

}
public class Handle_Button_EventClean extends Handle_Button_Event_1 implements ActionListener, Clean_METHOD {

    @Override
    public void actionPerformed(ActionEvent event) {

        CleanFunc();

    }

    @Override
    public void CleanFunc(){

        String clean = "";

        System.out.println("Clean !!!");
        GUI.RESULT.setText(clean);
        GUI.LINE.setText(clean);
        GUI.USER_INPUT_STUDENT.setText(clean);
        GUI.USER_INPUT_COLUMN.setText(clean);
        GUI.USER_INPUT_STR.setText(clean);
        GUI.USER_INPUT_PRIME.setText(clean);
        GUI.USER_INPUT_PRACTICE14.setText(clean);
        GUI.USER_INPUT_PRACTICE15.setText(clean);
    }
}
