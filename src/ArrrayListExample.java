
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



            System.out.print("What category are you interested in? (animated, horror, drama, or scifi)");
            userInput = scan.nextLine();
            userInput.toLowerCase();

            Movies moviesList = new Movies(userInput);

            // loop to get movies
            for (Movies m: moviesList.listofMovies()
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
