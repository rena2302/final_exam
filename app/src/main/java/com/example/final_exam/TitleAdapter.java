package com.example.final_exam;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ConcurrentModificationException;
import java.util.List;

public class TitleAdapter extends RecyclerView.Adapter<TitleAdapter.TitleViewHolder>{
    Context context;
    View view;
    List<Title> titleList;

    public TitleAdapter(Context context, List<Title> titleList) {
        this.context = context;
        this.titleList = titleList;
    }

    @NonNull
    @Override
    public TitleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        view = LayoutInflater.from(context).inflate(R.layout.item_title, parent, false);
        return new TitleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TitleViewHolder holder, int position) {
        Title title = titleList.get(position);
        if(title == null){
            return;
        }
        holder.titleLabel.setText(title.getTitleLabel());
        holder.titleDescription.setText(title.getTitleDescription());

        ItemAdapter itemAdapter = new ItemAdapter(context,title.getItemList(),position);
        holder.titleRcv.setLayoutManager(new LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false));
        holder.titleRcv.setAdapter(itemAdapter);
    }

    @Override
    public int getItemCount() {
        if(titleList != null) return titleList.size();
        return 0;
    }

    public static class TitleViewHolder extends RecyclerView.ViewHolder {
        TextView titleLabel, titleDescription;
        RecyclerView titleRcv;
        public TitleViewHolder(@NonNull View itemView) {
            super(itemView);
            titleDescription = itemView.findViewById(R.id.titleDescription);
            titleLabel = itemView.findViewById(R.id.titleLabel);
            titleRcv = itemView.findViewById(R.id.titleRcv);
        }
    }
}
