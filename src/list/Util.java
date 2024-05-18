package list;

import java.util.Random;

public class Util {
	
	private final static String MOJI = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	
	public static String random() {
		StringBuilder stringBuilder = new StringBuilder();
		int length = 20;
		for(int i = 0; i < length; i++) {
            stringBuilder.append(randomChar());
        }
		return stringBuilder.toString();
	}
	
	private static char randomChar() {
        Random r = new Random();
        char c = MOJI.charAt(r.nextInt(MOJI.length()));
        return c;
    }
}
