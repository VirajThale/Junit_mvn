package junits;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class ParametersExamples {
	
	@ParameterizedTest
	@ValueSource(strings = {"oppo","madam","abcd"})
	public void test(String name) {
		
		assertTrue(StringFunctions.isPlaindrome(name));
		
	}
	
	@ParameterizedTest
	@ValueSource(ints = {5,7,9,10})
	public void oddNumCheck(int num ) {
		assertTrue(num % 2 !=0);
	}

}
