package com.example.ahmedelbasha.reportcard;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class AddStudentActivity extends AppCompatActivity {

    private  ArrayList<ReportCard> mReportCards = new ArrayList<ReportCard>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);

//        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
//        actionBar.setHomeButtonEnabled(true);
//        actionBar.setDisplayHomeAsUpEnabled(true);
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

                // References to EditText Views in the layout
                EditText studentNameUserInput = findViewById(R.id.student_name_user_input);
                EditText studentClassUserInput = findViewById(R.id.student_class_user_input);
                EditText englishGradeUserInput = findViewById(R.id.english_grade_user_input);
                EditText mathGradeUserInput = findViewById(R.id.math_grade_user_input);
                EditText historyGradeUserInput = findViewById(R.id.history_grade_user_input);
                EditText biologyGradeUserInput = findViewById(R.id.biology_grade_user_input);
                EditText computerScienceGradeUserInput = findViewById(R.id.computer_science_grade_user_input);
                EditText finalGradeUserInput = findViewById(R.id.final_grade_user_input);

                // String Variables to store EditText text property value
                String studentName = studentNameUserInput.getText().toString();
                String studentClass = studentClassUserInput.getText().toString();
                String englishGrade = englishGradeUserInput.getText().toString();
                String mathGrade = mathGradeUserInput.getText().toString();
                String historyGrade = historyGradeUserInput.getText().toString();
                String biologyGrade = biologyGradeUserInput.getText().toString();
                String computerScienceGrade = computerScienceGradeUserInput.getText().toString();
                String finalGrade = finalGradeUserInput.getText().toString();

                // Add new ReportCard object to ArrayList.
                mReportCards.add(new ReportCard(studentName, studentClass, englishGrade, mathGrade, historyGrade, biologyGrade,
                                                computerScienceGrade, finalGrade));

                MainActivity mainActivity = new MainActivity();
                mainActivity.receiveData(mReportCards);

                Log.i("AddStudentActivity.java", "ReportObject created");

                Intent navigateBackToMainActivityintent = new Intent(AddStudentActivity.this, MainActivity.class);
                startActivity(navigateBackToMainActivityintent);
                return true;
            }
        });

        MenuItem cancelEditMenuItem = menu.findItem(R.id.cancel_action);
        cancelEditMenuItem.getActionView();
        cancelEditMenuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Intent navigateBackToMainActivityintent = new Intent(AddStudentActivity.this, MainActivity.class);
                startActivity(navigateBackToMainActivityintent);
                return true;
            }
        });

//        MenuItem homeMenuItem = menu.findItem(R.id.showHome);
//        homeMenuItem.getActionView();
//        homeMenuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
//            @Override
//            public boolean onMenuItemClick(MenuItem item) {
//                try {
//                    this.finalize();
//                } catch (Throwable throwable) {
//                    throwable.printStackTrace();
//                }
//                return true;
//            }
//        });
        return  true;
    }

    public void receiveData(ArrayList<ReportCard> reportCards) {
        mReportCards = reportCards;
    }
}
