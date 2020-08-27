//Samuel Hartman
//Brad Messner
//SCS 290
//Monday, Aug 27, 2020
//Work on calculator example

import java.time.Period;
import java.util.Scanner;

public class CALCULATOR {

	public static void main(String[] args) {
		//Set int for data fields
		String name;
		int inches;
		int feeling;
		int major;
		int year;
				
		Scanner in = new Scanner(System.in);
				
		//get name
		//Collect name and greet the user 
		System.out.println("What is your name?");
		name = in.nextLine();
		System.out.println("Hello " + name + "!");
				
		System.out.println("On a 1-10 scale, how are you today?");
		feeling = in.nextInt();
		if (feeling < 3)
		{
			System.out.println("Awe, im sorry");
		} else
		{
			System.out.println("Good!");
		}

		//I had to go to tutorials to work with this one
		//I am very out of practice programming and hoping it comes back quickly	
		//I've been out of the game too long :(
				
		//get height
		//input inches
		System.out.println("How many inches tall are you?");
		inches = in.nextInt();
		//convert inches to feet
		int feet = inches / 12;
		//convert the remained back to inches
		int left = inches % 12;
		System.out.println("You are " + feet + " feet and " + left + " inches tall ");

	}

}
