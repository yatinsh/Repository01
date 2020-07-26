package org.testing.ResponseValidation;

import org.testng.Assert;

import com.jayway.restassured.response.Response;

public class ResponseDataValidationUsingJsonPath 
{
	public static void ResponseData(String expected,Response res,String jsonpath)
	{
		String actual=res.jsonPath().get(jsonpath);
		Assert.assertEquals(expected,actual,"Data is not matching");
	}

}
