package com.example.ahmedelbasha.reportcard;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class StudentGradeReportCardAdapter extends ArrayAdapter<ReportCard> {

    public StudentGradeReportCardAdapter(@NonNull Context context, @NonNull ArrayList<ReportCard> reportCards) {
        super(context, 0, reportCards);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        final ReportCard currentReportCard = getItem(position);

        LinearLayout textContainer =  listItemView.findViewById(R.id.quick_details_container);

        TextView studentNameTextView = textContainer.findViewById(R.id.name_text_view);
        studentNameTextView.setText(currentReportCard.getmStudentName());

        TextView studentClassTextView = textContainer.findViewById(R.id.class_text_view);
        studentClassTextView.setText(currentReportCard.getmStudentClass());

//        LinearLayout buttonContainer = listItemView.findViewById(R.id.button_container);
//
//        ImageButton editButton = buttonContainer.findViewById(R.id.edit_button);
//
//        editButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                MainActivity mainActivity = new MainActivity();
//                ModifyStudentGradeActivity modifyStudentGradeActivity = new ModifyStudentGradeActivity();
//
//                modifyStudentGradeActivity.receiveData(mainActivity.reportCards, currentReportCard);
//
//                Intent navigateToModifyStudentGradeActivity = new Intent(MainActivity.this, ModifyStudentGradeActivity.class);
//                mainActivity.startActivity(navigateToModifyStudentGradeActivity);
//            }
//        });

        return listItemView;
    }
}
