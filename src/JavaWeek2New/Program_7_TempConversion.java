package JavaWeek2New;
/*
 Write a program to insert any temperature value in degree Fahrenheit
  and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

import java.util.Scanner;

public class Program_7_TempConversion {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit : ");
        float temp = scanner.nextFloat();
        //object creation
        Program_7_TempConversion t = new Program_7_TempConversion();
        t.convertTempToDegreeCelsius(temp);
        //closing the scanner object
        scanner.close();


    }
    //Temperature conversion method
    public void convertTempToDegreeCelsius(float temp) {
        float c = ((temp - 32) * 5 / 9);
        System.out.println("The temperature " + temp + " fahrenheit is equal to " + c + " degree celsius");
    }
}
