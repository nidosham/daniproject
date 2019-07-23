
package coffe;

import java.util.Scanner;
public class Coffee {

    public static void main(String[] args) {
        int guests = 0; //number of guests
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of guests:");
        guests = scan.nextInt();
        calcCoffee(guests);

    }

    //method to count the number of pounds of coffee needed for given n guests
    public static void calcCoffee(int guests) {
        double coffeAmount;
        coffeAmount = ((double) guests * 2) / 32;
        System.out.println("For " + guests + " guests you will need " + (guests * 32)
                + " cups and " + coffeAmount + " pounds of coffee");
    }
}
