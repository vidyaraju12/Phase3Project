package junits;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class StringFunctionsTest {
	
	@Test
	public void Test1() {
		
		assertTrue(StringFunctions.isPalindrom("RADAR"));
	}
	
	@Test
	public void Test2() {
		
		assertFalse(StringFunctions.isPalindrom("PRIYA"));
	}
	
	@DisplayName("Example of Repeated test")
	@RepeatedTest(2)
	public void Test3() {
		
		assertTrue(StringFunctions.isPalindrom("MOM"));
	}

}
