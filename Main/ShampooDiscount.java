import java.util.Scanner;

public class ShampooDiscount {
    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);

        System.out.print("Enter the number of premium shampoo bottles purchased: ");
        double purchase = T.nextDouble();

        double pricePerBottle = 500.0;
        double totalAmount = purchase * pricePerBottle;
        double twentyPercentDiscount = 0.20;
        double tenPercentDiscount = 0.10;
        double discount = 0.0;
        
        if (totalAmount >= 5000) {
            System.out.println("We are giving YOU a 20% discount! HUZZAH!!!.");
            discount = twentyPercentDiscount;
        } else if (totalAmount >= 2000) {
            System.out.println("We are giving YOU a 10% discount!.");
            discount = tenPercentDiscount;
        } else if (totalAmount < 2000) {
            System.out.println("Sold!");
        } 

        double finalPrice = totalAmount - (totalAmount * discount);

        System.out.println("Thanks for Shopping with us! You purchased our products worth: " + finalPrice + " pesos.");

        T.close();
    }
}
