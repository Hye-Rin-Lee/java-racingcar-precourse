package randomNumber;

import java.util.Random;

public class RandomNumberGenerator {

	public RandomNumber generateNumber() {
		Random random = new Random();
		return new RandomNumber(random.nextInt(8) + 1);
	}
}
