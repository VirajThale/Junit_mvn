package junits;
import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringFunctionsTest {
	
	
	
	
	@Test
	@DisplayName("Positive Test")
	public void test1() {
		
		assertTrue(StringFunctions.isPlaindrome("oppo"));
		
	}
	
	//@Disabled
	@Test
	@DisplayName("Negative Test")
	public void test2()
	{
		assertFalse(StringFunctions.isPlaindrome("oop"));
	}

}
