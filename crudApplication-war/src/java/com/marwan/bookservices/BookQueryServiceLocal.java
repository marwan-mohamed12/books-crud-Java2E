/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.marwan.bookservices;

import entities.Book;
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
