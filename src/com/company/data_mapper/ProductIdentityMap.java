package com.company.data_mapper;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class ProductIdentityMap {
    private static ProductIdentityMap instance;
    private Map<Long, Product> productMap;

    public static ProductIdentityMap getInstance() {
        if(instance == null){
            instance = new ProductIdentityMap();
        }
        return instance;
    }

    public Map<Long, Product> getProductMap() {
        return productMap;
    }

    private ProductIdentityMap() {
        this.productMap = new HashMap<>();
    }

    public void addProduct(Product product){
        try {
            Long id = ProductMapper.getInstance().insertNew(product);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        productMap.put(product.getId(), product);
    }
    public void updateProduct(Product product){
        try {
            ProductMapper.getInstance().update(product);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        productMap.put(product.getId(), product);
    }

    public Product getProduct(Long id){
        return productMap.get(id);
    }

    public void removeProduct(Product product) {
        try {
            ProductMapper.getInstance().remove(product);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        productMap.remove(product.getId(), product);
    }
}
