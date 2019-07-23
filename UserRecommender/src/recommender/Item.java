
package recommender;

abstract public class Item {
    //data

    protected int ID;
    protected String name;
    protected String description;
  
    //methods
    public Item() {
        
        ID = -1;
        name = "";
        description = "";
        
    }

    public Item(int ID, String n, String d) {
        this.ID = ID;
        this.name = n;
        this.description = d;
        
    }

    public int get_ID() {
        return ID;
    }

    public void set_ID(int i) {
        ID = i;
    }

    public String get_name() {
        return name;
    }

    public void set_name(String i) {
        name = i;
    }

    public String get_desciption() {
        return description;
    }

    public void set_description(String i) {
        description = i;
    }
}
