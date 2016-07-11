/* Time Conversion Part 2 Week3 
 * Author Lee Tompkins
 * File TimeConversionP2.java
 * Date Jul 10 2016
 * Summary: User inports time in decimal format and program prints out time in hours minutes seconds 
 */



import java.util.Scanner;

public class TimeConversionP2 {

	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in); // create new scanner
			System.out.print("Enter a time in decimal format to print out hours and minutes ");
			double time = input.nextDouble(); // store user input 
			int h = (int) time;
			int m = (int) (time * 60) % 60;
			int s = (int) (time * (60*60)) % 60;

			System.out.println(String.format("%s(hours) %s(minutes) %s(seconds)", h, m, s)); // format variables to hours minutes and seconds 
	} 
}
