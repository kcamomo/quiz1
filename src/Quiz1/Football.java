package Quiz1;

import java.util.Scanner;

public class Football {

	public static void main(String[] args){

			Scanner input = new Scanner(System.in);
			int touchdowns;
			double yards;
			int interceptions;
			double completions;
			double numberOfPassAttempts;
			double results;
			double a, b, c, d;
			
			
			System.out.print("Enter the number touchdowns: ");
			touchdowns = input.nextInt();
			
			System.out.print("Enter the number of yards: ");
			yards = input.nextDouble();
			
			System.out.print("Enter the number of interceptions: ");
			interceptions = input.nextInt();
			
			System.out.print("Enter the number of completions: ");
			completions = input.nextDouble();
			
			System.out.print("Enter the number of pass attempts: ");
			numberOfPassAttempts = input.nextDouble();
			
			a = calculate1(completions, numberOfPassAttempts);
			if (a < 0)
				a = 0;
			else if (a > 2.375)
				a = 2.375;
					
			b = calculate2(yards, numberOfPassAttempts);
			if (b < 0)
				b = 0;
			else if (b > 2.375)
				b = 2.375;
			
			c = calculate3(touchdowns, numberOfPassAttempts);
			if (c < 0)
				c = 0;
			else if (c > 2.375)
				c = 2.375;
			
			d = calculate4(interceptions, numberOfPassAttempts);
			if (d < 0)
				d = 0;
			else if (d > 2.375)
				d = 2.375;
			
			results = calculateanswers(a, b, c, d);
			System.out.println("Your passer rating score is: "+ results);
			if (results > 158.3)
				results = 158.3;
			
	}
					
			public static double calculate1(double completions, double numberOfPassAttempts){
				return ((completions/numberOfPassAttempts) - .3) * 5;
			}
			
			public static double calculate2(double yards, double numberOfPassAttempts){
				return ((yards/numberOfPassAttempts) - 3) * .25;
			}
			
			public static double calculate3(int touchdowns, double numberOfPassAttempts){
				return (touchdowns/numberOfPassAttempts) * 20;
			}
			
			public static double calculate4(int interceptions, double numberOfPassAttempts){
				return 2.375 - ((interceptions/numberOfPassAttempts) * 25);
			}
			
			public static double calculateanswers(double a, double b, double c, double d){
				return ((a + b + c + d) / 6) * 100;
			}
		}
			
			
	