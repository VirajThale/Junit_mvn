package junits;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Month;
import java.util.stream.Stream;

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
	
	@ParameterizedTest
	@EnumSource(Month.class)
	public void Monthcheck(Month month) {
		int monthnum = month.getValue();
		assertTrue(monthnum>=1 && monthnum<=12);
		
	}
	@ParameterizedTest
	@EnumSource(value =Month.class, names= {"APRIL","JUNE","SEPTEMBER","NOVEMBER"})
	public void MonthDayscheck(Month month) {
		int days = month.length(false);
		assertEquals(days,30);
	}
	
	@ParameterizedTest
	@EnumSource(value =Month.class, names= {"FEBRUARY"})
	public void LeapYearCheck(Month month) {
		int days = month.length(true);
		assertEquals(days,28);
	}
	@ParameterizedTest
	@MethodSource("Dpmethod")
	public void PalindromeCheck1(String Name)
	{
		assertTrue(StringFunctions.isPlaindrome(Name));
	}
	static Stream<String>Dpmethod(){
		return Stream.of("racecar","radar","mom");
	}
	

}
