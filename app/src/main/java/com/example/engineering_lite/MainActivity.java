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

    }
    public void Onregister(View view){
        Toast.makeText(MainActivity.this, "Thankyou", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this,branch.class);
        startActivity(intent);

    }
}