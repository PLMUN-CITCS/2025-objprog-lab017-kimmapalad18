import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        double score = getStudentScore();
        String grade = calculateGrade(score);
        System.out.println("Your Grade is: " + grade);
    }

    public static double getStudentScore() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next(); // consume the invalid input
            System.out.print("Enter your score: ");
        }
        return scanner.nextDouble();
    }

    public static String calculateGrade(double score) {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}