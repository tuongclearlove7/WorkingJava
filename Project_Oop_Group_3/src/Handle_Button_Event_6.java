import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

interface METHOD6{

}

public class Handle_Button_Event_6 implements ActionListener,METHOD6 {

    private int i = 0;

    @Override
    public void actionPerformed(ActionEvent event) {

        String[] arr = {"tuong","khanh","gioi","thanh","dai"};
        
        i++;

        for (int j = 0; j < arr.length; j++){

            GUI.RESULT.setText(i +" List = " + Arrays.toString(arr));
        }
    }
}
