package by.itacademy.svetakostyko.javabasic.oop;

public class Book {
    private int id;
    private String title;
    private String author;
    private String publishingHouse;
    private int yearOfPublish;
    private int quantityOfPages;
    private double price;

    public Book(int id, String title, String author, String publishingHouse, int yearOfPublish, int quantityOfPages, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.yearOfPublish = yearOfPublish;
        this.quantityOfPages = quantityOfPages;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", yearOfPublish=" + yearOfPublish +
                ", quantityOfPages=" + quantityOfPages +
                ", price=" + price +
                '}';
    }
}
