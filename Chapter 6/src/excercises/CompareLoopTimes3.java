package excercises;

import java.time.*;

public class CompareLoopTimes3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startTime, endTime;
		final int REPEAT = 100_000;
		final int FACTOR = 1_000_000;
		LocalDateTime now;
		now = LocalDateTime.now();
		startTime = now.getNano();
		for(int x = 0; x <= REPEAT; ++x)
			for(int y = 0; y <= REPEAT; ++y);
		now = LocalDateTime.now();
		endTime = now.getNano();
		for(int x = REPEAT; x >= 0; --x)
			for(int y = REPEAT; y >= 0; --y);
		now = LocalDateTime.now();
		endTime = now.getNano();
		if (endTime - startTime >= 1)
		{
			System.out.println("Time for loops endng with 0: " + ((endTime - startTime) / FACTOR) + " milliseconds");	
		}
		else
		{
			System.out.println("Time for loops endng with 0: 0 milliseconds");
		}
		}

}
