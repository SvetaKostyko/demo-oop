package by.itacademy.svetakostyko.javabasic.oop;

import com.github.javafaker.Faker;
import com.github.javafaker.Name;

public class DemoOOP {
    public static void main(String[] args) {

        Customer customerA = new Customer(1236, "Ivanov", "Petr", "Ivanovich", "Brestskaya street, 56/25", 1234567890123456L, 1236_5478_9632_58L);
        Customer customerB = new Customer(1238, "Ivanov", "Ivan", "Ivanovich", "Brestskaya street, 56/25", 1234567890123456L, 1236_5478_9632_58L);
        System.out.println(customerA);
        System.out.println(customerB);
        System.out.println(customerA.equals(customerB));


        Book book1 = new Book(10857656, "Ten little Indians", "Agatha Kristy", "Eksmo", 2021, 288, 11.84);
        Book book2 = new Book(10857658, "The Witches of Eastwick", "John Updike", "Kapo", 2019, 192, 13.84);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book1.equals(book2));


        Car carSkoda = new Car(103174396, "Skoda", "Kodiaq", 2018, "blue", 77_400, "6325CH5");
        Car carMazda = new Car(103174368, "Mazda", "6", 2018, "red", 68_000, "5896KP7");
        System.out.println(carSkoda);
        System.out.println(carMazda);
        System.out.println(carSkoda.equals(carMazda));
    }

}
