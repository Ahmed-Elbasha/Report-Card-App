package com.example.ahmedelbasha.reportcard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
                Intent navigateToAddStudentActivityIntent = new Intent(MainActivity.this, AddStudentActivity.class);
                startActivity(navigateToAddStudentActivityIntent);
                return true;
            }
        });
        return true;
    }
}
