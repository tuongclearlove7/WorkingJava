import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Handle_Button_Event_Check implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {


        int HomeWorkScore_X = (int) App.HomeWorkScore.getValue();
        int DiscussionScore_X = (int) App.DiscussionScore.getValue();
        int FrequentScore_X = (int) App.FrequentScore.getValue();
        int FinalScore_X = (int) App.FinalScore.getValue();
        int value_X = (HomeWorkScore_X + DiscussionScore_X + FrequentScore_X + FinalScore_X) / 4;

        App.Check_MediumScore.setValue(value_X);
        App.MediumScore.setText(String.valueOf(value_X));

        if( HomeWorkScore_X < 0 || DiscussionScore_X < 0 || FrequentScore_X < 0 || FinalScore_X < 0){

            App.MediumScore.setText("vui long nhap diem lon hoac = 0");
            App.Check_MediumScore.setText("vui long nhap diem lon hoac = 0");
        }
    }
}
