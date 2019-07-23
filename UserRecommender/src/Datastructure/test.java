

import java.util.*;

public class test {

    Contacts l;

    public static void main(String[] args) {
        Contacts l = new Contacts();
        /*try {*/
            Scanner k = new Scanner(System.in);
            boolean ans = true;
            do {
                System.out.println("#ENTER THE NUMBER OF SERVICE\n\t1.New Contact\n\t2.Change Number\n\t3.delete contact\n\t4.Search for contact\n\t5.Print contacts");

                int choice = k.nextInt();
                switch (choice) {
                    case 1:
                        String name, address, rel;
                        int number;

                        System.out.println("\tEnter name\n\tAnd address\n\tAnd relation\n\tAnd number");
                        l.newContact(name = k.next(), address = k.next(), rel = k.next(), number = k.nextInt());
                        break;

                    case 2:
                        System.out.println("Enter your the name ,old number then the new number");
                        l.changePhone(k.next(), k.nextInt(), k.nextInt());
                        break;

                    case 3:
                        System.out.println("Enter the name of the contact you want to delete");
                        l.delete(k.next());
                        break;
                    case 4:
                        System.out.println("Enter name to search for in contacts");
                        l.sort();
                        l.searchByName(k.next());
                        break;
                    case 5:
                        l.print();

                        break;
                    default:
                        System.out.println("incorrect input");

                }

                System.out.println("#DO YOU NEED ANOTHER SERVICE? (type true if YES and false if NO)");
                ans = k.nextBoolean();

            }// while (ans == true);
        } catch (InputMismatchException e) {
            System.out.println("invalid input value!");
        }

    }

   

}
