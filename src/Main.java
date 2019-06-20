import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Random r = new Random();
        System.out.println("New user up! Type roll to roll!");
        int dice1 = 0;
        int dice2 = 0;
        int inRow = 0;
        // Change the while loop to 1 == 1 to make the process automated
        while (!read.nextLine().toLowerCase().contains("quit")) {
            while (dice1 == dice2) {
                dice1 = r.nextInt(6) + 1;
                dice2 = r.nextInt(6) + 1;
                System.out.println("You rolled a " + dice1 + " and a " + dice2 + "!" +
                        " Move forward " + (dice1 + dice2) + " spaces!");
                if (dice1 == dice2) {
                    inRow++;
                    if (inRow == 3) {
                        System.out.println("Three doubles in a row! GO TO JAIL!");
                        return;
                    } else {
                        System.out.println("You rolled doubles! Type roll to roll again!");
                        // Comment out this line to make the process automated
                        read.nextLine();
                    }
                }
            }
            System.out.println("New user up! Type roll to roll!");
            dice1 = 0;
            dice2 = 0;
            inRow = 0;
        }
    }
}
