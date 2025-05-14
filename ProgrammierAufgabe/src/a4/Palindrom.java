package a4;

public class Palindrom {

	public static void main(String[] args) {

	}
	
	private static boolean isPalindrom (String wort) {
		if (wort.length() <= 1) {
			return true;
		} else if (wort.charAt(0) == wort.charAt(wort.length() - 1)) {
			return isPalindrom(wort.substring(1, wort.length() - 1));
		} else {
			return false;
		}
		
		
		
	}

}
