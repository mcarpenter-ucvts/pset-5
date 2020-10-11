import java.util.Arrays;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a temperature: ");
        String initial = input.nextLine();
        char numbers[] = new char[initial.length()];
        initial = initial.toUpperCase();
        String scale = "none";
        input.close();
        double temperature = 0;

        char[] given = initial.toCharArray();
        for (int k = 0; k < given.length; k++)  {
            if (given[k] == 'C') {
                scale = "Celsius";
                System.arraycopy(given, 0, numbers, 0, k);
                break;
            }
            else if (given[k] == 'F') {
                scale = "Fahrenheit";
                System.arraycopy(given, 0, numbers, 0, k);
                break;
            }
        }

        String values = Arrays.toString(numbers).replace(",","").replace("[", "").replace("]", "").replace(" ", "").trim();

        if (values.matches(".*\\d.*") == true) {
            temperature =  Double.parseDouble(values);
        }
        else {
            System.out.println("That's not a valid scale.");
            System.exit(0);
        }


        if (scale.equals("Celsius")) {
            if (temperature >= 100 ) {
                System.out.println("Gas.");
            }
            else if (temperature < 100 && temperature > 0) {
                System.out.println("Liquid.");
            }
            else if (temperature <= 0) {
                System.out.println("Gas.");
            }
        }
        else if (scale.equals("Fahrenheit")) {
            if (temperature >= 212) {
                System.out.println("Gas.");
            }
            else if (temperature < 212 && temperature > 32) {
                System.out.println("Liquid.");
            }
            else if (temperature <= 32) {
                System.out.println("Solid.");
            }
        }
        else {
            System.out.println("That's not a valid scale.");
        }

    }
}