package org.example;

import org.example.business.ProductManager;
import org.example.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1, "Phone XY", 5000);

        ProductManager productManager = new ProductManager();
        productManager.add(product1);
    }
}