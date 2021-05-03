package racingGame;

import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import car.Car;
import car.Cars;
import randomNumber.RandomNumber;

public class CarsTest {

	@Test
	@DisplayName("차생성 테스트")
	public void carGenerateTest() {
		Cars cars = new Cars("aa,bb,cc");
		assertThat(cars).hasNoNullFieldsOrProperties();
	}

	@Test
	@DisplayName("차 위치 변경 테스트")
	public void carMove() {
		Car car = new Car("car");
		assertThat(car.getPosition()).isEqualTo(0);
		car.race(new RandomNumber(1));
		assertThat(car.getPosition()).isEqualTo(0);
		car.race(new RandomNumber(4));
		assertThat(car.getPosition()).isEqualTo(1);
	}

	@Test
	@DisplayName("winner Position 찾기")
	public void getMaxPosition(){
		List<Car> carList = new ArrayList<>();
		carList.add(new Car("aa", 2));
		carList.add(new Car("bb", 1));
		carList.add(new Car("cc", 3));
		Cars cars = new Cars(carList);

		assertThat(cars.getMaxPosition()).isEqualTo(3);
	}
}
