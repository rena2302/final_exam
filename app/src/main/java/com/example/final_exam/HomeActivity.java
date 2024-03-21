package com.example.final_exam;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.final_exam.Fragment.Browse;
import com.example.final_exam.Fragment.Home;
import com.example.final_exam.Fragment.Library;
import com.example.final_exam.Fragment.Radio;
import com.example.final_exam.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {

    ActivityHomeBinding homeBinding;
    TextView viewUserName;
    String userName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        homeBinding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(homeBinding.getRoot());
        userName=getIntent().getStringExtra("userName");
        addFragment(new Home());
        focusFragment();
    }

    private void focusFragment(){
        homeBinding.navBottom.setOnItemSelectedListener(item -> {
            if(item.getItemId()==R.id.home);
            {
                addFragment(new Home());
            }
            if(item.getItemId()==R.id.search)
                addFragment(new Browse());
            else if (item.getItemId()==R.id.radio) {
                addFragment(new Radio());
            } else if (item.getItemId()==R.id.library) {
                addFragment(new Library());
            }
            return  true;
        });
    }
    private void addFragment(Fragment fragment) {
        Bundle bundle = new Bundle();
        bundle.putString("userName",userName);
        fragment.setArguments(bundle);
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ftc = fm.beginTransaction();
        ftc.replace(R.id.FrameLayout, fragment);
        ftc.addToBackStack(fragment.getClass().getSimpleName());
        ftc.commit();
    }
}