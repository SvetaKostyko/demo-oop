package by.itacademy.svetakostyko.javabasic.oop;

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
}
