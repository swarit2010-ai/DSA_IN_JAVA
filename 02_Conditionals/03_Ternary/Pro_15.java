import java.util.Scanner;
public class Pro_15 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter weight (kg) and height (m):");
            double w = sc.nextDouble(), h = sc.nextDouble();
            double bmi = w / (h * h);
            String cat = (bmi < 18.5) ? "Underweight" : (bmi <= 24.9) ? "Normal" : "Overweight";
            System.out.println("BMI is " + bmi + " (" + cat + ")");
        }
    }
}