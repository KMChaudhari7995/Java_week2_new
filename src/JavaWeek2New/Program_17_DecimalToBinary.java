package JavaWeek2New;
/*
 Write a Java program to convert a decimal number to binary number.
 * Input Data:
 * Input a Decimal Number : 5
 * Expected Output
 * Binary number is: 101
 */

import java.util.Scanner;

public class Program_17_DecimalToBinary {
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        System.out.println("Welcome to Java Program to convert decimal number to binary number :");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the decimal value :");
        int number = scanner.nextInt();
        convertDecimalToBinary(number);
        //closing the scanner object
        scanner.close();
    }

    //converting decimal to binary
    public static void convertDecimalToBinary(int number)
    {
        String binary = Integer.toBinaryString(number);
        System.out.println("The binary value is :" +binary);
    }







}
