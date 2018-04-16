package com.example.ahmedelbasha.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class GradeDetailsActivity extends AppCompatActivity {

    ReportCard mCurrentReportCard = new ReportCard();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade_details);

        // References to EditText Views in the layout
        TextView studentNameTextView = findViewById(R.id.student_name_text_view);
        TextView studentClassTextView = findViewById(R.id.student_class_text_view);
        TextView englishGradeTextView = findViewById(R.id.english_grade_text_view);
        TextView mathGradeTextView = findViewById(R.id.math_grade_text_view);
        TextView historyGradeTextView = findViewById(R.id.history_grade_text_view);
        TextView biologyGradeTextView = findViewById(R.id.biology_grade_text_view);
        TextView computerScienceGradeTextView = findViewById(R.id.computer_science_grade_text_view);
        TextView finalGradeTextView = findViewById(R.id.final_grade_text_view);

        // get current EditText value from current ReportCard instance.
        studentNameTextView.setText(mCurrentReportCard.getmStudentName());
        studentClassTextView.setText(mCurrentReportCard.getmStudentClass());
        englishGradeTextView.setText(mCurrentReportCard.getmEnglishGrade());
        mathGradeTextView.setText(mCurrentReportCard.getmMathGrade());
        historyGradeTextView.setText(mCurrentReportCard.getmHistoryGrade());
        biologyGradeTextView.setText(mCurrentReportCard.getmBiologyGrade());
        computerScienceGradeTextView.setText(mCurrentReportCard.getmComputerScienceGrade());
        finalGradeTextView.setText(mCurrentReportCard.getmFinalGrade());
    }

    public void receiveData(ReportCard reportCard) {
        mCurrentReportCard = reportCard;
    }
}
