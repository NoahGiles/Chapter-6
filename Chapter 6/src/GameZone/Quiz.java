package GameZone;

import java.util.Scanner;

public class Quiz {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userInput = 1;
		int correct = 0;
		int wrongCount = 0;
		Scanner input = new Scanner(System.in);
		while(correct != 4){
			
		System.out.println("Question 1 : What is the diameter of the Earth?\n1. 15,000 miles\n2. 7,900 miles\n3. 9,000 miles\n4. 113,000 miles");
		userInput = input.nextInt();
			if(userInput == 2)
				correct++;
			else if(userInput != 2) {
				wrongCount++;
				System.out.println("Wrong.");
			}
		System.out.println("Question 2 : How many moons orbit Jupiter?\n1. 5\n2. 30\n3. 79\n4. 1,000");
		userInput = input.nextInt();
		if(userInput == 3)
			correct++;
		else if (userInput != 3) {
			wrongCount = wrongCount++;
			System.out.println("Wrong.");
		}
			System.out.println("Question 3 : When did the Chernobyl disaster happen?\n1. 2003\n2. 1876\n3. 1638\n4. 1986");
			userInput = input.nextInt();
			if(userInput == 4)
				correct++;
			else if (userInput != 4) {
				wrongCount = wrongCount++;
				System.out.println("Wrong.");
				
			}
			System.out.println("Question 4 : How many presidents has there been?\n1. 11\n2. 22\n3. 43\n4. 89");
			userInput = input.nextInt();
			if(userInput == 3)
				correct++;
			else if (userInput != 3) {
				wrongCount = wrongCount++;
				System.out.println("Wrong.");
			}
			if(correct != 4) {
				correct = 0;
			}
			System.out.println("You got " + wrongCount + " answers wrong.");
		}
		
		
	}
}
