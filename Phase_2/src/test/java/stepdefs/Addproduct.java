package stepdefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Addproduct {
	
WebDriver driver=Hooks.driver;
	
	
	
	@When("I click on add to cart product on {string}")
	public void i_click_on_add_to_cart_product_on(String ProductName) {
		String selectedproduct= "//div[text()='" +  ProductName + "']//following::button[1]";
		WebElement AddedItem=driver.findElement(By.xpath(selectedproduct));
		AddedItem.click();				    
	}

	@Then("the basket number should be {string}")
	public void the_basket_number_should_be(String expvalue) {
	    WebElement AddedProduct=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
	    String Itemnumber=AddedProduct.getText();
	    Assert.assertEquals(Itemnumber, expvalue);
	}
	

}