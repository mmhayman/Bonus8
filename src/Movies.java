/**
 * Created by michelhayman on 7/9/17.
 */
public class Movies {

    private String title;
    private String category;

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

@Override
    public String toString () {
        return title;
}

}
