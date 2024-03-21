package com.example.final_exam;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder>{
    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }
    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        TextView itemTitle, itemDescription, itemPlaylist, itemArtist;
        ImageView itemImgRe, itemImgCir;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            itemTitle = (TextView) itemView.findViewById(R.id.itemTitle);
            itemDescription = (TextView) itemView.findViewById(R.id.itemDescription);
            itemPlaylist = (TextView) itemView.findViewById(R.id.itemPlaylist);
            itemArtist = (TextView) itemView.findViewById(R.id.itemArtist);
            itemImgRe = (ImageView) itemView.findViewById(R.id.itemImgRe);
            itemImgCir = (ImageView) itemView.findViewById(R.id.itemImgCir);
        }
    }
}
