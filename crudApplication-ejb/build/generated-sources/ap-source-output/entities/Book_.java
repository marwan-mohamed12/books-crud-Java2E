package entities;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-08-27T11:22:21")
@StaticMetamodel(Book.class)
public class Book_ { 

    public static volatile SingularAttribute<Book, Integer> year;
    public static volatile SingularAttribute<Book, String> author;
    public static volatile SingularAttribute<Book, BigDecimal> price;
    public static volatile SingularAttribute<Book, String> name;
    public static volatile SingularAttribute<Book, Integer> id;
    public static volatile SingularAttribute<Book, String> category;

}