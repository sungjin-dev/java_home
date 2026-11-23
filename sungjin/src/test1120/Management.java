package test1120;

import java.util.List;

public interface Management<T> {
    void addItem(T item);              // INSERT
    List<T> findAll();                 // SELECT 전체
    T findById(int id);                // SELECT WHERE id
    void updateItem(T item);           // UPDATE
    void deleteItem(int id);              // DELETE
}

