package manager;

import java.util.Scanner;

import car.Cars;
import randomNumber.RandomNumberGenerator;

public class GameManager {

	private Cars cars;
	private RandomNumberGenerator generator;
	private int attempt;

	public GameManager() {
		generator = new RandomNumberGenerator();
		attempt = 0;
	}

	public void play() {
		initGame();
		for (int i = 0; i < attempt; i++) {
			cars.race(generator);
		}
		cars.getWinners();
	}

	public void initGame() {
		System.out.print("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)\n");
		Scanner scanner = new Scanner(System.in);
		String carNames = scanner.next();
		cars = new Cars(carNames);
		System.out.print("시도할 회수는 몇회인가요?\n");
		attempt = scanner.nextInt();
	}

}
