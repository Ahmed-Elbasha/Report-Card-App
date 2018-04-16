package com.example.ahmedelbasha.reportcard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class ModifyStudentGradeActivity extends AppCompatActivity {

    private  ArrayList<ReportCard> mReportCards = new ArrayList<ReportCard>();
    ReportCard mCurrentReportCard = new ReportCard();
    int mCurrentReportCardPosition = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);

        // References to EditText Views in the layout
        EditText studentNameUserInput = findViewById(R.id.student_name_user_input);
        EditText studentClassUserInput = findViewById(R.id.student_class_user_input);
        EditText englishGradeUserInput = findViewById(R.id.english_grade_user_input);
        EditText mathGradeUserInput = findViewById(R.id.math_grade_user_input);
        EditText historyGradeUserInput = findViewById(R.id.history_grade_user_input);
        EditText biologyGradeUserInput = findViewById(R.id.biology_grade_user_input);
        EditText computerScienceGradeUserInput = findViewById(R.id.computer_science_grade_user_input);
        EditText finalGradeUserInput = findViewById(R.id.final_grade_user_input);

        // get current EditText value from current ReportCard instance.
        studentNameUserInput.setText(mCurrentReportCard.getmStudentName());
        studentClassUserInput.setText(mCurrentReportCard.getmStudentClass());
        englishGradeUserInput.setText(mCurrentReportCard.getmEnglishGrade());
        mathGradeUserInput.setText(mCurrentReportCard.getmMathGrade());
        historyGradeUserInput.setText(mCurrentReportCard.getmHistoryGrade());
        biologyGradeUserInput.setText(mCurrentReportCard.getmBiologyGrade());
        computerScienceGradeUserInput.setText(mCurrentReportCard.getmComputerScienceGrade());
        finalGradeUserInput.setText(mCurrentReportCard.getmFinalGrade());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.add_modify_student_grade_activities_menu, menu);
        MenuItem commitEditMenuItem = menu.findItem(R.id.save_action);
        commitEditMenuItem.getActionView();
        commitEditMenuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                mReportCards.set(mCurrentReportCardPosition, mCurrentReportCard);
                MainActivity mainActivity = new MainActivity();
                mainActivity.receiveData(mReportCards);
                Intent navigateBackToMainActivityintent = new Intent(ModifyStudentGradeActivity.this, MainActivity.class);
                startActivity(navigateBackToMainActivityintent);
                return true;
            }
        });

        MenuItem cancelEditMenuItem = menu.findItem(R.id.cancel_action);
        cancelEditMenuItem.getActionView();
        cancelEditMenuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Intent navigateBackToMainActivityintent = new Intent(ModifyStudentGradeActivity.this, MainActivity.class);
                startActivity(navigateBackToMainActivityintent);
                return true;
            }
    });
        return  true;
    }

    public  void receiveData(ArrayList<ReportCard> reportCards, ReportCard currentReportCard, int currentReportCardPosition) {
        mReportCards = reportCards;
        mCurrentReportCard = currentReportCard;
        mCurrentReportCardPosition = currentReportCardPosition;
    }
}
