package question1;

import java.util.Scanner;

public class ComputeQBRating {
	public static void main(String[] args) {
		
		//Create a Scanner object
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//Prompt user for input for each of the five stats
		System.out.print("Enter stats: ");
		int comp = input.nextInt();
		int yds = input.nextInt();
		int td = input.nextInt();
		int intcptns = input.nextInt();
		int att = input.nextInt();
		
		//compute completion percentage
		double a = ((comp/att) - .3) * 5.0; 
		
		//compute yards per attempt
		double b = ((yds/att) - 3.0) * .25;
		
		//compute touchdowns per attempt
		double c = (td/att) * 20.0;
		
		//compute interceptions per attempt
		double d = 2.375 - ((intcptns/att) * 25.0);
		
		//Compute QB Rating
		double QB_Rating = ((a + b + c + d)/6) * 100.0;
		
		//Display results
		System.out.println("The QB Rating is " + QB_Rating);

	}
}

