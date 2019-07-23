package lab4;



import java.util.Scanner;

/**
 * Simple program used to test the method large in the Compare3 class
 * it can compare used to compare int and string values although other
 * 
 */
public class Comparisons {

    /**
     * 
     */
    public static void main(String[] args) {
        //Declare variable
        String str1;
        String str2;
        String str3;
        int num1;
        int num2;
        int num3;
		
		//Get data from the user
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the first string:");
        str1 = scan.nextLine();
        System.out.print("Enter the second string:");
        str2 = scan.nextLine();
        System.out.print("Enter the third string:");
        str3 = scan.nextLine();
        System.out.println("The largest string is :" + Compare3.largest(str1,str2,str3));
        System.out.println();
        System.out.print("Enter the first integer:");
        num1 = scan.nextInt();
        System.out.print("Enter the second integer:");
        num2 = scan.nextInt();
        System.out.print("Enter the third integer:");
        num3 = scan.nextInt();
        System.out.println("The largest integer is :" + Compare3.largest(num1,num2,num3));       
        
    }//end of main method

}//end of class Comparisons