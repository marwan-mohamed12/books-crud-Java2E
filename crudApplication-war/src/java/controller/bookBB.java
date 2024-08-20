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

    private String title;
    private String author;
    private String publisher;
    private String ISBN;
    private String genre;
    private double price;
    private int publicationYear;

    @PostConstruct
    void init() {
        book = new Book();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public bookBB() {
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Book getSelectedBook() {
        return selectedBook;
    }

    public void setSelectedBook(Book selectedBook) {
        this.selectedBook = selectedBook;
    }

    public void emptyVariables() {

        this.title = "";
        this.author = "";
        this.publisher = "";
        this.ISBN = "";
        this.genre = "";
        this.price = 0.0;
        this.publicationYear = 0;

    }
    
    
    public String add() {
        bookService.createBook(book);
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
