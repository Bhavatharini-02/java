package com.wipro.java.usecase2;

import java.util.*;
import java.util.stream.Collectors;

public class ProductService {
    private List<Product> products = new ArrayList<>();

    // Add a Product
    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added: " + product);
    }

    // Remove a Product by ID
    public void removeProduct(int id) {
        products.removeIf(p -> p.getId() == id);
        System.out.println("Product with ID " + id + " removed.");
    }

    // Search Product by ID
    public Optional<Product> searchProduct(int id) {
        return products.stream().filter(p -> p.getId() == id).findFirst();
    }

    // Update Product Price
    public void updatePrice(int id, double newPrice) {
        products.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .ifPresent(p -> p.setPrice(newPrice));
        System.out.println("Product price updated for ID " + id);
    }

    // Display All Products
    public void displayProducts() {
        System.out.println("\n---- Product List ----");
        products.forEach(System.out::println);
    }

    // Filter by Category
    public List<Product> filterByCategory(String category) {
        return products.stream()
                .filter(p -> p.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    // Sort by Name
    public List<Product> sortByName() {
        return products.stream()
                .sorted(Comparator.comparing(Product::getName))
                .collect(Collectors.toList());
    }

    // Get Average Price
    public double getAveragePrice() {
        return products.stream()
                .mapToDouble(Product::getPrice)
                .average()
                .orElse(0.0);
    }
}
