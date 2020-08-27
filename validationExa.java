//Samuel Hartman
//Brad Messner
//SCS 290
//Monday, Aug 27, 2020
//Work on input validation example

import java.util.Scanner;
public class validationExa {

	public static void main(String[] args) {
		//turn on scanner
		Scanner input = new Scanner(System.in);
		
///////////////////////////////////////
		
		//MUST BE POSITIVE AND AN INT
		int number;
		//prompt for positive number
		do{
			System.out.println("Enter a positive number");
			while (!input.hasNextInt()){
				//if you choose a nonnumber
				System.out.println("That's not a number");
				input.next();
			}
			number = input.nextInt();
		}
		while(number <= 0 );
		System.out.println("Your positive number is " + number);
		
///////////////////////////////////////

		//MUST BE NEGATIVE AND IN INT
		int negNumber;
		//prompt for negative number
		do{
			System.out.println("Enter a negative number");
			while (!input.hasNextInt()){
				//if you choose a nonnumber
				System.out.println("That's not a number");
				input.next();
			}
			negNumber = input.nextInt();
		}
		while(negNumber <= 0 );
		System.out.println("Your negtive number is " + negNumber);
		
///////////////////////////////////////

		//MUST BE PRIME AND 1<X<10
		System.out.println("Enter a prime number below 10");
		
		while (!input.hasNext("[1,2,3,5,7]")) 
		{
			System.out.println("That does not work!");
			System.out.println("PRIME numbers are only divisable by 1 and themselves");
			input.next();
		}
		int prime = input.nextInt();
		System.out.println("Your prime number is" + prime);
		
///////////////////////////////////////
		
		//MUST BE AN UPPERCASE VOWEL
		System.out.println("Enter an uppercase vowel");
		while (!input.hasNext("[A,E,I,O,U]")) 
		{
			System.out.println("That's not a vowel!");
			input.next();
		}
		String vowel = input.next();
		System.out.println("You choose " + vowel);
		
///////////////////////////////////////		
		
		//NO HUMAN IS NEGATIVE YEARS OR MORE THAN 130 YEARS 
		System.out.println("How old are you?");
		
		int age = input.nextInt();
		
		while (age < 0 || age > 130)
		{
			System.out.println("No you're not, don't lie");
			age = input.nextInt();
		}
		System.out.println("You are " + age + " years old");
		
		
		
	}

}
