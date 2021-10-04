package com.example.el2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRegister (View view){
        TextView textFirstname = findViewById(R.id.textView2);
        TextView textLastname = findViewById(R.id.textView3);
        TextView textemail = findViewById(R.id.textView4);

        EditText edtFirstname = findViewById(R.id.editTextTextPersonName);
        EditText edtLastname= findViewById(R.id.editTextTextPersonName2);
        EditText edtemail = findViewById(R.id.editTextTextEmailAddress);

        textFirstname.setText("First name: " +edtFirstname.getText().toString());
        textLastname.setText("Last name: " +edtLastname.getText().toString());
        textemail.setText("Email: " +edtemail.getText().toString());

        Intent intent=new Intent(this,page2activity.class);
        startActivity(intent);
        finish();

    }
}