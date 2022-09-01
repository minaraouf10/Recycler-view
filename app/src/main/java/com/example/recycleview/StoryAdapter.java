package com.example.recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StoryAdapter  extends RecyclerView.Adapter <StoryAdapter.StoryItemViewHolder> {
    List<StoryItem> listItems;

    public StoryAdapter(List<StoryItem> listItems) {
        this.listItems = listItems;
    }

    @NonNull
    @Override
    public StoryItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_story,parent,false);
        return new StoryItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StoryItemViewHolder holder, int position) {
    StoryItem itemStory = listItems.get(position);

    holder.storyName.setText(itemStory.getStoryName());
    holder.storyId.setImageResource(itemStory.getStoryId());
    holder.storyIcon.setImageResource(itemStory.getStoryIcon());
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public class StoryItemViewHolder extends RecyclerView.ViewHolder {
        TextView storyName;
        ImageView storyIcon;
        ImageView storyId;
        public StoryItemViewHolder(@NonNull View itemView) {
            super(itemView);
            storyName = itemView.findViewById(R.id.story_name);
            storyIcon = itemView.findViewById(R.id.icon_story);
            storyId = itemView.findViewById(R.id.story);
        }
    }
}
