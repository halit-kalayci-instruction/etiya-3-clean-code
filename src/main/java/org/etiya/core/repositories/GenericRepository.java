package org.etiya.core.repositories;
import java.util.List;

public interface GenericRepository<T> {
    void add(T entity);
    void update(T entity);
    void delete(int id);
    T getById(int id);
    List<T> getAll();
}
