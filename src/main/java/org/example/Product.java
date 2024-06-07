package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
    private String name;
    private int quantity;
    private double price;
    private String category;
    private static List<Product> productList = new ArrayList<>();

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public Product(String name, int quantity, double price, String category) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.category = category;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public static List<Product> searchProducts(String query) {
        return productList.stream()
                .filter(product -> product.getName().toLowerCase().contains(query.toLowerCase()))
                .collect(Collectors.toList());
    }

    public static List<Product> getProductsByCategory(String category) {
        return productList.stream()
                .filter(product -> product.getCategory().equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }

    public static List<Product> getProductList() {
        return productList;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
