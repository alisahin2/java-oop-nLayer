package org.example;

import org.example.business.ProductManager;
import org.example.core.DatabaseLogger;
import org.example.core.FileLogger;
import org.example.core.Logger;
import org.example.core.MailLogger;
import org.example.dataAccess.ProductDaoHibernate;
import org.example.dataAccess.ProductDaoJDBC;
import org.example.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1, "Phone XY", 5000);
        Product product2 = new Product(2, "Phone XYZ", 7500);

        //Logger[] loggers = {}; // Example: logging is cancelled
        //Logger[] loggers = {new DatabaseLogger()}; // Example: lthere is only logging database
        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()}; // we need a many logger. we did provide that, also added to PropductManager as a method para

        ProductManager productManager = new ProductManager(new ProductDaoJDBC(), loggers); // ProductDaoJDBC() kind of ProductDao
        productManager.add(product1);

        ProductManager productManager2 = new ProductManager(new ProductDaoHibernate(), loggers); // ProductDaoHibernate() kind of ProductDao
        productManager2.add(product2);
    }
}