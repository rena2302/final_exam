package com.example.final_exam;

public class Item {
    int itemImg;
    String itemTitle, itemDescription,itemPlaylist, itemArtist;

    public Item(int itemImg, String itemTitle, String itemDescription, String itemPlaylist, String itemArtist) {
        this.itemImg = itemImg;
        this.itemTitle = itemTitle;
        this.itemDescription = itemDescription;
        this.itemPlaylist = itemPlaylist;
        this.itemArtist = itemArtist;
    }

    public int getItemImg() {
        return itemImg;
    }

    public void setItemImg(int itemImg) {
        this.itemImg = itemImg;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemPlaylist() {
        return itemPlaylist;
    }

    public void setItemPlaylist(String itemPlaylist) {
        this.itemPlaylist = itemPlaylist;
    }

    public String getItemArtist() {
        return itemArtist;
    }

    public void setItemArtist(String itemArtist) {
        this.itemArtist = itemArtist;
    }
}
