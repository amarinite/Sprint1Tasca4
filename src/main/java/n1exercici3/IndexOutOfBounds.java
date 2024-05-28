package n1exercici3;

import java.util.Scanner;

public class IndexOutOfBounds {
    public static void main(String[] args) {
        String[] seasons = {"spring", "summer", "autumn", "winter"};

        Scanner scanner = new Scanner(System.in);
        int option = 0;

        try {
            System.out.println("Choose a season:\n"
                    + "1. Spring\n"
                    + "2. Summer\n"
                    + "3. Autumn\n"
                    + "4. Winter");
            option = scanner.nextInt();
            System.out.println("You've chosen " + getElementFromArr(option, seasons));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("You need to pick a number between 1 and 4");
        }
    }

    public static String getElementFromArr(int option, String[] seasons) throws IndexOutOfBoundsException {
        return seasons[option - 1];
    }
}
