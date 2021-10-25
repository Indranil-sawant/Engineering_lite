package com.example.engineering_lite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class extc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extc);
    }
    public void openWebURL( String inURL )
    { Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse( inURL ) );
        startActivity( browse );
    }
    public void OnFE(View view){
        openWebURL("https://drive.google.com/drive/folders/1lUCvrattjEzuKWddQTkfoDQMeQ23Gq-q?usp=sharing");
    }
    public void OnSE(View view){
        openWebURL("https://drive.google.com/drive/folders/15-zeUII5wSIyRMICECUIKogS7T8z7tDQ?usp=sharing");
    }
    public void OnTE(View view){
        openWebURL("https://drive.google.com/drive/folders/10GSO8Pi4L8l1_bxKuQ0YG6E-2i1lJ176?usp=sharing");
    }
    public void OnBE(View view){
        openWebURL("https://drive.google.com/drive/folders/1pvbj5Bn7_oxufSoHLzpzDX6tyiOH3DEz?usp=sharing");
    }
    public void OnQP(View view){
        openWebURL("https://drive.google.com/drive/folders/1GoO8G0ks87WgP_Eeag4Hhq6V74cAE_GI?usp=sharing");
    }
}