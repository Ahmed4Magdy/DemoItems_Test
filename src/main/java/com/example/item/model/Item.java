package com.example.item.model;

public class Item {

    private  int IDitem;
    private String nameitem;
    private  int codeitem;


    public Item(int IDitem , String nameitem, int codeitem){

        this.IDitem=IDitem;
        this.nameitem=nameitem;
        this.codeitem=codeitem;
    }

    public void setCodeitem(int codeitem) {
        this.codeitem = codeitem;
    }

    public void setIDitem(int IDitem) {
        this.IDitem = IDitem;
    }

    public void setNameitem(String nameitem) {
        this.nameitem = nameitem;
    }

    public int getIDitem() {
        return IDitem;
    }

    public String getNameitem() {
        return nameitem;
    }

    public int getCodeitem() {
        return codeitem;
    }
}
