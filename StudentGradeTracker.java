import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();

        System.out.println("Student Grade Tracker");
        System.out.println("Enter grades one by one. Type 'done' to finish.");

        while (true) {
            System.out.print("Enter grade (or 'done'): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("done")) {
                break;
            }

            try {
                double grade = Double.parseDouble(input);
                if (grade >= 0 && grade <= 100) { // Assuming grades are between 0 and 100
                    grades.add(grade);
                } else {
                    System.out.println("Invalid grade. Please enter a value between 0 and 100.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'done'.");
            }
        }

        if (grades.isEmpty()) {
            System.out.println("No grades entered.");
        } else {
            // Calculate average
            double sum = 0;
            for (double grade : grades) {
                sum += grade;
            }
            double average = sum / grades.size();

            // Find highest and lowest
            double highest = Collections.max(grades);
            double lowest = Collections.min(grades);

            System.out.println("\n--- Grade Summary ---");
            System.out.printf("Average Grade: %.2f\n", average);
            System.out.printf("Highest Grade: %.2f\n", highest);
            System.out.printf("Lowest Grade: %.2f\n", lowest);
        }

        scanner.close();
    }
}