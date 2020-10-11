import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a month: ");
        String month = input.nextLine();
        input.close();
        month = month.toUpperCase();

        switch (month) {
            case "JANUARY":
            case "MARCH":
            case "MAY":
            case "JULY":
            case "AUGUST":
            case "OCTOBER":
            case "DECEMBER":
                System.out.println("31 days.");
                break;

            case "FEBRUARY":
                System.out.println("28 or 29 days.");
                break;

            case "APRIL":
            case "JUNE":
            case "SEPTEMBER":
            case "NOVEMBER":
                System.out.println("30 days.");
                break;

            default:
                System.out.println("That's not a valid month.");
                break;
        }
    }
}