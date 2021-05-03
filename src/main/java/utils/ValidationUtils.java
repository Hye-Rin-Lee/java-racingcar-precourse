package utils;

public class ValidationUtils {

	private static final int MIN = 1;
	private static final int MAX = 9;

	public static boolean validRange(int no) {
		return no >= MIN && no <= MAX;
	}
}
