package excercises;

import java.util.Scanner;

public class TestScoreStatistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int TestScore;
		Scanner input = new Scanner(System.in);
		TestScore = input.nextInt();
		
		do
		{
			if(TestScore < 0 || TestScore > 100 && TestScore != 999)
			{
				System.out.println("Error");
			}
		}while(TestScore == 999);
	}

}
