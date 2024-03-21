package com.example.final_exam;

import android.content.Context;
import android.content.pm.LauncherActivityInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder>{
    Context context;
    View view;
    int index;
    private List<Item> itemList;
    public ItemAdapter(Context context,List<Item> items,int index) {
        this.itemList = items;
        this.context = context;
        this.index = index;
    }
    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch (index){
            case 0:
                view = LayoutInflater.from(context).inflate(R.layout.item_rectangle, parent, false);
                break;
            case 1:
                view = LayoutInflater.from(context).inflate(R.layout.item_circle, parent, false);
                break;
            default:view = LayoutInflater.from(context).inflate(R.layout.item_rectangle, parent, false);
        }
        return new ItemViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        Item item = itemList.get(position);
        if(item == null){
            return;
        }
        if (index == 0){
            holder.itemTitle.setText(item.getItemTitle());
            holder.itemImgRe.setImageResource(item.getItemImg());
            holder.itemDescription.setText(item.getItemDescription());
            holder.itemPlaylist.setVisibility(View.INVISIBLE);
        }else if(index == 1){
            holder.itemImgCir.setImageResource(item.getItemImg());
            holder.itemArtist.setText(item.getItemArtist());
        }else {
            holder.itemTitle.setText(item.getItemTitle());
            holder.itemImgRe.setImageResource(item.getItemImg());
            holder.itemDescription.setText(item.getItemDescription());
            holder.itemPlaylist.setText(item.getItemPlaylist());
        }
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        TextView itemTitle, itemDescription, itemPlaylist, itemArtist;
        ImageView itemImgRe,itemImgCir;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            itemTitle = (TextView) itemView.findViewById(R.id.itemTitle);
            itemDescription = (TextView) itemView.findViewById(R.id.itemDescription);
            itemPlaylist = (TextView) itemView.findViewById(R.id.itemPlaylist);
            itemImgRe = (ImageView) itemView.findViewById(R.id.itemImgRe);
            itemArtist = itemView.findViewById(R.id.itemArtist);
            itemImgCir = itemView.findViewById(R.id.itemImgCir);
        }
    }
}
