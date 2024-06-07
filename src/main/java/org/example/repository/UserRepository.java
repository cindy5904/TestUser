package org.example.repository;

import org.example.User;

import java.sql.SQLException;
import java.util.List;

public class UserRepository extends BaseRepository<User> {
    @Override
    public User save(User element) throws SQLException {
        return null;
    }

    @Override
    public User update(User element) throws SQLException {
        return null;
    }

    @Override
    public boolean delete(User element) throws SQLException {
        return false;
    }

    @Override
    public User get(int id) throws SQLException {
        return null;
    }

    @Override
    public List<User> get() throws SQLException {
        return null;
    }
}
