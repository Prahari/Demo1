package file;



import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import org.testng.annotations.Test;





//import org.junit.Test;

public class parameterize {

	//@Test(dataProvider="Booksdata")
	@Test
	public void addBook() 
	{
		
		RestAssured.baseURI="http://216.10.245.166";
//		//Payload via AddBook Function
		String addbookRes=given().header("Content-Type","application/json")
		.body(file.AddressBody.AddBook("isbn","aisle"))
		.when().post("Library/Addbook.php")
		.then().assertThat().statusCode(200).extract().response().asString();
		
		//Static Payload via external Json File
//				String addbookRes=given().header("Content-Type","application/json")
//				.body(new String(Files.readAllBytes(Paths.get("C:\\Users\\hp\\Desktop\\RestAssured\\StaticPayload.json"))))
//				.when().post("Library/Addbook.php")
//				.then().assertThat().statusCode(200).extract().response().asString();
		System.out.println("AddBook response"+addbookRes);
		JsonPath j1=new JsonPath(addbookRes);
		String id=j1.get("ID");
		System.out.println(id);
	}
	
//	@DataProvider(name="Booksdata")
//	public Object[][] getData()
//	{
//		return new Object[][] {{"asde", "12321"},{"aty", "12421"}};
//	}
	
	
}
