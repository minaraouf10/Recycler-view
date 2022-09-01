package com.example.recycleview;

public class SettingItem {
    String title ;
    String subTitle ;
    int imageId ;

    public SettingItem(String title, String subTitle, int imageId) {
        this.title = title;
        this.subTitle = subTitle;
        this.imageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
