package org.example.dataAccess;

import org.example.entities.Product;

public class ProductDaoHibernate {
    public void add(Product product) {
        System.out.println("Added:" + product.getId());
    }

}