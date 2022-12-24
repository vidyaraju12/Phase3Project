package restAPIXML;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.internal.path.xml.NodeChildrenImpl;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class XMLExample {
	
	@Test
	public void Test1() {
		
RestAssured.baseURI = "https://chercher.tech/sample/api/books.xml";
		
		RequestSpecification request = RestAssured.given();
		
		Response response = request.get();
		
		System.out.println(response.getBody().asString());
		
		NodeChildrenImpl Allbooks = response.then().extract().path("bookstore.book.title");
		
		System.out.println(Allbooks);
		
		System.out.println("First book is " + Allbooks.get(0));
		System.out.println("Second book is " + Allbooks.get(1));
		
		System.out.println("First book language is " + Allbooks.get(0).getAttribute("lang"));
		
		System.out.println("Second book language is " + Allbooks.get(1).getAttribute("lang"));
		
	}

}
