package org.example;

import org.example.business.ProductManager;
import org.example.dataAccess.ProductDaoHibernate;
import org.example.dataAccess.ProductDaoJDBC;
import org.example.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1, "Phone XY", 5000);
        Product product2 = new Product(2, "Phone XYZ", 7500);

        ProductManager productManager = new ProductManager(new ProductDaoJDBC()); // ProductDaoJDBC() kind of ProductDao
        productManager.add(product1);

        ProductManager productManager2 = new ProductManager(new ProductDaoHibernate()); // ProductDaoHibernate() kind of ProductDao
        productManager2.add(product2);
    }
}