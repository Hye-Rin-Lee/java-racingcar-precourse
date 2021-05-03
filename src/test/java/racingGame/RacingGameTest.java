package racingGame;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RacingGameTest {

	@Test
	@DisplayName("차생성 테스트")
	public void carGenerateTest() {
		Cars cars = new Cars("aa,bb,cc");
		assertThat(cars).hasNoNullFieldsOrProperties();
	}

	@Test
	@DisplayName("차 move 테스트")
	public void carMove() {
		Car car = new Car("car");
		assertThat(car.getPosition()).isEqualTo(0);
		car.race(new RandomNumber(1));
		assertThat(car.getPosition()).isEqualTo(0);
		car.race(new RandomNumber(4));
		assertThat(car.getPosition()).isEqualTo(1);
	}
}
