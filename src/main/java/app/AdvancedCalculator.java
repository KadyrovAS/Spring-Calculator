package app;

import org.springframework.beans.factory.annotation.Value;


public class AdvancedCalculator extends SimpleCalculator{
//    @Value("#{Double.parseDouble('${spring.calculator.PI}')}")
    @Value("${spring.calculator.PI}")
    private String piString;

    @Override
    public int sum(int a, int b) {
        long result = (long) a + (long) b;
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE){
            throw new RuntimeException("Overflow");
        }
        return super.sum(a, b);
    }

    @Override
    public int diff(int a, int b) {
        long result = (long) a - (long) b;
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE){
            throw new RuntimeException("Overflow");
        }
        return super.diff(a, b);
    }

    @Override
    public int mult(int a, int b) {
        long result = (long) a * (long) b;
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE){
            throw new RuntimeException("Overflow");
        }
        return super.mult(a, b);
    }

    @Override
    public int div(int a, int b) {
        if (b == 0){
            throw new RuntimeException("Divide by zero");
        }

        long result = (long) a / (long) b;
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE){
            throw new RuntimeException("Overflow");
        }
        return super.div(a, b);

    }

    @Override
    public String toString() {
        double pi = Double.parseDouble(piString);
        return "AdvancedCalculator{" +
                "pi=" + pi +
                '}';
    }
}
