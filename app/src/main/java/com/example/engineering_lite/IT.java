package com.example.engineering_lite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class IT extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it);

    }
    public void OnFE(View view){
        openWebURL("https://drive.google.com/drive/folders/1V08BFM-TcSujrc-VJMmG3Yq1iBk951eW?usp=sharing");
    }
    public void OnSE(View view){
        openWebURL("");
    }
    public void OnTE(View view){
        openWebURL("");
    }
    public void OnBE(View view){
        openWebURL("");
    }
    public void openWebURL( String inURL )
    { Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse( inURL ) );
        startActivity( browse );
    }

}