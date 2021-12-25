public class BmiService {
    public double calculate(int weight, double height) {
        int n = 2;
        double bmi = weight / Math.pow(height, n);
        return bmi;
    }
}