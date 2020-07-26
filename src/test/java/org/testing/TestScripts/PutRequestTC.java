package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.ResponseValidation.ResponseStatusCodeValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.JsonFileLoad;
import org.testing.utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class PutRequestTC 
{
	@Test
	public void Testcase4() throws IOException
	{
		Properties pr=PropertiesFileLoad.propertiesLoad("../APIFramework/URI's.properties");
		String idvalueforput = PostRequestTC.idvalue;
		JSONObject js=new JSONObject();
		js.put("firstName","yatinmonika Updated");
		js.put("lastName","Sharma2 Updated");
		js.put("city","Aligarh2 Updated");
		js.put("Company","TCS");
		js.put("id", idvalueforput);
		js.put("Designation","Junior Analyst");
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.PutRequest(js.toString(),"QA_comments", idvalueforput);
		System.out.println("updated data after put request:"+res.asString());
		ResponseStatusCodeValidate.ResponseStatusValidate(200, res);
	}

}
