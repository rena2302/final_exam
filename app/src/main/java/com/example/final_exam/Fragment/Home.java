package com.example.final_exam.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.final_exam.Item;
import com.example.final_exam.R;
import com.example.final_exam.Title;
import com.example.final_exam.TitleAdapter;

import java.util.ArrayList;
import java.util.List;

public class Home extends Fragment {
    View view;
    List<Title> titleList;
    List<Item> itemList;
    String userName;
    TextView txt_hi;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home, container, false);
        userName=this.getArguments().getString("userName");
        txt_hi=view.findViewById(R.id.txt_Hi);
        txt_hi.setText("Hi, "+userName);
        addList();
        setContentRcv();
        return view;
    }
    private void addList(){
        itemList = new ArrayList<>();
        itemList.add(new Item(R.drawable.album1,"Title", "Description", "Playlist 1","Artist Name"));
        itemList.add(new Item(R.drawable.album2,"Title", "Description", "Playlist 2","Artist Name"));
        itemList.add(new Item(R.drawable.album3,"Title", "Description", "Playlist 3","Artist Name"));
        itemList.add(new Item(R.drawable.album4,"Title", "Description", "Playlist 4","Artist Name"));
        itemList.add(new Item(R.drawable.album5,"Title", "Description", "Playlist 5","Artist Name"));

        titleList = new ArrayList<>();
        titleList.add(new Title("Title", "Subheading about this section", itemList));
        titleList.add(new Title("Title", "Subheading about this section", itemList));
        titleList.add(new Title("Title", "Subheading about this section", itemList));
    }
    private void setContentRcv(){
        RecyclerView rcv = (RecyclerView) view.findViewById(R.id.homeRcv);
        TitleAdapter titleAdapter = new TitleAdapter(getContext(),titleList);
        rcv.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        rcv.setAdapter(titleAdapter);
    }
}