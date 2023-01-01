import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * Đọc File
 *
 * */

public class ACTION1 extends List_Receipt_HoaDon implements ActionListener {
    private int I = 0;

    @Override
    public void actionPerformed(ActionEvent e) {

        I++;

        App.outline.setText(I + " ");
        App.outline.setText(libRary.readFile(App.path));

        System.out.println("Show data!!!");

    }
}

