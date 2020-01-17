package Exercise_3;
import java.util.ArrayList;

public class Book {
    private String title;
    private double price;
    ArrayList<Author> authors = new ArrayList<Author>();

    void setTitle(String title){this.title = title;}
    String getTitle(){return this.title;}

    void setPrice(double price){this.price = price;}
    double getPrice(){return this.price;}
}

