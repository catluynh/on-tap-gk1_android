package com.example.gk_1;

import java.io.Serializable;

public class Item implements Serializable {
    private int id;
    private String name;
    private String description;
    private double price;
    private int imgItem;

    public Item(int id, String name, String description, double price, int imgItem) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imgItem = imgItem;
    }

    public Item(String name) {
        this.name = name;
    }

    public Item() {
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getImgItem() {
        return imgItem;
    }

    public void setImgItem(int imgItem) {
        this.imgItem = imgItem;
    }
}
