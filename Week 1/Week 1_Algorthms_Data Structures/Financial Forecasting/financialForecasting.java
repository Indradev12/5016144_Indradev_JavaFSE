public class financialForecasting {

    public static double calculateFutureValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        } else {
            return calculateFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
        }
    }
    public static void main(String[] args) {
        double initialValue = 1500.0;
        double growthRate = 0.09;
        int years = 5;
        double futureValue = calculateFutureValue(initialValue, growthRate, years);
        System.out.println("Future Value: " + futureValue);
    }
}