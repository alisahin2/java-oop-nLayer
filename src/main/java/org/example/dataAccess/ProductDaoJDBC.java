package org.example.dataAccess;

import org.example.entities.Product;

public class ProductDaoJDBC implements ProductDao {

    public void add(Product product) {
        System.out.println("Added:" + product.getId() + " with JDBC");
    }
}
