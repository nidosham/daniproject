package zoomonitoring;

/**
 *This program is used to monitor the zoo for animal and habitat categories
 * it reads data from file and allow the user to check an animal or 
 * a habitat to monitor
 *
 */
import java.util.List;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MonitoringSystem {

    static Scanner scanner;

    public static void main(String[] args) {

        while (true) {

            System.out.println("\nWhat would you like to monitor? ");
            System.out.println("Enter 1 to monitor Animals ");
            System.out.println("Enter 2 to monitor Habitats ");
            System.out.print("Enter 3 to Exit\n:");

            int choice = 0;

            // scanneranner reads input from user
            scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            int counter = 0;//tracks the 
           
            //if the input from the user is the number 1
            if (choice == 1)            
            {

                System.out.println("List of Animals ");

                //calls from animals file
                FileReader reader = new FileReader(
                        "C:\\Users\\Danitosh\\Documents\\NetBeansProjects\\"
                                + "Zoomonitoringsystem\\src\\zoomonitoring\\"
                                + "Animals.txt");

              //get the record list of animals category
                List<String> list = reader.getList();
                
                // go through the list and display lines containing details
                for (String line : list) 
                {

                    // if an element (line) in the list contains the words
                    //"Details on"
                    if (line.toLowerCase().contains("Details on".toLowerCase()))
                    {

                        //increase the counter variable that tracks the index
                        //of the list
                        counter = counter + 1;

                        //print out every line that has "details on" substring
                        System.out.println(line);

                    }

                }
                displayAnimal(list, counter);

            } else if (choice == 2)
            {

                System.out.println("List of Habitats ");

                //calls from habitats file
                FileReader reader =
                        new FileReader("C:\\Users\\Danitosh\\Documents\\NetBeansProjects\\Zoomonitoringsystem\\src\\zoomonitoring\\Habitats.txt");

                //rd.getList() reads the content of a list and returns a copy
                List<String> list = reader.getList();

                //loop through the whole list
                for (String line : list) 
                {

                    //search for "details on" in the list's elements
                    if (line.toLowerCase().contains("Details on".toLowerCase())) 
                    {

                        //maintain the position of the line being searched using 
                        //the counter variable
                        counter = counter + 1;

                        //print out every line that has "details on" substring
                        System.out.println(line);

                    }

                }
                displayHabitat(list, counter);
               
            } //if the user chooses the third choice
            else if (choice == 3) {

                //close the scanneranner
                scanner.close();

                //exit the system
                System.exit(0);

            }

        }
    }

    public static void displayAnimal(List<String> list, int counter) 
    {

        String theAnimal;
        //prompt the user for choice of animal
        System.out.print("\nEnter name of animal you would like to monitor: ");
        theAnimal = scanner.next();
        System.out.println();
        
        //loop through the animals category record list
        for (String category : list.subList(counter, list.size()))
        {

            if (category.toLowerCase().contains(theAnimal.toLowerCase())) 
            {

                counter = list.indexOf(category);

                // if an animal is found get display its details
                for (int i = counter; i < counter + 5; i++) 
                {

                    //check for problem that need attention 
                    //alert message if file contains ******--indicating problem
                    if (list.get(i).contains("*****"))
                    {

                        JOptionPane.showMessageDialog(new JFrame(), list.get(i).
                                replace("*****", ""), "ALERT!!!", 
                                JOptionPane.ERROR_MESSAGE);

                        break;

                    } //if the line in the for loop doesn't contain a *****
                    //then print it  
                    else {

                        System.out.println(list.get(i));
                    }
                }
            }
        }

    }

    public static void displayHabitat(List<String> list, int counter) 
    {
        String theHabitat;

        System.out.println("\nEnter the name of a habitat you would like to "
                + "monitor: ");

        //ask user for a habitat name
        theHabitat = scanner.next();
        System.out.println();
        for (String res : list.subList(counter, list.size())) 
        {

            //check if line contains a habitat name
            if (res.toLowerCase().contains(theHabitat.toLowerCase())) 
            {

                counter = list.indexOf(res);

                //get the habitat details
                for (int i = counter; i < counter + 4; i++) 
                {

                    //check if there is problem indicated by "****"
                    if (list.get(i).contains("*****")) 
                    {

                        //raise Alert box
                        JOptionPane.showMessageDialog(new JFrame(), list.get(i).
                                replace("*****", ""), "ALERT!!!",
                                JOptionPane.ERROR_MESSAGE);
                        break;

                    } //if there is no problem in habitat record display the
                    //details
                    else {

                        System.out.println(list.get(i));

                    }

                }

            }

        }

    }
}
