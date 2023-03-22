package JavaWeek2New;
/*
Write a Java program to convert a given string into lowercase.
 Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 Output: the quick brown fox jumps over the lazy dog.

 */

import java.util.Scanner;

public class Program_19_ConvertStringToLowerCase {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase sentence :");
        String uppercase = scanner.nextLine();
        Program_19_ConvertStringToLowerCase t = new Program_19_ConvertStringToLowerCase();
        t.convertStringToLowerCase(uppercase);
        //Closing the scanner object
        scanner.close();
    }
    //convert string the lower case
    public void convertStringToLowerCase(String str )
    {
        System.out.println("The lowercase of the string is = " +str.toLowerCase());
    }

}
