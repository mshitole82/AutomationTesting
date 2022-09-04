package apiTesting;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import files.payloads;


public class basictest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("******************************THIS IS CREATE PLACE ID API*********************************************************");
		
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		
		String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
		.body(payloads.addPlacebody())
		.when().post("/maps/api/place/add/json")
		.then().assertThat().log().all().statusCode(200).body("scope", equalTo("APP"))
		.header("server", "Apache/2.4.18 (Ubuntu)").extract().response().asString();
		
		System.out.println(response);
		
		
		JsonPath js=new JsonPath(response); // take  string as a input and convert into jason // for parsing json format
	
		String placeid = js.getString("place_id");
		
		System.out.println("place id is\t"+placeid);
	
		
		System.out.println("******************************THIS IS UPDATE ADDRESS API*********************************************************");
		
		
		   given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
		.body(payloads.updteAddress())
		.when().put("/maps/api/place/update/json")
		.then().assertThat().log().all().statusCode(200).body("msg", equalTo("Address successfully updated")).extract().response().asString();;
		
		 
		System.out.println("******************************THIS IS GET PLACE ID API*********************************************************");
		 given().log().all().queryParam("key", "qaclick123").queryParam("placeid", "fe6e31027b6155d981d4b4ee2d3bfaee")
		.when().get("/maps/api/place/get/json")
		.then().assertThat().log().all().statusCode(200).body("address", equalTo("Mahesh Number is 648 , AT POST KASARSAI, TALUKA MULSHI"));
		
		
		
		
		
	/*	
		
		System.out.println("******************************THIS IS DELETE PLACE ID API*********************************************************");
		
		
		
		
		
		given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
		.when().delete("/maps/api/place/delete/json")
		.then().assertThat().statusCode(200).body("status", equalTo("OK"));
		
		*/
	}

}
