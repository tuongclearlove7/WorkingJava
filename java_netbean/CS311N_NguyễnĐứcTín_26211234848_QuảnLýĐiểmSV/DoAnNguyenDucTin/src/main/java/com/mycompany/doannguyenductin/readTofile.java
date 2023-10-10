/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.doannguyenductin;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
/**
 *
 * @author clearlove7
 */
public class readTofile extends JFrame implements ActionListener{
    DefaultListModel<String> listModel;
    private JList jList;

    @Override
    public void actionPerformed(ActionEvent e) {

        try {

            File file = new File(App.PATH_TXT);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            StringBuffer sb = new StringBuffer();
            String line;

            while((line = br.readLine()) != null) {

                sb.append(line);
                sb.append("\n");
            }

            fr.close();
            System.out.println("Show data!!!");
            //System.out.println(sb.toString());
            if(sb.toString().equals("")){
                App.ShowData.setText("chưa có dữ liệu");
            }
            App.ShowData.setText(sb.toString());

            }

        catch (Exception err) {

            App.ShowData.setText("chưa có dữ liệu");
        }
    }
}
