package by.itacademy.svetakostyko.javabasic.oop;

public class Book {
    private int id;
    private String title;
    private String author;
    private String publishingHouse;
    private int yearOfPublish;
    private int quantityOfPages;
    private double price;

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public void setYearOfPublish(int yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }

    public void setQuantityOfPages(int quantityOfPages) {
        this.quantityOfPages = quantityOfPages;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
