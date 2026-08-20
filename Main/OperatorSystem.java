import java.util.Scanner;

public class OperatorSystem {
    public static void main(String[] args) {

        Scanner TV = new Scanner(System.in);
        String regUsername = "";
        String regPassword = "";
        String loginUsername;
        String loginPassword;

        System.out.println("=== TODA SYSTEM ===");
        System.out.println("1 - Register");
        System.out.println("2 - Login");
        System.out.print("Choose option: ");
        int option = TV.nextInt();
        TV.nextLine();

        switch (option) {

            case 1:
                System.out.print("Create username: ");
                regUsername = TV.nextLine();

                System.out.print("Create password: ");
                regPassword = TV.nextLine();

                System.out.println("Registration successful!");
                System.out.println("Please login.");

                while (true) {
                    System.out.print("Enter username: ");
                    loginUsername = TV.nextLine();

                    System.out.print("Enter password: ");
                    loginPassword = TV.nextLine();
                    if (loginUsername.equals(regUsername) && loginPassword.equals(regPassword)) {
                        System.out.println("Login successful! Welcome Operator.");
                        break;
                    } else {
                        System.out.println("Wrong username or password. Try again.\n");
                    }
                }
                break;

            case 2:
                if (regUsername.equals("")) {
                    System.out.println("No account found. Please register first.");

                    System.out.print("Create username: ");
                    regUsername = TV.nextLine();

                    System.out.print("Create password: ");
                    regPassword = TV.nextLine();

                    System.out.println("Registration successful!");
                }

                while (true) {
                    System.out.print("Enter username: ");
                    loginUsername = TV.nextLine();
                    System.out.print("Enter password: ");
                    loginPassword = TV.nextLine();
                    if (loginUsername.equals(regUsername) && loginPassword.equals(regPassword)) {
                        System.out.println("Login successful! Welcome Operator.");
                        break;
                    } else {
                        System.out.println("Wrong username or password. Try again.");
                    }
                }
                break;
            default:
                System.out.println("Invalid option.");
        }

        TV.close();
    }
}