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

    public int getId() {
        return id;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getModelOfCar() {
        return modelOfCar;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}
