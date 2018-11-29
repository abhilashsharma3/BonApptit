package com.example.abhilash.bonapptit;

public class MenuItem {
    private String name;
    private float price;
    private int menuItemType;
    private int quantity;

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
}
