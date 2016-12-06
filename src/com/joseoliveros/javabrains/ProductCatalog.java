package com.joseoliveros.javabrains;

import com.joseoliveros.javabrains.bussines.ProductServiceImpl;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public class ProductCatalog {

    ProductServiceImpl productService = new ProductServiceImpl();

    @WebMethod
    public List<String> getProductCategories() {
        return productService.getProductCategories();
    }

    @WebMethod(exclude = true)
    public List<String> getProduct(String category) {
        return productService.getProducts(category);
    }

    @WebMethod(exclude = true)
    public boolean addProduct(String category, String product) {
        return productService.addProduct(category, product);
    }
}
