package utils;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ValidationUtilsTest {
	@Test
	@DisplayName("숫자 범위 검증 유틸 테스트")
	public void numberRangeTest() {
		assertThat(ValidationUtils.validRange(9)).isTrue();
		assertThat(ValidationUtils.validRange(1)).isTrue();
		assertThat(ValidationUtils.validRange(11)).isFalse();
		assertThat(ValidationUtils.validRange(0)).isFalse();
	}
}