import java.util.Scanner;

public class ScannerReturnExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for starting number
        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        // Ask user for the number where it should end
        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        int counter = start;

        while (true) { // endless loop
            System.out.println("Counter = " + counter);
            counter++;

            if (counter > end) {
                System.out.println("Reached the end number, exiting program!");
                return; // stops the program completely
            }
            sc.close();
        }
    }
}
