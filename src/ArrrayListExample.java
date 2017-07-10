
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

            System.out.println("What category are you interested in? (animated, horror, drama, scifi)");
            userInput = scan.nextLine();
            userInput.toLowerCase();

            while (!userInput.equalsIgnoreCase("animated") && (!userInput.equalsIgnoreCase("drama") && (!userInput.equalsIgnoreCase("horror") && (!userInput.equalsIgnoreCase("scifi"))))) {

                System.out.println("Invalid entry, please try again (animated, horror, drama, scifi)");
                userInput= scan.nextLine();

            }

            Movies moviesList = new Movies(userInput);

            // loop to get movies
            for (Movies m : moviesList.listofMovies()
                    ) {
                if (userInput.equalsIgnoreCase(m.getCategory())) {
                    System.out.println(m);
                }


            }

            System.out.println();
            System.out.println("Do you want to continue? (y/n)");
            choice = scan.nextLine();
            choice.toLowerCase();


        }

        System.out.println("Goodbye!");


    }

}


