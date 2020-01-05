
public class SwapChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static String swap2(String str) {
		
		int strlength = str.length(); //Less expensive
		
		char lastCharacter = str.charAt(strlength-1);
		char secondToLastCharacter = str.charAt(strlength-2);
		return "" +lastCharacter + secondToLastCharacter;
	}

}
