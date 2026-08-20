import java.util.Scanner;

public class Color{
    public static void main(String []args){
        Scanner T = new Scanner(System.in);

        System.out.println("Choose your favorite major color and find out what it tells about you: ");
        String color = T.nextLine();
        color = color.trim().toLowerCase();

        switch (color){
            case "blue":
                System.out.println("You are calm and trustworthy.");
                break;
            case "red":
                System.out.println("You are passionate and very trusted.");
                break;
            case "green":
                System.out.println("You are love nature and positive energy.");
                break;
            case "orange":
                System.out.println("You are radiant and carefree and any way.");
                break;
            case "violet":
                System.out.println("You are a special person in your own ways.");
            case "purple":
                System.out.println("Just like violet, you are important and willing for anything.");
                break;
            case "black":
                System.out.println("An aware person, knowing his wareabouts. Extremely self-aware.");
            case "yellow":
                System.out.println("You are the shine to the darkness, a spotlight that catches your glimpse of beauty.");
                break;
            case "gray":
                System.out.println("A unique, intelligent person.");
                break;
            case "pink":
                System.out.println("You are a soft, caring person.");
                break;
            case "indigo":
                System.out.println("Just like blue, you are well-collected.");
                break;
            default:
                System.out.println("That's not one of the Major Colors, silly! xD");
                break;
        }
        T.close();
    }
}
