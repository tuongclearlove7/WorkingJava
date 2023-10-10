/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.doannguyenductin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author clearlove7
 */
public class add implements ActionListener{
     public add(App application){

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        App.AddData.addRow(new Object[]{

                App.ID.getText(), App.FIRSTNAME.getText(), App.LASTNAME.getText(),
               
                App.BIRTHDAY.getText(), App.HomeWorkScore.getValue(), App.DiscussionScore.getValue(),
               
                App.FrequentScore.getValue(), App.FinalScore.getValue(), App.MediumScore.getText(),

        });
    }
}
