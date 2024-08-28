/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.book.services;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author mhussein
 */
@Stateless
public class BookQueryService implements BookQueryServiceLocal {

   @EJB
    private BookFacadeLocal bookFacade;

    @Override
    public void createBook(Book book) {
        bookFacade.create(book);
    }
    
    @Override
    public List<Book> getAllBooks(){
        return bookFacade.findAll();
    }
    
    @Override
    public void updateBook(Book book){
        bookFacade.edit(book);
    }
    
    @Override
    public void deleteBook(Book book){
        bookFacade.remove(book);
    }
    
}
