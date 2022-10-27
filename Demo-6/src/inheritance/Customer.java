package inheritance;

public class Customer extends Person{
    private int amountOfMoney;

    public Customer(String name, String hairColour, boolean isHappy, int age, int amountOfMoney) {
        super(name, hairColour, isHappy, age);
        this.amountOfMoney = amountOfMoney;
    }
}

