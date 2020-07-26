package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ResponseDataValidationUsingJsonPath;
import org.testing.ResponseValidation.ResponseStatusCodeValidate;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.PropertiesFileLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class DeleteRequestTC 
{
	@Test
	public void Testcase5() throws IOException
	{
		Properties pr=PropertiesFileLoad.propertiesLoad("../APIFramework/URI's.properties");
		String idvaluefordelete=PostRequestTC.idvalue;
		HTTPMethods http=new HTTPMethods(pr);
		Response res=http.DeleteRequest("QA_comments", idvaluefordelete);
		ResponseStatusCodeValidate.ResponseStatusValidate(200, res);
		
	}

}
