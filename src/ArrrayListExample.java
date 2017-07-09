import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by michelhayman on 7/9/17.
 */
public class ArrrayListExample {

    public static void main(String[] args) {

        String choice = "y";

        System.out.println("Welcome to the Movie List Application");
        System.out.println();
        System.out.println("There are 10 movies in this list. ");

        while (choice.equalsIgnoreCase("y")) {

            Scanner scan = new Scanner(System.in);

            String userInput = " ";


            ArrayList<Movies> movieList = new ArrayList<Movies>();

            movieList.add(new Movies("The Boss Baby", "Animated"));
            movieList.add(new Movies("Cars 3", "Animated"));
            movieList.add(new Movies("Live by Night", "Drama"));
            movieList.add(new Movies("Hidden Figures", "Drama"));
            movieList.add(new Movies("Gifted", "Drama"));
            movieList.add(new Movies("Get Out", "Horror"));
            movieList.add(new Movies("It Comes at Night", "Horror"));
            movieList.add(new Movies("Flatliners", "Horror"));
            movieList.add(new Movies("Wonder Woman", "Scifi"));
            movieList.add(new Movies("Logan", "Scifi"));


            System.out.println("What category are you interested in? (animated, horror, drama, or scifi)");
            userInput = scan.nextLine();
            userInput.toLowerCase();

            if (userInput.equalsIgnoreCase("animated")) {
                System.out.println(movieList.get(0));
                System.out.println(movieList.get(1));

            }
            if (userInput.equalsIgnoreCase("drama")) {
                System.out.println(movieList.get(2));
                System.out.println(movieList.get(3));
                System.out.println(movieList.get(4));
            }

            if (userInput.equalsIgnoreCase("horror")) {
                System.out.println(movieList.get(5));
                System.out.println(movieList.get(6));
                System.out.println(movieList.get(7));
            }

            if (userInput.equalsIgnoreCase("scifi")) {
                System.out.println(movieList.get(8));
                System.out.println(movieList.get(9));
            }


            System.out.println("Do you want to continue? (y/n)");
            choice = scan.nextLine();
            choice.toLowerCase();


        }
        System.out.println("Goodbye!");

    }


}

