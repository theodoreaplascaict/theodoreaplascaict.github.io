import java.util.Scanner;

public class passengerTypeSelection {
    public static void main(String[] args) {
        Scanner TV = new Scanner(System.in);

        int passengerType;
        do {
            System.out.println("Input type of Passenger:");
            System.out.println("0 - Exit Program");
            System.out.println("1 - Regular");
            System.out.println("2 - Student (20% discount)");
            System.out.println("3 - Senior Citizen (20% discount)");
            System.out.println("4 - PWD (20% discount)");
            System.out.println("5 - Pregnant Women (20% discount)");
            System.out.println("6 - Solo Parent (20% discount)");
            System.out.print("Input: ");

            while (!TV.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 6.");
                TV.next();
                System.out.print("Input: ");
            }

            passengerType = TV.nextInt();

            if (passengerType == 0) {
                System.out.println("Exiting program.");
                TV.close();
                return;
            }

            if (passengerType < 1 || passengerType > 6) {
                System.out.println("Invalid Passenger Type. Kindly input the correct passenger (or 0 to quit).");
            } else {
                break;
            }
        } while (true);

        switch(passengerType) {
            case 1:
                System.out.println("You selected Regular Passenger. No discount applied.");
                break;
            case 2:
                System.out.println("You selected Student Passenger. 20% discount applied.");
                break;
            case 3:
                System.out.println("You selected Senior Citizen Passenger. 20% discount applied.");
                break;
            case 4:
                System.out.println("You selected PWD Passenger. 20% discount applied.");
                break;
            case 5:
                System.out.println("You selected Pregnant Women Passenger. 20% discount applied.");
                break;
            case 6:
                System.out.println("You selected Solo Parent Passenger. 20% discount applied.");
                break;
            default:
                System.out.println("Invalid Passenger Type. Kindly input the correct passenger.");
               break;
        }

        int numPassengers;

        // Prompt for number of passengers (1-4). 0 to quit.
        do {
            System.out.print("Enter number of passengers (1-4, or 0 to quit): ");

            while (!TV.hasNextInt()) {
                System.out.println("Invalid input. Please enter a numeric value.");
                TV.next();
                System.out.print("Enter number of passengers (1-4, or 0 to quit): ");
            }

            numPassengers = TV.nextInt();

            if (numPassengers == 0) {
                System.out.println("Exiting program.");
                TV.close();
                return;
            }

            if (numPassengers < 1 || numPassengers > 4) {
                System.out.println("Invalid number of passengers. Please enter between 1 and 4.");
            } else {
                break;
            }
        } while (true);

        // Calculate fare based on passenger type and count
        double fare = 0.0;
        boolean hasDiscount = (passengerType >= 2 && passengerType <= 6);

        if (numPassengers == 1) {
            // Fixed fare for single
            //  passenger
            if (hasDiscount) {
                fare = 10.0;
                System.out.println("Single passenger with discount: 10 Pesos");
            } else {
                fare = 30.0;
                System.out.println("Single regular passenger: 30 Pesos");
            }
        } else {
            // Per-head fare for 2 or more passengers
            if (hasDiscount) {
                fare = 10.0 * numPassengers;
                System.out.println("Group with discount: 10 Pesos per head = " + fare + " Pesos (for " + numPassengers + " passengers)");
            } else {
                fare = 12.0 * numPassengers;
                System.out.println("Group regular passengers: 12 Pesos per head = " + fare + " Pesos (for " + numPassengers + " passengers)");
            }
        }

        System.out.println("Initial Fare: " + fare + " Pesos");

        TV.close();
    }
}

