package com.example.el2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.github.barteksc.pdfviewer.PDFView;

import java.util.ArrayList;

public class Infotech extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infotech);
        listView = findViewById(R.id.listview);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Artificial inteligence (only book the user can access for now");
        arrayList.add("Data mining");
        arrayList.add("Network security");
        arrayList.add("cybersecurity");
        arrayList.add("Logic design");

        ArrayAdapter arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);



    }
}