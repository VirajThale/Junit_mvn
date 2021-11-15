package junits;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;





public class FirstJunit {
	
	@BeforeAll
	public static void Method3() {
		System.out.println("Inside BeforeAll method");
	}
	
	@BeforeEach
	public void Method1() {
		System.out.println("Inside Before Method");
		
	}
	
	@Test
	public void test_1() {

		System.out.println("Inside test_1");
		boolean flag = true;
		Assert.assertTrue(flag);
		

	}
	@Test
	public void test_2() {

		System.out.println("Inside test_2");

	}
	
	@AfterEach
	public void method2() {
		System.out.println("Inside After Method");
		
	}
	
	@AfterAll
	public static void Method4() {
		System.out.println("Inside BeforeAll method");
	}

}
