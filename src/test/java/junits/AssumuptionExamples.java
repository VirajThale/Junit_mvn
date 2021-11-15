package junits;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assumptions.*;
import static org.junit.jupiter.api.Assertions.*;

public class AssumuptionExamples {
	
	@BeforeEach
	public void setup() {
	System.setProperty("ENV","SEV");
	
	}
	
	@Test
	public void test1() {
		String ExpectedEnv = "DEV";
		String ActualEnv= System.getProperty("ENV");
		
		assumeTrue(ExpectedEnv.equals(ActualEnv));
		
		assertTrue(StringFunctions.isPlaindrome("oppo"));
		
	}

}
