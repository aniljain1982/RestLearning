package com.vmware.rest.rest_learning;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class SimpleRestTest {

	@Test
	public void getWeatherDetails() {
		baseURI="http://restapi.demoqa.com/utilities/weather/city";
		
		RequestSpecification httpRequest=given();
		Response response=httpRequest.request(Method.GET, "/Hyderabad");
		
		String responseBody=response.body().asString();
		int statusCode=response.getStatusCode();
		Assert.assertEquals(statusCode, 200);
	}
}
