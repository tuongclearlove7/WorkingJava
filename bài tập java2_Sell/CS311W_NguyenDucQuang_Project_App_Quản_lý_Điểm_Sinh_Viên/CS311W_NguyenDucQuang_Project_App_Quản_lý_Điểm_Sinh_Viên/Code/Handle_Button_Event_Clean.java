import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Handle_Button_Event_Clean implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println("Clean text !!!");

        App.ID.setText("");
        App.FIRSTNAME.setText("");
        App.LASTNAME.setText("");
        App.BIRTHDAY.setText("");
        App.HomeWorkScore.setText("");
        App.DiscussionScore.setText("");
        App.FrequentScore.setText("");
        App.FinalScore.setText("");
        App.MediumScore.setText("");
        App.ShowData.setText("");

    }
}
