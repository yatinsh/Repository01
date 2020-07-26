package org.testing.TestScripts;

import java.io.FileNotFoundException;

import org.testing.utilities.JsonFileLoad;
import org.testing.utilities.JsondataUpdateusingOrgJson;
import org.testng.annotations.Test;

public class TC7 
{
	@Test
	public void Testcase7() throws FileNotFoundException
	{
		String body=JsonFileLoad.jsonobjectLoad("../APIFramework/src/test/java/org/testing/resources/Bodydata01.json");
		String Updatedbody=JsondataUpdateusingOrgJson.JsondataUpdate(body, "phonetype","Home");
		Updatedbody=JsondataUpdateusingOrgJson.JsondataUpdate(Updatedbody, "Phonetype","office");
		System.out.println("Updated data is:"+Updatedbody);
		
	}

}
