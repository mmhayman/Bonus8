import java.util.ArrayList;

/**
 * Created by michelhayman on 7/9/17.
 */
public class Movies {

    private String title;
    private String category;

    public Movies(String userInput) {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Movies (String title, String category) {
        this.title = title;
        this.category = category;
    }

    public ArrayList<Movies> listofMovies () {

        ArrayList<Movies> movieList = new ArrayList<>();

        // array list with movie titles and category

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

        return movieList;
    }

    @Override
    public String toString () {
        return title;
    }

}