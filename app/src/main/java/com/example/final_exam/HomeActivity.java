package com.example.final_exam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

public class HomeActivity extends AppCompatActivity {
    List<Title> titleList;
    List<Item> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setContentRcv();
    }
    private void setContentRcv(){
        RecyclerView rcv = (RecyclerView) findViewById(R.id.homeRcv);
        TitleAdapter titleAdapter = new TitleAdapter(this,titleList);
        rcv.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        rcv.setAdapter(titleAdapter);
    }
}