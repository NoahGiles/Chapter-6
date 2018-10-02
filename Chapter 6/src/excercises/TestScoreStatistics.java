package excercises;

import java.util.Scanner;

public class TestScoreStatistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testScore;
		int high = 0;
		int low = 100;
		int avg = 0;
		int count = 0;
		int total = 0;
		int quit = 0;
		Scanner input = new Scanner(System.in);
		
		do
		{
		System.out.println("Please insert a test score >> ");
		testScore = input.nextInt();
		
		if(testScore <= 100 && testScore >= 0)
		{
			if(testScore >= high)
			{
				high = testScore;
				count = count + 1;
				
			}
			if(testScore <= low)
			{
				low = testScore;
				count = count + 1;
			}
		}
		System.out.println("use 999 to quit or another number to continue)");
		quit = input.nextInt();
		total = total + testScore;
				
				
		}while(quit != 999);
		avg = total / count;
		System.out.println("Total number of scores : " + count);
		System.out.println("Low score : " + low);
		System.out.println("High score : " + high);
		System.out.println("Average score : " + avg);
	
	}

}
