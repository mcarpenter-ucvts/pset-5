import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int given = input.nextInt();
        input.close();

        if (given%2 == 0) {
            System.out.println("Even.");
        }
        else {
            System.out.println("Odd.");
        }
    }
}