package racingGame;

import java.util.ArrayList;
import java.util.List;

public class Cars {

	private List<Car> cars = new ArrayList<>();
	private int maxPosition = 0;

	public Cars(List<Car> cars) {
		this.cars = cars;
	}

	public Cars(String carNames) {
		String[] names = carNames.split(",");
		for (int i = 0; i < names.length; i++) {
			cars.add(new Car(names[i]));
		}
	}

	public List<Car> getCars() {
		return cars;
	}

	public int getMaxPosition() {
		for (Car car : cars) {
			if (maxPosition < car.getPosition()) {
				increaseMaxPosition(car.getPosition());
			}
		}
		return maxPosition;
	}

	private void printResult() {
		for (Car car : cars) {
			System.out.println(car.getName() + " : " + car.getPositionString());
		}
		System.out.println("");
	}

	public void race(RandomNumberGenerator generator) {
		for (Car car : cars) {
			int position = car.race(generator.generateNumber());
			increaseMaxPosition(position);
		}
		printResult();
	}

	private void increaseMaxPosition(int position) {
		if (maxPosition < position) {
			maxPosition = position;
		}
	}

	public void getWinners() {
		List<Car> winnerList = new ArrayList<>();
		for (Car car : cars) {
			addWinnerList(winnerList, car);
		}
		printWinners(winnerList);
	}

	private void addWinnerList(List<Car> winnerList, Car car) {
		if (car.getPosition() == maxPosition) {
			winnerList.add(car);
		}
	}

	private void printWinners(List<Car> winnerList) {
		String winners = "";
		for (Car car : winnerList) {
			winners = winners.concat(car.getName()).concat(",");
		}
		System.out.println(winners.replaceAll(",$", "") + "가 최종 우승했습니다.");
	}
}
