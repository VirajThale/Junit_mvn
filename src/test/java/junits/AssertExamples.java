package junits;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AssertExamples {
	
	@Test
	public void test() {
		String name1= "Rohit";
		String name2= "Rohit";
		assertEquals(name1,name2);
		
		String[] expectedArray = {"one", "two", "three"};
		String[] resultArray = {"one", "two", "three"};
		
		assertArrayEquals(expectedArray,resultArray);
		
		
		
	}

	

}
