package com.example.ahmedelbasha.reportcard;

import android.app.LauncherActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ReportCard> mReportCards = new ArrayList<ReportCard>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       StudentGradeReportCardAdapter studentGradeReportCardAdapter = new StudentGradeReportCardAdapter(this, mReportCards);
        ListView listView = findViewById(R.id.list);

        listView.setAdapter(studentGradeReportCardAdapter);

        RelativeLayout noStudentGradeMessage = findViewById(R.id.no_student_grade_message_container);

        if (mReportCards.size() == 0) {
            noStudentGradeMessage.setVisibility(View.VISIBLE);
        } else {
            noStudentGradeMessage.setVisibility(View.GONE);
        }

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ReportCard currentReportCard = mReportCards.get(position);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_activity_menu, menu);

        MenuItem addNewStudentGradeMenuItem = menu.findItem(R.id.create_student_action);
        addNewStudentGradeMenuItem.getActionView();
        addNewStudentGradeMenuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                AddStudentActivity addStudentActivity = new AddStudentActivity();
                addStudentActivity.receiveData(mReportCards);
                Intent navigateToAddStudentActivityIntent = new Intent(MainActivity.this, AddStudentActivity.class);
                startActivity(navigateToAddStudentActivityIntent);
                return true;
            }
        });
        return true;
    }

    public void receiveData(ArrayList<ReportCard> reportCards) {
        mReportCards = reportCards;
    }

}
