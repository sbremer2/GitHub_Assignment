//Sara Bremer
//This program is used to demonstrate array functions mixed with previously
//		learned functions relating to initializing variables, loops, and more. 

package helloworld;

import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Sara_Bremer_Week7Assignment {
	
	public static int topTeam;

	public static void main(String[] args) {
		
		int min = 10;
		int max = 99;
		int teams;
		int games;
		String line = "-----------------------------------------------------------------";
		
		System.out.println(line);
		System.out.print("Football Team Randomized Season Scores\n");
		System.out.println(line);
		
	Scanner input = new Scanner(System.in);
	Random rand = new Random();
		
		System.out.print("Enter how many teams your randomized report has: ");
		teams = input.nextInt();
		System.out.print("Enter how many games your randomized report has: ");
		games = input.nextInt();
		System.out.println(line + "\n");
		int[][] twoDArray = new int[teams][games];
//I chose to use the for loop because the user-chosen number of teams and games is a solid number, and for each variable nothing has to be done.
//	Because of that, doing classic iterations that fill each column in the row before moving down the rows is the best option.
	
		for (int i = 0; i < twoDArray.length; i++)
		{
			for (int j = 0; j < twoDArray[i].length; j++)
			{
				twoDArray[i][j] = (int)((Math.random()*((max-min)+1))+min);
				//System.out.print(twoDArray[i][j] + " ");
			}
			//System.out.println();
		}
		int teamNum = 1;
		int scoreTotal = 0;
		topTeam = 0; 
		int highScore = 0; 
		printHeader();
		
		for (int k = 0; k < twoDArray.length; k++)
		{
			System.out.print(teamNum + ":\t");
			
			for (int m = 0; m < games; m++)
			{
					System.out.print(twoDArray[k][m] + " ");
					scoreTotal= scoreTotal + twoDArray[k][m];
					
			}
			System.out.print("\t\t\t" + scoreTotal + "\t");
			System.out.print(scoreTotal / games);
			if (scoreTotal > highScore)
			{
				highScore = scoreTotal;
				topTeam = k+1;
			}
			scoreTotal = 0;
			teamNum++;
			System.out.println();
			
		}
		printFooter();
		
	}
	private static void printHeader()
	{ 
		System.out.println();
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Football Scores Report");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Team\tScores\t\t\t\t\tTot\tAvg");
		System.out.println("-----------------------------------------------------------------");
	}
	private static void printFooter()
	{
		System.out.println("\n-----------------------------------------------------------------");
		System.out.print("Top Team: Team " + topTeam);
		System.out.println("\n-----------------------------------------------------------------");
	}
}
