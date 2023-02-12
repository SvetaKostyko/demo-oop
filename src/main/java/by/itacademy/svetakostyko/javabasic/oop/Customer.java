package by.itacademy.svetakostyko.javabasic.oop;

public class Customer {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private long numberOfCard;
    private long numberOfBankAccount;

    public Customer(int id, String surname, String name, String patronymic, String address, long numberOfCard, long numberOfBankAccount){
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        this. numberOfCard = numberOfCard;
        this.numberOfBankAccount = numberOfBankAccount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", numberOfCard=" + numberOfCard +
                ", numberOfBankAccount=" + numberOfBankAccount +
                '}';
    }
}
