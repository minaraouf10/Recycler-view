package com.example.recycleview;

public class StoryItem {
    int storyId ;
    int storyIcon ;
    String storyName ;



    public StoryItem(int storyId, String storyName, int storyIcon) {
        this.storyId = storyId;
        this.storyName = storyName;
        this.storyIcon = storyIcon;
    }

    public int getStoryId() {
        return storyId;
    }

    public void setStoryId(int storyId) {
        this.storyId = storyId;
    }

    public String getStoryName() {
        return storyName;
    }

    public void setStoryName(String storyName) {
        this.storyName = storyName;
    }

    public int getStoryIcon() {
        return storyIcon;
    }

    public void setStoryIcon(int storyIcon) {
        this.storyIcon = storyIcon;
    }
}
