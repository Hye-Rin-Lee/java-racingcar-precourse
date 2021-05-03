package utils;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import racingGame.RandomNumber;
import racingGame.RandomNumberGenerator;

public class RandomGeneratorTest {
	@Test
	@DisplayName("랜덤 수 생성 테스트")
	public void generateNumber() {
		RandomNumberGenerator generator = new RandomNumberGenerator();
		RandomNumber no = generator.generateNumber();
		assertThat(no).isNotNull();
	}
}
