package com.company.data_mapper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public class ProductMapper {
    private static ProductMapper instance;
    private static Connection connection;

    public static ProductMapper getInstance() {
        if(instance == null){
            connection = ConnectionPool.getInstance().getConnection();
            instance = new ProductMapper();
        }
        return instance;
    }

    public Product findById(Long id) throws SQLException, ProductNotFoundException {
        Map<Long, Product> productMap = ProductIdentityMap.getInstance().getProductMap();
        if (productMap.containsKey(id)) {
            return productMap.get(id);
        }

        PreparedStatement preparedStatement = connection.prepareStatement("SELECT id, title, price FROM products WHERE id = ?");
        preparedStatement.setLong(1, id);
        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
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
        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
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

    public Long insertNew(Product product) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO products(title, price) VALUES(?, ?)");
        preparedStatement.setString(1, product.getTitle());
        preparedStatement.setBigDecimal(2, product.getPrice());
        int rows = preparedStatement.executeUpdate();
        if (rows != 0) {
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            if (resultSet.next()) {
                Long id = resultSet.getLong(1);
                return id;
            }
        }
        throw new SQLException("The product has not been created " + product);
    }

    public void update(Product product) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("UPDATE products SET title=?, price=? WHERE id = ?");
        preparedStatement.setString(1, product.getTitle());
        preparedStatement.setBigDecimal(2, product.getPrice());
        preparedStatement.setLong(3, product.getId());
        preparedStatement.executeQuery();
    }

    public void remove(Product product) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM products WHERE id = ?");
        preparedStatement.setLong(1, product.getId());
        preparedStatement.executeUpdate();
    }
}
