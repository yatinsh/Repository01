package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseDataValidationUsingJsonPath;
import org.testing.ResponseValidation.ResponseStatusCodeValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class GetRequestTC 
{
	@Test
	public void testcase2() throws IOException
	{
		Properties pr=PropertiesFileLoad.propertiesLoad("../APIFramework/URI's.properties");
		String idvalueforget = PostRequestTC.idvalue;
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.GetRequest("QA_comments", idvalueforget);
		ResponseStatusCodeValidate.ResponseStatusValidate(200, res);
		System.out.println("***************Get request*************");
		System.out.println(res.asString());
		
	}

}
