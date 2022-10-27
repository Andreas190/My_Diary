package inheritance;

public class Child extends Customer{
    private boolean wantsToGoHome;

    public Child(String name, String hairColour, boolean isHappy, int age, int amountOfMoney, boolean wantsToGoHome) {
        super(name, hairColour, isHappy, age, amountOfMoney);
        this.wantsToGoHome = wantsToGoHome;
    }
}
