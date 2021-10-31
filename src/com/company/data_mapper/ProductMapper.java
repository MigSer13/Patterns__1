package com.company.data_mapper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public class ProductMapper {
    private final Connection connection;

    public ProductMapper(Connection connection) {
        this.connection = connection;
    }

    public Product findById(Long id) throws SQLException, ProductNotFoundException {
        Map<Long, Product> productMap = ProductIdentityMap.getInstance().getProductMap();
        if (productMap.containsKey(id)){
            return productMap.get(id);
        }

        PreparedStatement preparedStatement = connection.prepareStatement("SELECT id, title, price FROM products WHERE id = ?");
        preparedStatement.setLong(1, id);
        try (ResultSet resultSet = preparedStatement.executeQuery()){
            while (resultSet.next()){
                Product product = new Product();
                product.setId(resultSet.getLong(1));
                product.setTitle(resultSet.getString(2));
                product.setPrice(resultSet.getBigDecimal(3));
                productMap.put(id, product);
                return product;
            }
        }
        throw new ProductNotFoundException("Could not find product with ID " + id);
    }

    public Product findByTitle(String title) throws SQLException, ProductNotFoundException {
        //?????????????????
        //здесь нужно сделать новый класс ProductIdentityMap с Map<String(title), Product> или как-то ещё проверять по title
        // в уже созданной Map<Long, Product> ?

        PreparedStatement preparedStatement = connection.prepareStatement("SELECT id, title, price FROM products WHERE title = ?");
        preparedStatement.setString(1, title);
        try (ResultSet resultSet = preparedStatement.executeQuery()){
            while (resultSet.next()){
                Product product = new Product();
                product.setId(resultSet.getLong(1));
                product.setTitle(resultSet.getString(2));
                product.setPrice(resultSet.getBigDecimal(3));
                // ???????????????????
                return product;
            }
        }
        throw new ProductNotFoundException("Could not find product with TITLE " + title);
    }
}
