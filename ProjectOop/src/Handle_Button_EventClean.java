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

        Security();
    }

    private static void Security(){

        System.out.println("Clean !!!");
        GUI.RESULT.setText(" ");
        GUI.USER_INPUT_STUDENT.setText(" ");
        GUI.USER_INPUT_ROW.setText(" ");
        GUI.USER_INPUT_STR.setText(" ");
        GUI.USER_INPUT_PRIME.setText(" ");
        GUI.USER_INPUT_PRACTICE14.setText(" ");
        GUI.USER_INPUT_PRACTICE15.setText(" ");

    }
}
