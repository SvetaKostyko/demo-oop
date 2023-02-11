package by.itacademy.svetakostyko.javabasic.oop;

public class Customer {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private long numberOfCard;
    private long numberOfBankAccount;

    public void setId(int id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumberOfCard(int numberOfCard) {
        this.numberOfCard = numberOfCard;
    }

    public void setNumberOfBankAccount(long numberOfBankAccount) {
        this.numberOfBankAccount = numberOfBankAccount;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getAddress() {
        return address;
    }

    public long getNumberOfCard() {
        return numberOfCard;
    }

    public long getNumberOfBankAccount() {
        return numberOfBankAccount;
    }
}
