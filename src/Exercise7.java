import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int year = input.nextInt();
        input.close();

        if (year < 0) {
            System.out.println("Please enter a positive value for the question.");
        }
        else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println(year + " is a leap year.");
                    }
                    else {
                        System.out.println(year + " is not a leap year.");
                    }
                }
                else {
                    System.out.println(year + " is a leap year.");
                }
            }
            else {
                System.out.println(year + " is not a leap year.");
            }

        }
    }
}