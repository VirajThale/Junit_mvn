package junits;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicTestExamples {
	
	@TestFactory
	public Collection<DynamicTest> method1() {
		
		return Arrays.asList(
		DynamicTest.dynamicTest("Positive Test",		
				()->assertTrue(StringFunctions.isPlaindrome("oppo"))),
		DynamicTest.dynamicTest("Postive Test", 
				()->assertFalse(StringFunctions.isPlaindrome("madam"))),
		DynamicTest.dynamicTest("Negative Test", 
				()->assertFalse(StringFunctions.isPlaindrome("abcd")))
				
		);

		
	}
	
	

}
