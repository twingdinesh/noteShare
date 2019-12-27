package com.example.pdf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class teacherlogin extends AppCompatActivity {

    Button signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacherlogin);
        signup=(Button)findViewById(R.id.signup);
    }

    public void signupclick(View view) {
        Intent intent=new Intent(teacherlogin.this,SignupActivity.class);
        startActivity(intent);
    }

    public void loginclick(View view) {
        Intent intent=new Intent(this,insidelogin.class);
        startActivity(intent);
    }
}
