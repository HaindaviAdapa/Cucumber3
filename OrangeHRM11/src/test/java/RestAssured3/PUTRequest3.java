package RestAssured3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ExcelUtil.ExcelApiTest3;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapper;
import io.restassured.path.json.JsonPath;


import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class PUTRequest3 
{
	

	//https://techndeck.com/get-request-using-rest-assured/
	//http://dummy.restapiexample.com/api/v1/employees
	
	@Test
	public void RegistrationSuccessful1()
	{		
		RestAssured.baseURI ="http://dummy.restapiexample.com/api/v1";
		RequestSpecification request = RestAssured.given();
		Response response = null;

	String requestBody = "{\n" +
				"  \"name\": \"PUT_tammy33\",\n" +
				"  \"salary\": \"90000\",\n" +
				"  \"age\": \"90\"\n" +
				"}";
		
	//32246
		
		request.body(requestBody);
		request.contentType(ContentType.JSON);
		response = request.put("/update/32246");
		

		int statusCode = response.getStatusCode();
		System.out.println("The status code recieved: " + statusCode);
		System.out.println("Response body: " + response.body().asString());
 
	}
	
	
	
	
	
}
