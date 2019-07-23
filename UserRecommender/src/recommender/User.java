
package recommender;

import java.util.Arrays;

/**
 *
 * @author Danitosh
 */
public class User {
    //data

    private int ID;
    private String name;
    private int n_items;
    private int[] items = new int[100];
    private static int k = 0;

    //methods
    public User() {
        ID = -1;
        name = "";
        n_items = 0;
        System.out.println("User " + k + " created successfully");
        k++;
    }

    public User(int id, String n) {
        ID = id;
        name = n;
        n_items = 0;
        System.out.println("user " + k + " created successfully");
        k++;
    }

    public void add_item(int i) {
        items[n_items] = i;
        n_items++;
    }

    //computes the number of common items between this and u.
    public int similarity(User u) {
        int n = get_n_items();
        int[] uitems = u.get_items();
        int sim = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n_items; j++) {
                if (uitems[i] == items[j]) {
                    sim++;
                    break;
                }
            }
        }
        return sim;
    }

    public int get_ID() {
        return ID;
    }

    public int[] get_items() {
        return items;
    }

    public int get_n_items() {
        return n_items;
    }

    public int set_ID(int i) {
        ID = i;
        return ID;
    }

    @Override
    public String toString() {
        return "User{" + "ID=" + ID;//+ ", name=" + name + ", n_items=" + n_items + ", items=" + items + '}';
    }

}
