package recommender;

import java.util.Scanner;
import java.io.*;

public abstract class Recommender {

    protected User[] users = new User[15];
    protected Item[] items = new Item[20];

    //=========================
    //=========================
    //reads items from a file
    protected void read_items(String file_name) {
        /*
		1. Open the file
		2. Read file line by line
		3. For each line, 
			Extract ID, Name, & Genre
			Create a Movie object
			Set Item ID, Name & Genre
			Add the Movie object into the Items[] items
		6. Close the file
         */

        int id;
        String name, genre;
        try {

            File f = new File(file_name);

            Scanner s = new Scanner(f);
            int k = 0;
            while (s.hasNext()) {
                String[] vals = (s.nextLine()).split(",");
                id = Integer.parseInt(vals[0].trim());
                name = vals[1].trim();
                genre = vals[2].trim();                
                Movie newMovie = new Movie();
                newMovie.set_ID(id);
                newMovie.set_genre(genre);
                newMovie.set_name(name);
                items[k] = (Item) newMovie;
                k++;
            }
            s.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //=========================
    //=========================
    protected void read_users(String file_name) {
        /*
		1. Open the file
		2. Read file line by line
		3. For each line, 
			Extract ID, n_items
			For i = 0 to n_items
				Extract the Movie IDs
			Create a User Object
			Set User ID, n_items, and add all items to that user.
			Add the User object into the Users[] users
		4. Close the file
         */

        int userId;
        int n_items;

        try {
            File f = new File(file_name);

            Scanner s = new Scanner(f);
            int k = 0;
            while (s.hasNext()) {
                String[] vals = (s.nextLine()).split(" ");;
                userId = Integer.parseInt(vals[0]);
                User newUser = new User();
                newUser.set_ID(userId);

                for (int i = 1; i < vals.length; i++) {
                    newUser.add_item(Integer.parseInt(vals[i]));
                }

                users[k] = newUser;
                k++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //=========================
    //=========================
    public User[] get_users() {
        return users;
    }

    //=========================
    //=========================
    public Item[] get_items() {
        return items;
    }

    //=========================
    //=========================
    public abstract void make_recommendations();

}
