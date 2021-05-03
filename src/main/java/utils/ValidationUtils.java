package utils;

public class ValidationUtils {

	private static final int MIN = 1;
	private static final int MAX = 9;
	private static final int MAX_NAME_LENGTH = 5;

	public static boolean validRange(int no) {
		return no >= MIN && no <= MAX;
	}

	public static boolean checkLength(String name){
		return name.length() <= MAX_NAME_LENGTH;
	}
}
