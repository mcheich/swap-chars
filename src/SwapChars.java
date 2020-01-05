
public class SwapChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static String swap2(String str) {
		
		int strLength = str.length(); //Less expensive
		if(strLength < 2) {
			return str;
		}
		char lastCharacter = str.charAt(strLength-1);
		char secondToLastCharacter = str.charAt(strLength-2);
		return "" +lastCharacter + secondToLastCharacter;
	}

}
