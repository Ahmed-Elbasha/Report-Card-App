package com.example.ahmedelbasha.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class ModifyStudentGradeActivity extends AppCompatActivity {

    ArrayList<ReportCard> mReportCards;
    ReportCard mCurrentReportCards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modify_student_grade);
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
                String message = "Commit Edit Action is clicked";
                Toast testToast = Toast.makeText(ModifyStudentGradeActivity.this, message, Toast.LENGTH_SHORT);
                testToast.show();
                return true;
            }
        });

        MenuItem cancelEditMenuItem = menu.findItem(R.id.cancel_action);
        cancelEditMenuItem.getActionView();
        cancelEditMenuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                String message = "Cancel Edit Action is clicked";
                Toast testToast = Toast.makeText(ModifyStudentGradeActivity.this, message, Toast.LENGTH_SHORT);
                testToast.show();
                return true;
            }
    });
        return  true;
    }

    public  void receiveData(ArrayList<ReportCard> reportCards, ReportCard currentReportCard) {
        mReportCards = reportCards;
        mCurrentReportCards = currentReportCard;
    }
}
