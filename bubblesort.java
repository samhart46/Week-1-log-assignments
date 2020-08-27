//Samuel Hartman
//Brad Messner
//SCS 290
//Tuesday, Aug 25, 2020
//Work on Array going least to greatest
//below is the link I used to help me understand this problem
//https://youtu.be/Fs

//import scanner
import java.util.Scanner;

public class bubblesort {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//l is referencing the amount of entries in the array
		int l;
		System.out.println("How many number entries do you have?");
		l = input.nextInt();
		//n is referencing the numbers entered
		int n[] = new int[l];
		
		//When the counter is less than length, you are prompted for another number
		for (int counter = 0; counter < l; counter++){
			System.out.println("Enter a digit" + counter+1);
			n[counter] = input.nextInt();
		}input.close();
		
		System.out.println("Your numbers are ");
		
		for (int counter = 0; counter < l; counter++)
		{
			System.out.println(n[counter]);
		}
		
		System.out.println("Your numbers are " + n);
		
		//used to hold onto numbers as they're being sorted
		int temp;
		boolean fixed = false;
		
		while (fixed == false) 
		{
			fixed = true;
			
			for (int i=0; i<n.length-1; i++) 
			{
				//if i is greater than i+1, switch em 
				if(n[i] > n[i+1]) {
					temp = n[i+1];
					n[i+1] = n[i];
					n[i] = temp;
					fixed = false;
				}
			}
		}
		
		for (int i=0; i<n.length; i++)
		{
			System.out.println(n[i]);
		}
	}

}
