package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.json.JSONObject;
import org.testing.ResponseValidation.ResponseDataValidationUsingJsonPath;
import org.testing.ResponseValidation.ResponseStatusCodeValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.JsonFileLoad;
import org.testing.utilities.JsonVariableReplacement;
import org.testing.utilities.PropertiesFileLoad;
import org.testing.utilities.RandonIDGenerator;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class PostRequestTC 
{
	static String idvalue;

	@Test
	public void testcase1() throws IOException
	{
		Properties pr=PropertiesFileLoad.propertiesLoad("../APIFramework/URI's.properties");
		String body=JsonFileLoad.jsonobjectLoad("../APIFramework/src/test/java/org/testing/resources/Bodydata.json");
		Integer randomidvalue=RandonIDGenerator.randomid();
		String bodyaftervalue=JsonVariableReplacement.JsonValuetoVariable(body, "id",randomidvalue.toString());
		bodyaftervalue=JsonVariableReplacement.JsonValuetoVariable(bodyaftervalue, "firstname", "monika");
		System.out.println(bodyaftervalue);
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.PostRequest(bodyaftervalue, "QA_comments");
		//Response res1=http.GetRequest(pr.getProperty("QA_sendmessage"));
		//System.out.println("Status code of post request is:"+res.statusCode());
		//System.out.println("Data posted through Post request is:"+res1.asString());
		ResponseStatusCodeValidate.ResponseStatusValidate(201, res);
		System.out.println("Data is:"+res.asString());
		ResponseDataValidationUsingJsonPath.ResponseData("monika", res,"firstname");
		idvalue=res.jsonPath().get("id");
		System.out.println("id value is:"+idvalue);
		
	} 
	
	

}
