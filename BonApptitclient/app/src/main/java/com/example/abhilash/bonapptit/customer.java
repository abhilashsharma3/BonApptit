package com.example.abhilash.bonapptit;

public class Customer {
    String customerName;
    int tableNo;
    float totalPrice;

    public Customer(String customerName,int tableNo){
        this.customerName=customerName;
        this.tableNo=tableNo;
    }

    public Customer(int totalPrice){
        this.totalPrice=totalPrice;

    }

    public int getTableNo() { return tableNo; }

    public void setTableNo(int tableNo) { this.tableNo = tableNo; }

    public float getTotalPrice() { return totalPrice; }

    public void setTotalPrice(float totalPrice) { this.totalPrice = totalPrice; }

    public String getCustomerName() { return customerName;    }

    public void setCustomerName(String customerName) { this.customerName = customerName; }



}
