package junits;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestExa {
	
	@ValueSource(strings = {"radar","mom", "dad"})
	
	@ParameterizedTest
	public void Test1(String arg1) {
		
		assertTrue(StringFunctions.isPalindrom(arg1));
	}
	
	@CsvSource(value= {"radar:radar:this is comparsion test"}, delimiter = ':')

@ParameterizedTest
public void Test2(String arg1, String arg2,String arg3) {
	
	assertTrue(StringFunctions.isPalindrom(arg1));
	assertEquals)arg1, arg2, arg3)
}

}
	
	


