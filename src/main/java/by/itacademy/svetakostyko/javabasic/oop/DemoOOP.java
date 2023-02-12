package by.itacademy.svetakostyko.javabasic.oop;

import com.github.javafaker.Faker;
import com.github.javafaker.Name;

public class DemoOOP {
    public static void main(String[] args) {

        Customer customerA = new Customer(1236, "Ivanov", "Ivan", "Ivanovich", "Brestskaya street, 56/25", 1234567890123456L, 1236_5478_9632_58L);
        Customer customerB = new Customer(1236, "Ivanov", "Ivan", "Ivanovich", "Brestskaya street, 56/25", 1234567890123456L, 1236_5478_9632_58L);

//        Faker faker = new Faker();
//        Name name1 = faker.name();
//        String name = name1.firstName();
//        String lastName = name1.lastName();
//        customer.setPatronymic("Ivanovich");
//        String address = faker.address().streetAddress();
//        String houseNumber = faker.address().streetAddressNumber();
//        customer.setNumberOfCard(1234567890123456L);
//        customer.setNumberOfBankAccount(1236_5478_9632_58L);
//
//        System.out.println(customer.getId());
//        System.out.println("Name - " + name);
//        System.out.println("Last name - " + lastName);
//        System.out.println(customer.getPatronymic());
//        System.out.println("Address - " + address + houseNumber);
//        System.out.println(customer.getNumberOfCard());
//        System.out.println(customer.getNumberOfBankAccount());

        Book book = new Book();
        book.setId(10857656);
        book.setTitle("Ten little Indians");
        book.setAuthor("Agatha Kristy");
        book.setPublishingHouse("Eksmo");
        book.setYearOfPublish(2021);
        book.setPrice(11.84);
        book.setQuantityOfPages(288);
        System.out.println(book.getId());
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getPublishingHouse());
        System.out.println(book.getYearOfPublish());
        System.out.println(book.getPrice());
        System.out.println(book.getQuantityOfPages());

        Car car = new Car();
        car.setId(103174396);
        car.setCarBrand("Skoda");
        car.setModelOfCar("Kodiaq");
        car.setYearOfProduction(2018);
        car.setColor("blue");
        car.setPrice(77_400);
        car.setRegistrationNumber("6325CH5");
        System.out.println(car.getId());
        System.out.println(car.getCarBrand());
        System.out.println(car.getModelOfCar());
        System.out.println(car.getYearOfProduction());
        System.out.println(car.getColor());
        System.out.println(car.getPrice());
        System.out.println(car.getRegistrationNumber());


    }

}
