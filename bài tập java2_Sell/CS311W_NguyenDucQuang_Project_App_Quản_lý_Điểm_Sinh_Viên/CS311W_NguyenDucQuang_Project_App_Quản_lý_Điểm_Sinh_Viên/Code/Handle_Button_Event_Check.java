import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Handle_Button_Event_Check implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {


        double HomeWorkScore_X = (int) App.HomeWorkScore.getValue();
        double DiscussionScore_X = (int) App.DiscussionScore.getValue();
        double FrequentScore_X = (int) App.FrequentScore.getValue();
        double FinalScore_X = (int) App.FinalScore.getValue();
        double value_X = (HomeWorkScore_X + DiscussionScore_X + FrequentScore_X + FinalScore_X) / 4;

        App.Check_MediumScore.setValue(value_X);
        App.MediumScore.setText(String.valueOf(value_X));

        if( HomeWorkScore_X < 0 || DiscussionScore_X < 0 || FrequentScore_X < 0 || FinalScore_X < 0){

            App.MediumScore.setText("vui long nhap diem lon hoac = 0");
            App.Check_MediumScore.setText("vui long nhap diem lon hoac = 0");
        }

        else if ( HomeWorkScore_X > 10 || DiscussionScore_X > 10 || FrequentScore_X > 10 || FinalScore_X > 10) {

            App.MediumScore.setText("vui long nhap diem be hon < 10");
            App.Check_MediumScore.setText("vui long nhap diem be hon < 10");

        }
    }
}
