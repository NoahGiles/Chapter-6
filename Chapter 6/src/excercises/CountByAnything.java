package excercises;

import java.util.Scanner;

public class CountByAnything {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int UserChoice;
		Scanner input = new Scanner(System.in);
		System.out.println("Please pick a number >> ");
		UserChoice = input.nextInt();
	for(int i = UserChoice; i <= (UserChoice * 100); i = i + UserChoice)
	{
		System.out.println(" " + i);
		if(i % (UserChoice * 10) == 0)
		{
			System.out.println();
		}
	}
	}
}
