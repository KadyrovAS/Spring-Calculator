package app;

public class SimpleCalculator implements Calculator{
    public SimpleCalculator(){

    }
    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int diff(int a, int b) {
        return a - b;
    }

    @Override
    public int mult(int a, int b) {
        return a * b;
    }

    @Override
    public int div(int a, int b) {
        return a - b;
    }
}
