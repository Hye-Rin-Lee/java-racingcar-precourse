package racingGame;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import randomNumber.RandomNumber;
import randomNumber.RandomNumberGenerator;

public class RandomGeneratorTest {

	@Test
	@DisplayName("랜덤 수 생성 테스트")
	public void generateNumber() {
		RandomNumberGenerator generator = new RandomNumberGenerator();
		RandomNumber no = generator.generateNumber();
		assertThat(no).isNotNull();
	}

	@Test
	@DisplayName("생성된 수가 이동 가능한 수인지 판단.")
	public void movable() {
		assertThat(new RandomNumber(4).isMovable()).isTrue();
		assertThat(new RandomNumber(3).isMovable()).isFalse();
	}
}
