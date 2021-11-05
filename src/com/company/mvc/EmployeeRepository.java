package com.company.mvc;

import com.company.data_mapper.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRepository {
    private final Connection connection;

    public EmployeeRepository(Connection connection) {
        this.connection = connection;
    }

    public Employee findById(Long id) {
        PreparedStatement preparedStatement = null;
        Employee employee = new Employee();
        try {
            preparedStatement = connection.prepareStatement("SELECT id, firstName, lastName FROM employees WHERE id = ?");
            preparedStatement.setLong(1, id);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    employee = new Employee();
                    employee.setId(resultSet.getLong(1));
                    employee.setFirstName(resultSet.getString(2));
                    employee.setLastName(resultSet.getString(3));
                    return employee;
                }
                throw new SQLException("Employee with id " + id + " not found");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }
}
