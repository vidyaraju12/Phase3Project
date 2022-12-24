package stepdefs;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	WebDriver driver=Hooks.driver;
	
	@Given("I have launched the application")
	public void i_have_launched_the_application() {
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	}	
	@When("I click on the login Button")
	public void i_click_on_the_login_Button() {
		WebElement LoginButton=driver.findElement(By.id("login-button"));
		LoginButton.click();	    
	}	
	@Then("I should get the error message {string}")
	public void i_should_get_the_error_message(String ExpError) {
	    WebElement Error = driver.findElement(By.xpath("//h3[contains(text(), 'Username and password')]"));
		String ActError = Error.getText();
		Assert.assertEquals(ExpError, ActError);
	}	
	@When("I enter the username as {string} and password as {string}")
	public void i_enter_the_username_as_and_password_as(String UsernameVal, String PasswordVal) {
		WebElement userName = driver.findElement(By.id("user-name"));
		userName.sendKeys(UsernameVal);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(PasswordVal);
	}
}