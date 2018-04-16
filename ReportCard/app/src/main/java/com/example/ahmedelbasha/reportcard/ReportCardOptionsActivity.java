package com.example.ahmedelbasha.reportcard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class ReportCardOptionsActivity extends AppCompatActivity {
    ArrayList<ReportCard> mReportCards;
    ReportCard mCurrentReportCard = new ReportCard();
    int mCurrentReportCardPosition = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_card_options);

        TextView studentNameTextView = findViewById(R.id.student_name_text_view);
        studentNameTextView.setText(mCurrentReportCard.getmStudentName());

        TextView studentClassTextView = findViewById(R.id.student_class_text_view);
        studentClassTextView.setText(mCurrentReportCard.getmStudentClass());

        RelativeLayout editReportCardButton = findViewById(R.id.edit_report_card_button);

        editReportCardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent navigateToModifyStudentGradeActivityIntent = new Intent(ReportCardOptionsActivity.this,
                                                                               ModifyStudentGradeActivity.class);
                ModifyStudentGradeActivity modifyStudentGradeActivity = new ModifyStudentGradeActivity();
                modifyStudentGradeActivity.receiveData(mReportCards, mCurrentReportCard, mCurrentReportCardPosition);
                startActivity(navigateToModifyStudentGradeActivityIntent);
            }
        });

        RelativeLayout deleteReportCardButton = findViewById(R.id.delete_report_card_button);

        deleteReportCardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mReportCards.remove(mCurrentReportCard);
                Intent navigateToMainActivityIntent = new Intent(ReportCardOptionsActivity.this,
                        MainActivity.class);
                MainActivity mainActivity = new MainActivity();
                mainActivity.receiveData(mReportCards);
                startActivity(navigateToMainActivityIntent);
            }
        });

        RelativeLayout showReportCardButton = findViewById(R.id.show_report_card_button);

        showReportCardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent navigateToGradeDetailsActivityIntent = new Intent(ReportCardOptionsActivity.this,
                        GradeDetailsActivity.class);
                GradeDetailsActivity gradeDetailsActivity = new GradeDetailsActivity();
                gradeDetailsActivity.receiveData(mCurrentReportCard);
                startActivity(navigateToGradeDetailsActivityIntent);
            }
        });
    }

    public  void receiveData(ArrayList<ReportCard> reportCards, ReportCard currentReportCard, int currentReportCardPosition) {
        mReportCards = reportCards;
        mCurrentReportCard = currentReportCard;
        mCurrentReportCardPosition = currentReportCardPosition;
    }
}
