public class Numbers {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int a = 1;
        int b = 2;
        addNumbers(a , b);
        calculator.add(a, b);
        //System.out.println(calculator.add(a + b));
    }

    static void addNumbers(int x, int y){
        System.out.println(x + " + " + y + " är lika med: " + (x + y));

    }
}
