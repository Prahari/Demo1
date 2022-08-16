package demo1;

import io.restassured.RestAssured;
//import io.restassured.path.json.JsonPath;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import org.testng.Assert;

import file.AddressBody;

public class CreateAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		//Add Place
//		String response = given().queryParam("key", "qaclick123").header("Content-Type","application/json")
//		.body(AddressBody.Address()
//				).when().post("/maps/api/place/add/json")
//		.then().log().all().assertThat().statusCode(200).body("scope", equalTo("APP"))
//		.header("Server", "Apache/2.4.41 (Ubuntu)").extract().response().asString();
//		System.out.println(response);
//		
//		JsonPath js=new JsonPath(response);
//		String PlaceId=js.getString("place_id");
//		System.out.println("Place ID is : "+PlaceId);
//		
//		//Update Place
//		
//		String updAddress="70 winter walk, USA";
//		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
//		.body("{\r\n"
//				+ "\"place_id\":\""+PlaceId+"\",\r\n"
//				+ "\"address\":\"70 winter walk, USA\",\r\n"
//				+ "\"key\":\"qaclick123\"\r\n"
//				+ "}")
//		.when().put("maps/api/place/update/json")
//		.then().assertThat().statusCode(200).extract().response().asString();
//		
//		//Get PLace
//		
//		String getres=given().log().all().queryParam("key", "qaclick123").queryParam("place_id", PlaceId)
//		.when().get("/maps/api/place/get/json")
//		.then().assertThat().statusCode(200)
//		.extract().response().asString();
//		
//		JsonPath js1=new JsonPath(getres);
//		String newAddress=js1.getString("address");
//		
//		System.out.println(newAddress);
//		System.out.println(updAddress);
//		
//		Assert.assertEquals(newAddress, updAddress);
//	

	}

}
