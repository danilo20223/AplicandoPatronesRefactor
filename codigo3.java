import java.util.ArrayList;
import java.util.List;

public class AverageCalculator {

    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        numbers.add(10.0);
        numbers.add(20.0);
        numbers.add(30.0);
        numbers.add(40.0);
        numbers.add(50.0);
        
        System.out.println("The average is: " + calculateAverage(numbers));
    }

    public static double calculateAverage(List<Double> numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        double average = sum / numbers.size();
        return average;
    }
}
