import java.util.Scanner;

public class Peta {
    public static void main(String[] args) {
        Scanner T = new Scanner(System.in);

        
        System.out.println("Welcome to Family Feud!");
        System.out.println("Here is your question:");
        System.out.println("What is the easiest thing to do with a book?");
        System.out.println("First letter clues: R, O, H, L, F. Input your answers in lowercase.");
        
                String ans1 = T.nextLine();
                int points = 0;
            switch (ans1) {
                    case "read":
                        points += 10;
                        System.out.println("Correct! You earn 10 points.");
                        break;
                    case "open":
                        points += 8;
                        System.out.println("Correct! You earn 8 points.");
                        break;
                    case "hold":
                        points += 6;
                        System.out.println("Correct! You earn 6 points.");
                        break;
                    case "look":
                        points += 4;
                        System.out.println("Correct! You earn 4 point.");
                        break;
                    case "flip":
                        points += 2;
                        System.out.println("Correct! You earn 2 points.");
                        break;
                    default:
                        System.out.println("Stop. Invalid Answer!: ");
                        T.close();
                        break;
                        
                }
            System.out.println("Give 4 more answers for the question: ");
            System.out.println("What is the easiest thing to do with a book?");
            String ans2 = T.nextLine();
            switch (ans2) {
                    case "open":
                        points += 10;
                        System.out.println("Correct! You earn 10 points.");
                    case "hold":
                        points += 8;
                        System.out.println("Correct! You earn 8 points.");
                        break;
                    case "flip":
                        points += 6;
                        System.out.println("Correct! You earn 6 points.");
                        break;
                    case "look":
                        points += 4;
                        System.out.println("Correct! You earn 4 points.");
                        break;
                    default:
                        System.out.println("Stop! Invalid Answer.: ");
                        break;
                }

            System.out.println("Give 3 more answers for the question: ");
            System.out.println("What is the easiest thing to do with a book?");
            String ans3 = T.nextLine();
            switch (ans3) {
                    case "hold":
                        points += 10;
                        System.out.println("Correct! You earn 10 points.");
                        break;
                    case "flip":
                        points += 8;
                        System.out.println("Correct! You earn 8 points.");
                        break;
                    case "look":
                        points += 6;
                        System.out.println("Correct! You earn 6 points.");
                        break;
                    default:
                        System.out.println("Stop! Invalid Answer.: ");
                        break;
                }
            System.out.println("Give 2 more answers for the question: ");
            System.out.println("What is the easiest thing to do with a book?");
            String ans4 = T.nextLine();
            switch (ans4) {
                    case "flip":
                        points += 10;
                        System.out.println("Correct! You earn 10 points.");
                        break;
                    case "look":
                        points += 8;
                        System.out.println("Correct! You earn 8 points.");
                        break;
                    default:
                        System.out.println("Stop! Invalid Answer.: ");
                        break;
                }
                System.out.println("Give 1 more answer for the question: ");
            System.out.println("What is the easiest thing to do with a book?");
            String ans5 = T.nextLine();
            switch (ans5) {
                    case "look":
                        points += 10;
                        System.out.println("Correct! You earn 10 points.");
                        break;
                    default:
                        System.out.println("Stop! Invalid Answer.: ");
                        break;
                }

        System.out.println("Your total points: " + points);
            T.close();
    }
}
