package GameZone;

import java.util.Scanner;

public class Quiz {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userInput;
		int correct = 0;
		Scanner input = new Scanner(System.in);
		do {
			
		System.out.println("Question 1 : What is the diameter of the Earth?\n1. 15,000 miles\n2. 7,900 miles\n3. 9,000 miles\n4. 113,000 miles");
		userInput = input.nextInt();
			if(userInput == 2)
				userInput = correct;
			else
				System.out.println("Wrong.");
		System.out.println("Question 2 : How many moons orbit Jupiter?\n1. 5\n2. 30\n3. ")
		
	}while(userInput == correct);
	}
}
