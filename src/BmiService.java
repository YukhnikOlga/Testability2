public class BmiService {
    public int calculate(double height, double weight) {
        double square = height * height;
        double bmi = weight / square;
        return (int) bmi;
    }
}
