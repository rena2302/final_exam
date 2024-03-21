package com.example.final_exam.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home, container, false);
        addList();
        setContentRcv();
        return view;
    }
    private void addList(){
        itemList = new ArrayList<>();
        itemList.add(new Item(R.drawable.pg1,"Title", "Description", "Playlist","Artist"));
        itemList.add(new Item(R.drawable.pg1,"Title", "Description", "Playlist","Artist"));
        itemList.add(new Item(R.drawable.pg1,"Title", "Description", "Playlist","Artist"));
        itemList.add(new Item(R.drawable.pg1,"Title", "Description", "Playlist","Artist"));
        itemList.add(new Item(R.drawable.pg1,"Title", "Description", "Playlist","Artist"));

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