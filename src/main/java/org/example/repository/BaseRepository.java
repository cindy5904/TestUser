package org.example.repository;

import java.sql.SQLException;
import java.util.List;

public abstract class BaseRepository<T> {
    public abstract T save (T element)throws SQLException;
    public abstract T update (T element)throws  SQLException;
    public abstract boolean delete(T element)throws SQLException;
    public abstract T get(int id) throws SQLException;
    public abstract List<T> get() throws SQLException;

}



