/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.tecsup.biblioteca.loans.java.repo.mem;

/**
 *
 * @author chboy
 */
import pe.edu.tecsup.biblioteca.loans.java.model.Book;
import pe.edu.tecsup.biblioteca.loans.java.repo.BookRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class InMemoryBookRepository implements BookRepository {
    private final Map<String, Book> data = new HashMap<>();

    @Override
    public Optional<Book> findByIsbn(String isbn) {
        return Optional.ofNullable(data.get(isbn));
    }

    @Override
    public void save(Book book) {
        data.put(book.getIsbn(), book);
    }
}
