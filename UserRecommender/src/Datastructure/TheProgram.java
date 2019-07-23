/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datastructure;

import java.util.Scanner;

public class TheProgram {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two scores one at a time");
        int i = scan.nextInt();
        int j = scan.nextInt();
        double average = calAverage(i, j);
        System.out.println("The grade is " + determineGrade(average));

    }

    public static double calAverage(double n, double m) {
        double average = 0;
        average = (n + m) / 2;
        return average;

    }

    public static char determineGrade(double average) {
        char grade = 'F';
        if (average > 90) {
              grade = 'A';
        } else if (average > 80) {
             grade = 'B';
        } else if (average > 70) {
             grade = 'C';
        } else if (average > 60) {
            grade = 'D';
        } else if (average < 50) {
            grade = 'F';
        }
        return grade;
    }

}
