
public class SwapChars {

	public static void main(String[] args) {

	}

	public static String swap2(String str) {

		int strLength = str.length(); // Less expensive

		if (strLength < 2) {
			return str;
		}
		String tempString = str.substring(0, strLength - 2);
		System.out.println(tempString);
		char lastCharacter = str.charAt(strLength - 1);
		char secondToLastCharacter = str.charAt(strLength - 2);
		return tempString + lastCharacter + secondToLastCharacter;
	}

}
