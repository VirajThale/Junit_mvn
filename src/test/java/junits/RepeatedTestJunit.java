package junits;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.RepeatedTest;

public class RepeatedTestJunit {
	
	@RepeatedTest(3)
	public void test1() {
		assertTrue(StringFunctions.isPlaindrome("oppo"));
	}

}
