import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


interface METHOD{

    int HandleArray(char[][] character, int student, int RowKey);
    int CheckResult(char[][] character, int student, int RowKey);

}
class Handle_Button_Event_1 implements ActionListener, METHOD {

    @Override
    public int HandleArray(char[][] character, int student, int RowKey) {

        int c = 0;

        for (int i = 0; i < student; i++) {

            c++;

            GUI.RESULT.setText("\ndap an cua hoc sinh " + c + " : ");

            for (int j = 0; j < RowKey; j++) {

                GUI.RESULT.setText(character[i][j] + " ");
            }
        }

        return 0;
    }

    @Override
    public int CheckResult(char[][] character, int student, int RowKey) {

        char[] key = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        int n = key.length;
        int result = 0, score = 0;


        for (int i = 0; i < student; i++) {

            for (int j = 0; j < RowKey; j++) {

                if (character[i][j] == key[j]) {

                    result++;
                }
            }

            score++;
        }

        for (int i = 0; i < student; i++) {

            GUI.RESULT.setText("Dap an : " + Arrays.toString(key)
            + "\n" + score + " hoc sinh " + "dung " + result + " dap an " + result + " diem");
        }

        if(student == 0 || RowKey == 0){

            GUI.RESULT.setText("vui long nhap vao textfield student so nguyen > 0 !");
            System.out.print("\nvui long nhap vao textfield student so nguyen > 0 !");
        }

        return 0;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        char[][] array = {

                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        };

        int student = (int) GUI.USER_INPUT_STUDENT.getValue();

        int row = (int) GUI.USER_INPUT_ROW.getValue();

        try {

            HandleArray(array, student, row);
            CheckResult(array, student, row);

        }

        catch (Exception ERROR){

            if (student > 8){

                GUI.RESULT.setText("sai roi ban phai nhap vao fieldtext student so nguyen be hon < 9");
            }

            else if(row > 10){

                GUI.RESULT.setText("sai roi ban phai nhap vao fieldtext row so nguyen be hon < 11");
            }
        }
    }
}