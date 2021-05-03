package racingGame;

import utils.ValidationUtils;

public class RandomNumber {

	private int number;

	public RandomNumber(int no) {
		if (!ValidationUtils.validRange(no)) {
			throw new IllegalArgumentException();
		}
		this.number = no;
	}

	public boolean isMovable(){
		return number >=4;
	}
}
