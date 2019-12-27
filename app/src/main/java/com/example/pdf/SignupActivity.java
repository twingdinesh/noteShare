package com.example.pdf;

import androidx.appcompat.app.AppCompatActivity;
import java.util.*;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    Button signup;
    EditText fname,lname,email,password1,password2;
    Spinner spinner;
    ArrayAdapter<CharSequence> adapter;
    String collagename;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        signup=(Button)findViewById(R.id.signup);
        fname=(EditText)findViewById(R.id.fname);
        lname=(EditText)findViewById(R.id.lname);
        email=(EditText)findViewById(R.id.email);
        password1=(EditText)findViewById(R.id.password1);
        password2=(EditText)findViewById(R.id.password2);
        spinner=(Spinner)findViewById(R.id.spinner);
        adapter=ArrayAdapter.createFromResource(this,R.array.collage,R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                collagename=parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void signupclick(View view) {
        String fnamee=fname.getText().toString();
        String lnamee=lname.getText().toString();
        String emaill=email.getText().toString();
        String pass1=password1.getText().toString();
        String pass2=password2.getText().toString();


        if(fnamee.isEmpty()||lnamee.isEmpty()||emaill.isEmpty()||pass1.isEmpty()||pass2.isEmpty())
        {

            Toast.makeText(this,"fill the above content",Toast.LENGTH_SHORT).show();
        }
        else
        {
            if(pass1.equals(pass2))
                Toast.makeText(this,fnamee+"\n"+lnamee+"\n"+emaill+"\n"+pass1+"\n"+collagename,Toast.LENGTH_LONG).show();

            else
                Toast.makeText(this,"password mismatches",Toast.LENGTH_SHORT).show();
        }
    }
}
