package com.ptp.phamtanphat.youtubeplaylist1409.Model;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class YoutubeAPI {


    @SerializedName("items")
    @Expose
    private List<Item> items = null;
    public List<Item> getItems() {
        return items;
    }
    public void setItems(List<Item> items) {
        this.items = items;
    }

}