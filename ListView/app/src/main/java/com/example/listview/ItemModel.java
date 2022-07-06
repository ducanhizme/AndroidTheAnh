package com.example.listview;

public class ItemModel {
    public String name;
    public String describe;
    public int avatar;
    public int clbImage;

    public ItemModel(String name, String describe, int avatar, int clbImage) {
        this.name = name;
        this.describe = describe;
        this.avatar = avatar;
        this.clbImage = clbImage;
    }

    public String getName() {
        return name;
    }

    public String getDescribe() {
        return describe;
    }

    public int getAvatar() {
        return avatar;
    }

    public int getClbImage() {
        return clbImage;
    }
}
