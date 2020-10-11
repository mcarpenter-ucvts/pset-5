import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an letter grade: ");
        String grade = input.nextLine();
        input.close();
        grade = grade.toUpperCase();
        double gpa = -1.00;

        switch (grade) {
            case "A+":
                gpa = 4.33;
                break;

            case "A":
                gpa = 4.00;
                break;

            case "A-":
                gpa = 3.67;
                break;

            case "B+":
                gpa = 3.33;
                break;

            case "B":
                gpa = 3.00;
                break;

            case "B-":
                gpa = 2.67;
                break;

            case "C+":
                gpa = 2.33;
                break;

            case "C":
                gpa = 2.00;
                break;

            case "C-":
                gpa = 1.67;
                break;

            case "D+":
                gpa = 1.33;
                break;

            case "D":
                gpa = 1.00;
                break;

            case "D-":
                gpa = 0.67;
                break;

            case "F":
                gpa = 0;
                break;

            default:
                System.out.println("That's not a valid letter grade.");
                break;
        }
        if (gpa != -1) {
            System.out.println("Your GPA is " + gpa + ".");
        }

    }
}