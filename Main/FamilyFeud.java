import java.util.Scanner;
public class FamilyFeud {
    public static void main(String [] args) {
        Scanner T = new Scanner(System.in);

        System.out.println("Welcome to Family Feud!");
        System.out.println("Here is your question, if you are ready, press 1 to continue:");
        int question = T.nextInt();
        int points = 0;

        switch (question) {
            case 1: {
                // ask em som question 1 (food)
                System.out.println("What is the most 'fancy as it sounds'... type of food?");
                System.out.println("1. Spaghetti Meatballs");
                System.out.println("2. Lasagna Supreme");
                System.out.println("3. Carbonara Espada");
                System.out.println("4. Bolognese Alfredo");
                System.out.println("5. Adobo Narisima");
                System.out.print("Please enter your answer (1-5): ");
                int ans1 = T.nextInt();

                switch (ans1) {
                    case 4:
                        points += 10;
                        System.out.println("Correct! You earn 10 points.");
                        break;
                    default:
                        System.out.println("Incorrect. The correct answer was option 4.");
                        break;
                }

                // ask question 2 (paradise)
                System.out.println("What kind of place has... paradise?:");
                System.out.println("1. Beach");
                System.out.println("2. Mountains");
                System.out.println("3. City");
                System.out.println("4. Countryside");
                System.out.println("5. Theme Park");
                System.out.print("Please enter your answer (1-5): ");
                int ans2 = T.nextInt();
                switch (ans2) {
                    case 1:
                        points += 10;
                        System.out.println("Correct! You earn 10 points.");
                        break;
                    default:
                        System.out.println("Incorrect. The correct answer was option 1.");
                        break;
                }

                // ask question 3 (easiest subject)
                System.out.println("What is the literal easiest subject?");
                System.out.println("1. R&W");
                System.out.println("2. Pagbasa");
                System.out.println("3. ICT");
                System.out.println("4. Stats");
                System.out.println("5. PR1");
                System.out.print("Please enter your answer (1-5): ");
                int ans3 = T.nextInt();
                switch (ans3) {
                    case 2:
                        points += 10;
                        System.out.println("Correct! You earn 10 points.");
                        break;
                    default:
                        System.out.println("Incorrect. The correct answer was option 2.");
                        break;
                }
                break;
            }
            case 2: {
                // single question set 2 (paradise)
                System.out.println("What kind of place has... paradise?:");
                System.out.println("1. Beach");
                System.out.println("2. Mountains");
                System.out.println("3. City");
                System.out.println("4. Countryside");
                System.out.println("5. Theme Park");
                System.out.print("Please enter your answer (1-5): ");
                int a3 = T.nextInt();
                switch (a3) {
                    case 1:
                        points += 10;
                        System.out.println("Correct! You earn 10 points.");
                        break;
                    default:
                        System.out.println("Incorrect. The correct answer was option 1.");
                        break;
                }
                // ask em som question 1 (food)
                System.out.println("What is the most 'fancy as it sounds'... type of food?");
                System.out.println("1. Spaghetti Meatballs");
                System.out.println("2. Lasagna Supreme");
                System.out.println("3. Carbonara Espada");
                System.out.println("4. Bolognese Alfredo");
                System.out.println("5. Adobo Narisima");
                System.out.print("Please enter your answer (1-5): ");
                int ans1 = T.nextInt();

                switch (ans1) {
                    case 4:
                        points += 10;
                        System.out.println("Correct! You earn 10 points.");
                        break;
                    default:
                        System.out.println("Incorrect. The correct answer was option 4.");
                        break;
                }
                System.out.println("What is the literal easiest subject?");
                System.out.println("1. R&W");
                System.out.println("2. Pagbasa");
                System.out.println("3. ICT");
                System.out.println("4. Stats");
                System.out.println("5. PR1");
                System.out.print("Please enter your answer (1-5): ");
                int a1 = T.nextInt();
                switch (a1) {
                    case 2:
                        points += 10;
                        System.out.println("Correct! You earn 10 points.");
                        break;
                    default:
                        System.out.println("Incorrect. The correct answer was option 2.");
                        break;
                }
                break;
            }
            case 3: {
                // single question set 3 (easiest subject)
                System.out.println("What is the literal easiest subject?");
                System.out.println("1. R&W");
                System.out.println("2. Pagbasa");
                System.out.println("3. ICT");
                System.out.println("4. Stats");
                System.out.println("5. PR1");
                System.out.print("Please enter your answer (1-5): ");
                int a1 = T.nextInt();
                switch (a1) {
                    case 2:
                        points += 10;
                        System.out.println("Correct! You earn 10 points.");
                        break;
                    default:
                        System.out.println("Incorrect. The correct answer was option 2.");
                        break;
                }
                // ask em som question 1 (food)
                System.out.println("What is the most 'fancy as it sounds'... type of food?");
                System.out.println("1. Spaghetti Meatballs");
                System.out.println("2. Lasagna Supreme");
                System.out.println("3. Carbonara Espada");
                System.out.println("4. Bolognese Alfredo");
                System.out.println("5. Adobo Narisima");
                System.out.print("Please enter your answer (1-5): ");
                int ans1 = T.nextInt();

                switch (ans1) {
                    case 4:
                        points += 10;
                        System.out.println("Correct! You earn 10 points.");
                        break;
                    default:
                        System.out.println("Incorrect. The correct answer was option 4.");
                        break;
                }
                System.out.println("What kind of place has... paradise?:");
                System.out.println("1. Beach");
                System.out.println("2. Mountains");
                System.out.println("3. City");
                System.out.println("4. Countryside");
                System.out.println("5. Theme Park");
                System.out.print("Please enter your answer (1-5): ");
                int a3 = T.nextInt();
                switch (a3) {
                    case 1:
                        points += 10;
                        System.out.println("Correct! You earn 10 points.");
                        break;
                    default:
                        System.out.println("Incorrect. The correct answer was option 1.");
                        break;
                }
                break;
            }
            default:
                System.out.println("Invalid selection.");
                break;
        }

        System.out.println("Your total score is: " + points + " points.");
        T.close();
    }
}
    


