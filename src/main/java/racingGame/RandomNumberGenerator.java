package racingGame;

import java.util.Random;

public class RandomNumberGenerator {

	public RandomNumber generateNumber() {
		Random random = new Random();
		int no = random.nextInt(8) + 1;
		System.out.println("generated no : " + no);
		return new RandomNumber(no);
	}
}
