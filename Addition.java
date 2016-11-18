public class Addition implements Calculator {
    @Override
    public double calculate(int first, int second) {
        return (double) first + second;
    }
}