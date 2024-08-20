package entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-08-20T14:24:41")
@StaticMetamodel(Book.class)
public class Book_ { 

    public static volatile SingularAttribute<Book, Date> createdat;
    public static volatile SingularAttribute<Book, Integer> pages;
    public static volatile SingularAttribute<Book, String> author;
    public static volatile SingularAttribute<Book, Integer> publicationyear;
    public static volatile SingularAttribute<Book, BigDecimal> price;
    public static volatile SingularAttribute<Book, String> isbn;
    public static volatile SingularAttribute<Book, String> genre;
    public static volatile SingularAttribute<Book, String> publisher;
    public static volatile SingularAttribute<Book, String> title;
    public static volatile SingularAttribute<Book, Integer> bookid;

}