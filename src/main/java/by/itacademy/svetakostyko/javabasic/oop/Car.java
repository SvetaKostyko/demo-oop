package by.itacademy.svetakostyko.javabasic.oop;

public class Car {
    private int id;
    private String carBrand;
    private String modelOfCar;
    private int yearOfProduction;
    private String color;
    private double price;
    private String registrationNumber;

    public void setId(int id) {
        this.id = id;
    }

    public void setCarBrand(String brand) {
        carBrand = brand;
    }
    public void setModelOfCar(String model) {
        modelOfCar = model;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}
