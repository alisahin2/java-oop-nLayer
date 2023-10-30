package org.example.business;

import org.example.dataAccess.ProductDaoJDBC;
import org.example.entities.Product;

public class ProductManager {

    public void add(Product product) throws Exception {
        if (product.getUnitPrice() < 25) {
            throw new Exception("Product unit price should bigger than 25");
        }

        ProductDaoJDBC productDaoJDBC = new ProductDaoJDBC();
        productDaoJDBC.add(product);
    }
}
