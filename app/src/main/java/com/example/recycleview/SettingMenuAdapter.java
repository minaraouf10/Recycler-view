package com.example.recycleview;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SettingMenuAdapter extends
        RecyclerView.Adapter<SettingMenuAdapter.SettingItemViewHolder> {

    List<SettingItem> items;

    public SettingMenuAdapter(List<SettingItem> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public SettingItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_setting_menu,parent,false);
        return new SettingItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SettingItemViewHolder holder, int position) {
        SettingItem item = items.get(position);

        holder.title.setText(item.getTitle());
        holder.subTitle.setText(item.getSubTitle());
        holder.icon.setImageResource(item.getImageId());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class SettingItemViewHolder extends RecyclerView.ViewHolder  {
        TextView title ;
        TextView subTitle;
        ImageView icon;
        public SettingItemViewHolder(@NonNull View itemView) {
            super(itemView);
            title =itemView.findViewById(R.id.title);
            subTitle =itemView.findViewById(R.id.sub_title);
            icon =itemView.findViewById(R.id.image);
        }
    }

}
