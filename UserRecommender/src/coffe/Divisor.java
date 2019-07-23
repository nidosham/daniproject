/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffe;

import java.util.Scanner;

/**
 *
 * @author Danitosh
 */
public class Divisor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number ");
        int num1 = scan.nextInt();
        System.out.println("Enter the second number");
        int num2 = scan.nextInt();
        calcQuentientModulus(num1, num2);

    }

    public static void calcQuentientModulus(int n1, int n2) {
        int quotient = 0;
        int modulus = 0;
        quotient = n1 / n2;
        modulus = n1 % n2;
        System.out.println("The quetient for " + n1 + " and " + n2 + " is " + quotient);
        System.out.println("The modulus for " + n1 + " and " + n2 + " is " + modulus);

    }
}
