package com.example.final_exam;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.final_exam.Fragment.Home;
import com.example.final_exam.Fragment.Browse;
import com.example.final_exam.databinding.ItemTitleBinding;

import java.util.List;

public class TitleAdapter extends RecyclerView.Adapter<TitleAdapter.TitleViewHolder>{
    Context context;
    List<Title> titleList;
    ItemTitleBinding binding;
    @NonNull
    @Override
    public TitleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemTitleBinding.inflate(LayoutInflater.from(context), parent, false);
        return new TitleViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull TitleViewHolder holder, int position) {
        Title title = titleList.get(position);
        if(title == null){
            return;
        }
        holder.titleLabel.setText(title.getTitleLabel());
        holder.titleDescription.setText(title.getTitleDescription());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class TitleViewHolder extends RecyclerView.ViewHolder {
        TextView titleLabel, titleDescription;
        RecyclerView titleRcv;
        public TitleViewHolder(@NonNull View itemView) {
            super(itemView);
            titleDescription = (TextView) itemView.findViewById(R.id.titleDescription);
            titleLabel = (TextView) itemView.findViewById(R.id.titleLabel);
            titleRcv = (RecyclerView) itemView.findViewById(R.id.titleRcv);
        }
    }
}
