import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Handle_Button_Event_ADD implements ActionListener {

    public Handle_Button_Event_ADD(App application){

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
