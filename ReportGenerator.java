import java.util.List;

public class ReportGenerator {

    public static void printReport(List<Student> students) {
        System.out.println("=================================");
        System.out.println("            Grade Report         ");
        System.out.println("=================================");

        for (Student student : students) {
            double average = GradeCalculator.calculateAverage(student.getGrades());
            String letter = GradeCalculator.getLetterGrade(average);
            double highest = GradeCalculator.getHighest(student.getGrades());
            double lowest = GradeCalculator.getLowest(student.getGrades());

            System.out.println("Student: " + student.getName());
            System.out.println("Grades:  " + student.getGrades());
            System.out.println("Average: " + String.format("%.2f", average));
            System.out.println("Grade:   " + letter);
            System.out.println("Highest: " + highest);
            System.out.println("Lowest:  " + lowest);
            System.out.println("------------------------------------------");
        }
    }
}