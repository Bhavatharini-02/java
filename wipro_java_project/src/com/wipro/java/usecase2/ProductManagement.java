package com.wipro.java.usecase2;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class ProductManagement {
    public static void main(String[] args) {
        ProductService service = new ProductService();
        Scanner scanner = new Scanner(System.in);

        // Adding some products for testing
        service.addProduct(new Product(1, "Laptop", "Electronics", 50000, LocalDate.of(2022, 5, 10)));
        service.addProduct(new Product(2, "Shirt", "Clothing", 1500, LocalDate.of(2023, 3, 15)));
        service.addProduct(new Product(3, "Phone", "Electronics", 30000, LocalDate.of(2021, 8, 22)));

        while (true) {
            System.out.println("\n------ Product Management System ------");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Search Product");
            System.out.println("4. Update Price");
            System.out.println("5. Display All Products");
            System.out.println("6. Filter by Category");
            System.out.println("7. Sort by Name");
            System.out.println("8. Get Average Price");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Category: ");
                    String category = scanner.nextLine();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    service.addProduct(new Product(id, name, category, price, LocalDate.now()));
                    break;
                case 2:
                    System.out.print("Enter Product ID to Remove: ");
                    int removeId = scanner.nextInt();
                    service.removeProduct(removeId);
                    break;
                case 3:
                    System.out.print("Enter Product ID to Search: ");
                    int searchId = scanner.nextInt();
                    Optional<Product> product = service.searchProduct(searchId);
                    System.out.println(product.orElse(null));
                    break;
                case 4:
                    System.out.print("Enter Product ID to Update Price: ");
                    int updateId = scanner.nextInt();
                    System.out.print("Enter New Price: ");
                    double newPrice = scanner.nextDouble();
                    service.updatePrice(updateId, newPrice);
                    break;
                case 5:
                    service.displayProducts();
                    break;
                case 6:
                    System.out.print("Enter Category: ");
                    scanner.nextLine();
                    String categoryInput = scanner.nextLine();
                    List<Product> filtered = service.filterByCategory(categoryInput);
                    filtered.forEach(System.out::println);
                    break;
                case 7:
                    List<Product> sorted = service.sortByName();
                    sorted.forEach(System.out::println);
                    break;
                case 8:
                    System.out.println("Average Price: " + service.getAveragePrice());
                    break;
                case 9:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}