import java.util.List;

public class GradeCalculator {

    public static double calculateAverage(List<Double> grades) {
        if (grades.isEmpty())
            return 0;
        double sum = 0;
        for (double grade : grades) 
            sum += grade;
        return sum / grades.size();
    }

    public static String getLetterGrade(double average) {
        if (average >= 90) return "A";
        else if (average >= 80) return "B";
        else if (average >= 70) return "C";
        else if (average >= 60) return "D";
        else return "F";
    }

    public static double getHighest(List<Double> grades) {
        double highest = grades.get(0);
        for (double grade : grades)
            if (grade > highest)
            highest = grade;
        return highest;
    }

    public static double getLowest(List<Double> grades) {
        double lowest = grades.get(0);
        for (double grade : grades)
            if (grade < lowest)
            lowest = grade;
        return lowest;
    }
}