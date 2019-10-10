package com.improving.tagcli.models;

public class Weapon {
    private String name;
    private int id;
    private String area;
    private String itemType;

    public Weapon(int id, String name, String area, String itemType) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.itemType = itemType;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getArea() {
        return area;
    }

    public String getItemType() {
        return itemType;
    }
}
