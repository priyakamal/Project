package com.petstore;

import java.util.HashMap;
import java.util.Map;
import org.testng.Assert;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PetMainClass {
	public static void main(String[] args) {
		RequestSpecification Request = RestAssured.with();
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/JSON");
		Response response = Request.headers(headers).get("https://petstore.swagger.io/v2/pet/findByStatus?status=available");
		PojoClassPet out = response.as(PojoClassPet.class);
		Assert.assertNotNull(out.getId());
		Assert.assertNotNull(out.getName());;
		
	}

}
