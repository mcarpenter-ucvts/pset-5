import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter wage: ");
        double wage = input.nextDouble();
        System.out.print("Enter hours worked: ");
        double hours = input.nextDouble();
        double pay;
        double overtime;
        input.close();

        if (wage < 0 || hours < 0) {
            if (wage < 0) {
                System.out.println("Your wage must be greater than or equal to $0.00/hour.");
            }
            if (hours < 0) {
                System.out.println("Your hours must be greater than or equal to 0.0.");
            }
            System.exit(0);
        }

        if (hours < 40) {
            pay = wage * hours;
            System.out.printf("You'll make $%,.2f this week.", pay);
        }

        if (hours > 40) {
            overtime = hours - 40;
            pay = wage * 40;
            pay = pay + (wage * 1.5 * overtime);
            System.out.printf("You'll make $%,.2f this week.", pay);
        }
    }
}