package demo.btth;

import org.w3c.dom.ls.LSOutput;

import java.util.Date;

public class Book {
    private String id;
    private String title;
    private String author;
    private String publisher;
    private Date yearOfPublication;
    private int numberOfPage;
    private Double price;

    public Book(String id, String title, String author, String publisher, Date yearOfPublication, int numberOfPage, Double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.numberOfPage = numberOfPage;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Date getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(Date yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    @Override
    public String toString(){
        return "Book" +
                "Id " + id +
                "title " + title +
                "author " + author +
                "publisher " + publisher +
                "Date " + yearOfPublication +
                "Page " + numberOfPage;
    }

}
