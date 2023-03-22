package JavaWeek2New;
/*
Write a program to convert the upper case to lower case.
 */

import java.util.Scanner;

public class Program_9_ConvertUpperToLowerCase {
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the upper string :");
        String uppercase = scanner.nextLine();
        Program_9_ConvertUpperToLowerCase t = new Program_9_ConvertUpperToLowerCase();
        t.convertUppercaseToLowerCase(uppercase);
        //closing the scanner object
        scanner.close();
    }
    //Conversion of Uppercase to Lower case method
    public void convertUppercaseToLowerCase(String text) {
        System.out.println("The Lowercase value is = " + text.toLowerCase());
    }
}
