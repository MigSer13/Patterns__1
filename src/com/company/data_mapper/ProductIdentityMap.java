package com.company.data_mapper;

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
        productMap.put(product.getId(), product);
    }

    public Product getProduct(Long id){
        return productMap.get(id);
    }
}
