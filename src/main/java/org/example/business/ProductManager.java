package org.example.business;

import org.example.dataAccess.ProductDao;
import org.example.entities.Product;

public class ProductManager {

    private ProductDao productDao;

    public ProductManager(ProductDao productDao) { // losely coupled
        this.productDao = productDao;
    }

    public void add(Product product) throws Exception {
        if (product.getUnitPrice() < 25) {
            throw new Exception("Product unit price should bigger than 25");
        }

        // old style
        /*
        ProductDaoJDBC productDaoJDBC = new ProductDaoJDBC();
        productDaoJDBC.add(product);
        */


        productDao.add(product);
    }
}
