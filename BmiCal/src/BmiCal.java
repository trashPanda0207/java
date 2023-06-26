import java.util.Scanner;

public class BmiCal {
    public static void main(String[] args) {
        bmiResult();
    }

    private static double varInput(String measurementType, String unit) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please enter your %s(%s): ", measurementType, unit);
        double measurementValue = scanner.nextDouble();
        return measurementValue;
    }

    private static double calBmi() {
        double height = varInput("height", "centimeter");
        double weight = varInput("weight", "kilogram");
        return weight / ((height / 100.0) * (height / 100.0));
    }
    public static void bmiResult() {
        double bmi = calBmi();
        System.out.printf("Your BMI is: %.2f%n", bmi);
    }
}
