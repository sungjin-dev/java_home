package test1120;

import java.util.List;

public interface Management {
    void addItem(Book book);              // INSERT
    List<Book> findAll();                 // SELECT 전체
    Book findById(int id);                // SELECT WHERE id
    void updateItem(Book book);           // UPDATE
    void deleteItem(int id);              // DELETE
}

