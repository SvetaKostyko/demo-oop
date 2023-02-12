package by.itacademy.svetakostyko.javabasic.oop;

import java.util.Objects;

public class Car {
    private int id;
    private String carBrand;
    private String modelOfCar;
    private int yearOfProduction;
    private String color;
    private double price;
    private String registrationNumber;

    public Car(int id, String carBrand, String modelOfCar, int yearOfProduction, String color, double price, String registrationNumber) {
        this.id = id;
        this.carBrand = carBrand;
        this.modelOfCar = modelOfCar;
        this.yearOfProduction = yearOfProduction;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", carBrand='" + carBrand + '\'' +
                ", modelOfCar='" + modelOfCar + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", registrationNumber='" + registrationNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && yearOfProduction == car.yearOfProduction && Double.compare(car.price, price) == 0 && Objects.equals(carBrand, car.carBrand) && Objects.equals(modelOfCar, car.modelOfCar) && Objects.equals(color, car.color) && Objects.equals(registrationNumber, car.registrationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, carBrand, modelOfCar, yearOfProduction, color, price, registrationNumber);
    }
}
