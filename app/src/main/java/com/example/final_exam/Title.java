package com.example.final_exam;

import java.util.List;

public class Title {
    String titleLabel, titleDescription;
    List<Item> itemList;

    public Title(String titleLabel, String titleDescription, List<Item> itemList) {
        this.titleLabel = titleLabel;
        this.titleDescription = titleDescription;
        this.itemList = itemList;
    }

    public String getTitleLabel() {
        return titleLabel;
    }

    public void setTitleLabel(String titleLabel) {
        this.titleLabel = titleLabel;
    }

    public String getTitleDescription() {
        return titleDescription;
    }

    public void setTitleDescription(String titleDescription) {
        this.titleDescription = titleDescription;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
}
