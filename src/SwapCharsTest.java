import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SwapCharsTest {

	@Test
	void swapStringWith2Chars() {
		assertEquals("AB",SwapChars.swap2("BA"));
	}
	
	@Test
	void swapStringWith6Chars() {
		assertEquals("AB",SwapChars.swap2("BA"));
	}

}
