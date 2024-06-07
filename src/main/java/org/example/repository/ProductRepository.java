package org.example.repository;

import org.example.Product;

import java.sql.SQLException;
import java.util.List;

public class ProductRepository extends BaseRepository<Product>{
    @Override
    public Product save(Product element) throws SQLException {
        return element;
    }

    @Override
    public Product update(Product element) throws SQLException {
        return null;
    }

    @Override
    public boolean delete(Product element) throws SQLException {
        delete(element);
        return false;
    }

    @Override
    public Product get(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Product> get() throws SQLException {
        return get();
    }
}
