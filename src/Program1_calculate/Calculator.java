package Program1_calculate;

public class Calculator {


    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void subtraction(int a, int b) {
        System.out.println(a - b);
    }


    public void multiply(int a, int b) {
        System.out.println(a * b);
    }


    public void divide(int a, int b) {
        System.out.println(a / b);
    }


    public void calculateResult(int a, int b, char symbol) {
        if (symbol == '+') {
            add(a, b);
        } else if (symbol == '-') {
            subtraction(a, b);
        } else if (symbol == '*') {
            multiply(a, b);
        } else if (symbol == '/') {
            divide(a, b);
        } else {
            System.out.println("Invalid symbol");
        }


    }
}



