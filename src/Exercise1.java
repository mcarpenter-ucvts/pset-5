import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int given = input.nextInt();
        input.close();

        if (given < 0) {
            System.out.println("Negative.");
        }
        else if (given == 0) {
            System.out.println("Zero.");
        }
        else {
            System.out.println("Positive.");
        }
    }
}