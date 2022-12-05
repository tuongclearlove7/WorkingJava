import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

interface METHOD4{

}

public class Handle_Button_Event_4 implements ActionListener,METHOD4 {

    private int i = 0;

    @Override
    public void actionPerformed(ActionEvent event) {

        int n = (int) GUI.USER_INPUT_PRIME.getValue();
        SuperPrimeNumber(n);

    }

    private static boolean CheckPrimeNumber(int n) {

        GUI.RESULT.setText(""+ n);

        return true;
    }

    private static void SuperPrimeNumber(int n) {

        CheckPrimeNumber(n);

    }
}
