import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integers.");
        System.out.println();
        System.out.print("Enter integer: ");
        int first = input.nextInt();
        System.out.print("Enter integer: ");
        int second = input.nextInt();
        System.out.print("Enter integer: ");
        int third = input.nextInt();
        System.out.println();
        input.close();

        if (third > second && third > first) {
            System.out.println("Strictly increasing.");
        }
        else if (third >= second && third >= first) {
            System.out.println("Increasing.");
        }
        else if (first >= second) {
            System.out.println("Decreasing.");
        }
        else {
            System.out.println("Unordered.");
        }
    }
}