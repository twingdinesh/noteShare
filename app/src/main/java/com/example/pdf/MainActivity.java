package com.example.pdf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button student,teacher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        student=(Button)findViewById(R.id.studButton);
        teacher=(Button)findViewById(R.id.teacherButton);
    }

    public void teachact(View view) {
        Intent intent=new Intent(this,teacherlogin.class);
        startActivity(intent);
    }
}
