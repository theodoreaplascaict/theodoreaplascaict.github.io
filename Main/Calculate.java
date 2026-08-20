import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);

        System.out.println("Enter the units consumed of your electricity please: ");
        double units = T.nextDouble();

        double zerotohundred = units * 5;
        double hundredoneto200 = units * 7;
        double above200 = units * 10;

        if (units <= 100) {
            System.out.println("Your total electricity bill is: " + zerotohundred + " pesos.");
        } else if (units > 100 && units <= 200) {
            System.out.println("Your total electricity bill is: " + hundredoneto200 + " pesos.");
        } else if (units > 200) {
            System.out.println("Your total electricity bill is: " + above200 + " pesos.");
        } 
        T.close();
    }
}