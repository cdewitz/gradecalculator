import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Grade Calculator ===");
        System.out.print("How many students? ");
        int count = Integer.parseInt(scanner.nextLine().trim());

        for (int i = 0; i < count; i++) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine().trim();

            System.out.print("Enter grades separated by commas (e.g. 85,90,78): ");
            String[] parts = scanner.nextLine().trim().split(",");
            List<Double> grades = new ArrayList<>();
            for (String part : parts)
                grades.add(Double.parseDouble(part.trim()));

            students.add(new Student(name, grades));
        }

        scanner.close();
        ReportGenerator.printReport(students);
    }
}