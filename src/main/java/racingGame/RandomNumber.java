package racingGame;

import utils.ValidationUtils;

public class RandomNumber {

	private int number;

	RandomNumber(int no) {
		if (!ValidationUtils.validRange(no)) {
			throw new IllegalArgumentException();
		}
		this.number = no;
	}
}
