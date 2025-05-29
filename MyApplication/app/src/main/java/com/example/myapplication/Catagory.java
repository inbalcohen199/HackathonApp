package com.example.myapplication;

public class Catagory {
    private String name;;
    private int amount;
    public Catagory(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }
    public Catagory() {
        this.name = "";
        this.amount = 0;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    @Override
    public String toString() {
        return "Catagory [name=" + name + ", amount=" + amount + "]";
    }


}