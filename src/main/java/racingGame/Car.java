package racingGame;

import utils.ValidationUtils;

public class Car {

	private String name;
	private int position;

	public Car(String name) {
		if (!ValidationUtils.checkLength(name)) {
			System.out.println("error : 유효하지 않은 이름 길이 입니다.");
			throw new IllegalArgumentException();
		}
		this.name = name;
	}

	public Car(String name, int position) {
		this.name = name;
		this.position = position;
	}

	public String getName() {
		return this.name;
	}

	public int getPosition() {
		return this.position;
	}

	public String getPositionString() {
		String positionString = "";
		for (int i = 0; i < position; i++) {
			positionString = positionString.concat("-");
		}
		return positionString;
	}

	public int race(RandomNumber randomNumber) {
		if (randomNumber.isMovable()) {
			position++;
		}
		return position;
	}
}
