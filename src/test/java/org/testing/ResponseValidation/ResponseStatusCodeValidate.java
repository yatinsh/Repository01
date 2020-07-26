package org.testing.ResponseValidation;

import org.testng.Assert;

import com.jayway.restassured.response.Response;

public class ResponseStatusCodeValidate 
{
	public static void ResponseStatusValidate(int expected,Response res)
	{
		Assert.assertEquals(expected,res.statusCode(),"Status code is not matching");
	}

}
