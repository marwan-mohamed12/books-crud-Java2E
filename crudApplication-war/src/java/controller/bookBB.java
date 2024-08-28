/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.marwan.bookservices.BookQueryServiceLocal;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.ejb.EJB;
import entities.Book;
import javax.annotation.PostConstruct;
import java.util.List;

/**
 *
 * @author mhussein
 */
@Named(value = "bookBB")
@SessionScoped
public class bookBB implements Serializable {

    @EJB
    BookQueryServiceLocal bookService;
    private Book book;
    private Book selectedBook;

    @PostConstruct
    void init() {
        book = new Book();
    }
    

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
    
    public Book getSelectedBook() {
        return selectedBook;
    }

    public void setSelectedBook(Book selectedBook) {
        this.selectedBook = selectedBook;
    }

    public String add() {
        bookService.createBook(book);
        setBook(new Book());
        return "index.xhtml?faces-redirect=true";
    }
    
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }
    
    public String deleteBook(Book b) {
        bookService.deleteBook(b);
        return "index.xhtml?faces-redirect=true";
    }
    
    public String updateBook() {
        bookService.updateBook(book);
        return "index.xhtml?faces-redirect=true";
    }
    

}
