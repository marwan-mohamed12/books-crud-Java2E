package com.book.services;


import java.util.List;
import javax.ejb.Local;


/**
 *
 * @author mhussein
 */
@Local
public interface BookQueryServiceLocal {
    
    public void createBook(Book book);
    
    public List<Book> getAllBooks();
    
    public void updateBook(Book book);
    
    public void deleteBook(Book book);
}
