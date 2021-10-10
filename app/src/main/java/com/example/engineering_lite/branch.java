package com.example.engineering_lite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class branch extends AppCompatActivity {
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branch);
        TextView textview = findViewById(R.id.textView3);
        Button mechbtn = findViewById(R.id.button3);
        Button elebtn = findViewById(R.id.button4);
        Button ITbtn = findViewById(R.id.button5);
        Button extcbtn = findViewById(R.id.button6);
        Button chembtn = findViewById(R.id.button7);
    }

    public void Onmech(View view) {
        Intent intent = new Intent(branch.this, mech.class);
        startActivity(intent);
    }

    public void Onelec(View view) {
        Intent intent = new Intent(branch.this, elec.class);
        startActivity(intent);
    }

    public void OnIT(View view) {
        Intent intent = new Intent(branch.this, IT.class);
        startActivity(intent);

    }
    public void Onextc(View view){
        Intent intent = new Intent(branch.this, extc.class);
        startActivity(intent);
    }
    public void Onchem(View view){
        Intent intent = new Intent(branch.this, chem.class);
        startActivity(intent);
    }

}
