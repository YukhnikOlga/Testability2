
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.65; // рост в метрах
        double weight = 57; // вес в килограммах

        int bmi = service.calculate(height, weight);

        System.out.println("Индекс массы тела равен: " + bmi);

    }
}
