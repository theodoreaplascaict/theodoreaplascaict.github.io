import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);

        System.out.println("Enter your grade for Subject1: ");
        int Average = T.nextInt();

        switch (Average >= 75) {
            case true:
                System.out.println("You Passed!");
                break;
            case false:
                System.out.println("You Failed!");
                break;
        }
        T.close();
    }  
}
