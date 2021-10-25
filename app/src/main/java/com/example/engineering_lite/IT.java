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
        openWebURL("https://drive.google.com/drive/folders/1lUCvrattjEzuKWddQTkfoDQMeQ23Gq-q?usp=sharing");
    }
    public void OnSE(View view){
        openWebURL("https://drive.google.com/drive/folders/1l1TtTbh3oDrBjlbYxfhk559yhp6JZwjP?usp=sharing");
    }
    public void OnTE(View view){
        openWebURL("https://drive.google.com/drive/folders/1cvdFKcAqdkuSvNGN_oBHuvgBWE81LHRo?usp=sharing");
    }
    public void OnBE(View view){
        openWebURL("https://drive.google.com/drive/folders/1-A_DZAstAkWhkjFAXwHwIlg17ZM88JaK?usp=sharing");
    }
    public void OnQP(View view){
        openWebURL("https://drive.google.com/drive/folders/1GoO8G0ks87WgP_Eeag4Hhq6V74cAE_GI?usp=sharing");
    }
    public void openWebURL( String inURL )
    { Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse( inURL ) );
        startActivity( browse );
    }

}