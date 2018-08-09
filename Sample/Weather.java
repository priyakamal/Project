package com.Sample;

import java.util.HashMap;
import java.util.Map;
import org.testng.Assert;
import io.restassured.response.Response;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class Weather {
	public static void main(String[] args) {
		RequestSpecification Request = RestAssured.with();
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/JSON");
		Response response = Request.headers(headers).get("http://restapi.demoqa.com/utilities/weather/city/chennai");
		PojoWeather out = response.as(PojoWeather.class);
		Assert.assertNotNull(out.getCity());
		Assert.assertNotNull(out.getTemperature());;
		
	}
}