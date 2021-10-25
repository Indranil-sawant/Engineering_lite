package com.example.engineering_lite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class mech extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mech);
    }
    public void openWebURL( String inURL )
    { Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse( inURL ) );
        startActivity( browse );
    }
    public void OnFE(View view){
        openWebURL("https://drive.google.com/drive/folders/1JbQmlANblSqye1xrNEQsiUn8wCK7jde5?usp=sharing");
    }
    public void OnSE(View view){
        openWebURL("https://drive.google.com/drive/folders/175vkWsHb41KABsU1Ob4mI5g1x528YeeR?usp=sharing");
    }
    public void OnTE(View view){
        openWebURL("https://drive.google.com/drive/folders/1ZKBpNyV-96uTuVU124aL8lLWnfM8Lj0b?usp=sharing");
    }
    public void OnBE(View view){
        openWebURL("https://drive.google.com/drive/folders/1KuV8MCHKW0Ukb6vhNR1fl309V9IlTo-i?usp=sharing");
    }
    public void OnQP(View view){
        openWebURL("https://drive.google.com/drive/folders/1GoO8G0ks87WgP_Eeag4Hhq6V74cAE_GI?usp=sharing");
    }
}