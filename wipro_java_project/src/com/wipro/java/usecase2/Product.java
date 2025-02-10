package com.wipro.java.usecase2;

import java.time.LocalDate;

public class Product {
    private int id;
    private String name;
    private String category;
    private double price;
    private LocalDate manufactureDate;

    // Constructor
    public Product(int id, String name, String category, double price, LocalDate manufactureDate) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.manufactureDate = manufactureDate;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public LocalDate getManufactureDate() { return manufactureDate; }
    public void setManufactureDate(LocalDate manufactureDate) { this.manufactureDate = manufactureDate; }

    @Override
    public String toString() {
        return "Product { " + "ID=" + id + ", Name='" + name + '\'' +
                ", Category='" + category + '\'' + ", Price=" + price +
                ", ManufactureDate=" + manufactureDate + " }";
    }
}

