package org.example.dataAccess;

import org.example.entities.Product;

public class ProductDaoHibernate implements ProductDao {
    public void add(Product product) { // this method name should be same from implemented interface. you cant use add2 or something like that
        // This block only has been db connetion informations
        System.out.println("Added:" + product.getId() + " with hibernate");
    }

}
