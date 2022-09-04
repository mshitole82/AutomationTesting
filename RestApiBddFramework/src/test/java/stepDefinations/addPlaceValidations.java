package stepDefinations;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;

public class addPlaceValidations {
	

	@Given("Add Place API Payload")
	public void add_place_api_payload() {
		
	RestAssured.baseURI="https://rahulshettyacademy.com";
	
	
	
	}
	
	
	@When("user calls {string} with Post http request")
	public void user_calls_with_post_http_request(String string) {

		System.out.println("When");
	}
	
	
	@Then("the API call got success with status code {int}")
	public void the_api_call_got_success_with_status_code(Integer int1) {
	 	
		System.out.println("Then 1");
	}
	
	
	@Then("{string} in response body is1 {string}")
	public void in_response_body_is1(String string, String string2) {
		
		System.out.println("Then 2");
	}
	
	
	@Then("{string} will be  in response body is {string}")
	public void will_be_in_response_body_is(String string, String string2) {
	
		System.out.println("Then 3");
		
	}


//	@Given("DeletePlace PayLoad")
//	public void deleteplace_PayLoad(String placeId) throws IOException {
//	res = given().spec(requestSpecification()).body(data.DeletePlacePayLoad(placeId));
//	}

}
