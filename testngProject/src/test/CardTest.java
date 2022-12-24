package test;

import org.testng.annotations.Test;

public class CardTest extends BaseClass {
	
	@Test(groups= {"sanity"}, enabled = false, description = "this test will validate CC functionality")
	
	public void CCTest() {
		System.out.println("Inside CC Test");
	}

}
