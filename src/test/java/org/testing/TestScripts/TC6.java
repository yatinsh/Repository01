package org.testing.TestScripts;

import java.io.FileNotFoundException;

import org.testing.utilities.JsonFileLoad;
import org.testing.utilities.JsondataUpdateusingOrgJson;
import org.testng.annotations.Test;

public class TC6 
{
	@Test
	public void Testcase6() throws FileNotFoundException
	{
		String body=JsonFileLoad.jsonobjectLoad("../APIFramework/src/test/java/org/testing/resources/Bodydata01.json");
		String updatedbody=JsondataUpdateusingOrgJson.JsondataUpdate(body, "phone no.","9315858207");
		System.out.println("Updated data is:"+updatedbody);
//		65468
		
	}

}
