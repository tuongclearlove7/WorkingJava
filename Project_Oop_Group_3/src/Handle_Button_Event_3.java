import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

interface METHOD3{

}
public class Handle_Button_Event_3 implements ActionListener, METHOD3 {

    private int i = 0;

    @Override
    public void actionPerformed(ActionEvent event) {

        String str = GUI.USER_INPUT_STR.getText();
        String[] str1 = new String[str.length()];
        Encode_String(str,str1);

    }

    private static void Encode_String(String str, String[] str1){

        int b;
        int h = 0;
        char g;

        for (int i = 0; i < str.length(); i++) {

            b = str.charAt(i);

            if (b >= 'a' && b <= 'z') {
                b = b - 97;
                b = b + 5;
                b = b % 26;
                b = b + 97;
                g = (char) (b - 32);
                str1[i] = g + "";
                h++;
            }

            else if (b >= 'A' && b <= 'Z') {

                b = b - 65;
                b = b + 5;
                b = b % 26;
                b = b + 65;
                g = (char) b;
                str1[i] = g + "";
                h++;

            }

            else if (b == -65) {

                str1[i] = " ";
                h++;
            }
        }

        for (int j = 0; j < h; j++) {

            GUI.RESULT.setText("Chuoi sau khi ma hoa la :\n" + Arrays.toString(str1));
            System.out.println("Chuoi sau khi ma hoa la : " + Arrays.toString(str1));

            break;
        }
    }
}
