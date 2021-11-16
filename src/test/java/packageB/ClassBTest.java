package packageB;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import junits.StringFunctions;

public class ClassBTest {
	
	@Tag("Sanity")
	@DisplayName("TestB")
	@Test
	public void test1() {
		
		assertTrue(StringFunctions.isPlaindrome("oppo"));
		
	}

}
