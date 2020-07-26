package org.testing.TestScripts;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseDataValidationUsingJsonPath;
import org.testing.ResponseValidation.ResponseStatusCodeValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.ParsingJsonUsingOrgJson;
import org.testing.utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class AllGetRequestTC 
{
	@Test
	public void Testcase3() throws IOException
	{
		Properties pr=PropertiesFileLoad.propertiesLoad("../APIFramework/URI's.properties");
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.GetRequest("QA_comments");
		ResponseStatusCodeValidate.ResponseStatusValidate(200, res);
		System.out.println("***************Get request*************");
		System.out.println(res.asString());
		List<String> idvalues=ParsingJsonUsingOrgJson.ParsingUsingOrgJson(res.asString(),"id");
	    System.out.println("Complete data of the particular variable is "+idvalues);
	    List<String> firstname=ParsingJsonUsingOrgJson.ParsingUsingOrgJson(res.asString(),"firstname");
	    System.out.println("Complete data of the particular variable is "+firstname);
		
	}

}
