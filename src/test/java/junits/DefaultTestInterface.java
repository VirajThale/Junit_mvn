package junits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
//import org.junit.jupiter.api.Test;
public interface DefaultTestInterface {

	
	public void method1();
	public void method2();
	
	@RepeatedTest(3)
	default void test() {
		assertTrue(StringFunctions.isPlaindrome("oppo"));
	}
	
}
