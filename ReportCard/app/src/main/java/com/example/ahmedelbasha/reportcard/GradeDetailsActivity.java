package com.example.ahmedelbasha.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class GradeDetailsActivity extends AppCompatActivity {

    private  ArrayList<ReportCard> mReportCards;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade_details);
    }

    public void receiveData(ArrayList<ReportCard> reportCards) {
        mReportCards = reportCards;
    }
}
