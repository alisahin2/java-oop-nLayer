package org.example.business;

import org.example.core.Logger;
import org.example.dataAccess.ProductDao;
import org.example.entities.Product;

public class ProductManager {

    private ProductDao productDao;
    private Logger[] loggers;

    public ProductManager(ProductDao productDao, Logger[] loggers) { // losely coupled. Also Looger[] used for Polymorphism
        this.productDao = productDao;
        this.loggers = loggers;
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

        for (Logger logger : loggers) { // [database, mail,file]
            logger.log(product.getName());
        }
    }
}
