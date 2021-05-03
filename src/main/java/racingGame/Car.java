package racingGame;

import utils.ValidationUtils;

public class Car {

	private String name;
	private int position;

	public Car(String name) {
		if (!ValidationUtils.checkLength(name)) {
			throw new IllegalArgumentException();
		}
		this.name = name;
		this.position = 0;
	}

	public String getName() {
		return this.name;
	}

	public int getPosition(){
		return this.position;
	}

	public void race(RandomNumber randomNumber) {
		if (randomNumber.isMovable()) {
			position++;
		}
	}
}
