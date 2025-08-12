import java.util.ArrayList;
import java.util.Scanner;
public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();

        System.out.println("=== Student Grade Tracker ===");
        System.out.println("Enter student grades (type -1 to stop):");

        while (true) {
            System.out.print("Enter grade: ");
            double grade = scanner.nextDouble();
            if (grade == -1) break;
            grades.add(grade);
        }

        if (grades.isEmpty()) {
            System.out.println("No grades entered.");
        } else {
            double sum = 0, highest = grades.get(0), lowest = grades.get(0);

            for (double g : grades) {
                sum += g;
                if (g > highest) highest = g;
                if (g < lowest) lowest = g;
            }

            double average = sum / grades.size();

            System.out.println("\n=== Summary Report ===");
            System.out.println("Total Students: " + grades.size());
            System.out.println("Average Score: " + average);
            System.out.println("Highest Score: " + highest);
            System.out.println("Lowest Score: " + lowest);
            System.out.println("All Scores: " + grades);
        }

        scanner.close();
    }
}
