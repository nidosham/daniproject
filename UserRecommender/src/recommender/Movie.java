
package recommender;

public class Movie extends Item {

    private String genre;
    private String director;
    static int k =0;
    //methods
        public Movie(int id, String n, String d, String g, String dir) {
        super(id, n, d);
        genre = g;
        director = dir;
        System.out.println("Item "+k+" created successfully");
        k++;
    }

    public Movie() {
        System.out.println("Item "+k+" created successfully");
        k++;
    }

    public void set_genre(String g) {
        genre = g;
    }

    public String get_genre(String g) {
        return genre;
    }

    public void set_director(String g) {
        director = g;
    }

    public String get_director(String g) {
        return director;
    }

}
