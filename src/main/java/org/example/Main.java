package org.example;

import org.example.business.ProductManager;
import org.example.dataAccess.ProductDaoHibernate;
import org.example.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1, "Phone XY", 5000);
        Product product2 = new Product(2, "Phone XYZ", 7500);

        ProductManager productManager = new ProductManager();
        productManager.add(product1);

        ProductDaoHibernate productManager2 = new ProductDaoHibernate();
        productManager2.add(product2);
    }
}