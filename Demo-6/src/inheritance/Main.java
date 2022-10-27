package inheritance;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Lena", "Lila", false, 56, 1);
        Employee employee2 = new Employee("Lars", "Svart", false, 76, 2);

        Customer customer1 = new Customer("Agda", "Grå", true, 87, 200);
        Customer customer2 = new Customer("Bengt", "Inget hår", true, 65, 500);

        Person emp1 = new Employee("Lena", "Lila", false, 56, 1);
        Person cust1 = new Customer("Agda", "Grå", true, 87, 200);
    }

}
