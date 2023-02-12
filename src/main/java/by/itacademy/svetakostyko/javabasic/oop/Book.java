package by.itacademy.svetakostyko.javabasic.oop;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && yearOfPublish == book.yearOfPublish && quantityOfPages == book.quantityOfPages && Double.compare(book.price, price) == 0 && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(publishingHouse, book.publishingHouse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, publishingHouse, yearOfPublish, quantityOfPages, price);
    }
}
