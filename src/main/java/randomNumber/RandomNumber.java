package randomNumber;

import utils.ValidationUtils;

public class RandomNumber {

	private int number;

	public RandomNumber(int no) {
		if (!ValidationUtils.validRange(no)) {
			System.out.println("error : 유효하지 않은 숫자 범위 입니다.");
			throw new IllegalArgumentException();
		}
		this.number = no;
	}

	public boolean isMovable(){
		return number >=4;
	}
}
