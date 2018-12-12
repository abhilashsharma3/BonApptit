package com.example.abhilash.bonapptit;


public class MenuItem {
    private String name;
    private float price;
    private int menuItemType;
    private int quantity;
    private String desc;
    private String img;


    public MenuItem(String name, float price, int menuItemType, String desc, String img) {
        this.name = name;
        this.price = price;
        this.menuItemType = menuItemType;
        this.quantity = 0;
        this.desc = desc;
        this.img = img;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getMenuItemType() {
        return menuItemType;
    }

    public void setMenuItemType(int menuItemType) {
        this.menuItemType = menuItemType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getImg() { return img; }

    public void setImg(String img) { this.img = img; }
}
