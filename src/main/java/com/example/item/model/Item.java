package com.example.item.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int code;

    // Default constructor for JPA
    public Item() {
    }

    public Item(int id, String name, int code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}


//package com.example.item.model;
//
//public class Item {
//
//    private int IDitem;
//    private String nameitem;
//    private int codeitem;
//
//
//    public Item(int IDitem, String nameitem, int codeitem) {
//
//        this.IDitem = IDitem;
//        this.nameitem = nameitem;
//        this.codeitem = codeitem;
//    }
//
//    public void setCodeitem(int codeitem) {
//        this.codeitem = codeitem;
//    }
//
//    public void setIDitem(int IDitem) {
//        this.IDitem = IDitem;
//    }
//
//    public void setNameitem(String nameitem) {
//        this.nameitem = nameitem;
//    }
//
//    public int getIDitem() {
//        return IDitem;
//    }
//
//    public String getNameitem() {
//        return nameitem;
//    }
//
//    public int getCodeitem() {
//        return codeitem;
//    }
//}
