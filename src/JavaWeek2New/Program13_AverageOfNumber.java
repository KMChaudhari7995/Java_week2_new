package JavaWeek2New;
/*
Write a Java program that takes three numbers as input to calculate and
 print the average of the numbers.
 */

import java.util.Scanner;

public class Program13_AverageOfNumber {
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        double x= scanner.nextDouble();
        System.out.println("Enter the second number : ");
        double y = scanner.nextDouble();
        System.out.println("Enter the third number : ");
        double z = scanner.nextDouble();
        averageOfThreeNumbers(x,y,z);
        //closing the scanner object
        scanner.close();

    }
    // Calculation the average of three numbers
    public static void averageOfThreeNumbers(double a, double b, double c) {
        double average = (a + b + c) / 3;
        System.out.print("The average of " + a + " , " + b + " and " + c + " is : " + average);
    }

}
