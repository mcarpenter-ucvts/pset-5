import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a playing card: ");
        String card = input.nextLine();
        String rank = card.substring(0,1);
        String suit = card.substring(1);
        suit = suit.toUpperCase();
        rank = rank.toUpperCase();
        input.close();

        switch (suit) {
            case "C":
                suit = "Clubs";
                break;

            case "D":
                suit = "Diamonds";
                break;

            case "H":
                suit = "Hearts";
                break;

            case "S":
                suit = "Spades";
                break;

            default:
                suit = "Invalid";
                break;
        }

        switch (rank) {
            case "2":
                rank = "Two";
                break;

            case "3":
                rank = "Three";
                break;

            case "4":
                rank = "Four";
                break;

            case "5":
                rank = "Five";
                break;

            case "6":
                rank = "Six";
                break;

            case "7":
                rank = "Seven";
                break;

            case "8":
                rank = "Eight";
                break;

            case "9":
                rank = "Nine";
                break;

            case "T":
                rank = "Ten";
                break;

            case "J":
                rank = "Jack";
                break;

            case "Q":
                rank = "Queen";
                break;

            case "K":
                rank = "King";
                break;

            case "A":
                rank = "Ace";
                break;

            default:
                rank = "Invalid";
        }

        if (suit.equals("Invalid") || rank.equals("Invalid")) {
            if (suit.equals("Invalid")) {
                System.out.println("That's not a valid suit.");
            }
            if (rank.equals("Invalid")) {
                System.out.println("That's not a valid rank.");
            }
        }
        else {
            System.out.println(rank + " of " + suit + ".");
        }
    }
}