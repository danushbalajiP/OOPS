class Calculator {

    // public method (accessible everywhere)
    public int add(int a, int b) {
        return a + b;
    }

    // protected method (accessible within package + subclasses)
    protected int add(int a, int b, int c) {
        return a + b + c;
    }

    // private method (accessible only inside this class)
    private double add(double a, double b) {
        return a + b;
    }

    // method to access private method
    public void showPrivateAdd(double a, double b) {
        System.out.println("Private add: " + add(a, b));
    }
}

public class Main {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // method overloading (same method name, different parameters)
        System.out.println("Public add: " + calc.add(2, 3));

        System.out.println("Protected add: " + calc.add(2, 3, 4));

        // accessing private method via public method
        calc.showPrivateAdd(2.5, 3.5);
    }
}