package test;


import org.testng.annotations.Test;

//Java class
@Test(groups= {"regression"})
public class LoanTest extends BaseClass{
	
	
		
	//method
	//@Test(groups= {"sanity"})  //@Test is annotation, used instead of main method and group=sanity given to execute 
	@Test(priority=1)
	public void HomeLoanTest() {
		
		System.out.println("Inside Home Loan Test");
	}

	@Test(enabled=true)  
	//this test will not be executed when enabled=false
	//if priority is not given then that will be executed 1st
	public void PersonalLoanTest() {
		
		System.out.println("Inside Personal Loan Test");
		
	}
	

	@Test(priority=0)  
	public void PersonalLoanTest1() {
		
		System.out.println("Inside Personal Loan Test1");
		
	}
	
	
	
}
