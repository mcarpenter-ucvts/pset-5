import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a grade: ");
        double grade = input.nextDouble();
        grade = Math.round(grade);
        input.close();

        if (grade <= 100 && grade >= 90) {
            System.out.println("You received an A.");
        }
        if (grade < 90 && grade >= 80) {
            System.out.println("You received a B.");
        }
        if (grade < 80 && grade >= 70) {
            System.out.println("You received a C.");
        }
        if (grade < 70 && grade >= 60) {
            System.out.println("You received a D.");
        }
        if (grade < 60 && grade >= 0) {
            System.out.println("You received an F.");
        }
        if (grade < 0) {
            System.out.println("Grades below 0 are invalid.");
        }
        if (grade > 100) {
            System.out.println("Grades above 100 are invalid.");
        }
    }
}