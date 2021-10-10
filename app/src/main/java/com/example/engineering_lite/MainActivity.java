package com.example.engineering_lite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView firstname = findViewById(R.id.Firstname);
        TextView lastname = findViewById(R.id.Lastname);
        TextView branch = findViewById(R.id.branch);
        TextView email = findViewById(R.id.email);
        TextView password = findViewById(R.id.password);

    }
    public void Onregister(View view){
        Toast.makeText(MainActivity.this, "Please Enter the information", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this,branch.class);
        startActivity(intent);

    }
}