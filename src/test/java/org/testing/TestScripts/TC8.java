package org.testing.TestScripts;

import org.testing.utilities.Conversion;
import org.testng.annotations.Test;

public class TC8 
{
	@Test
	public void Testcase8()
	{
		String data="<firstname>yatin</firstname>";
		String jsonData=Conversion.xmlconvert(data);
		System.out.println(jsonData);
		Conversion.jsonconvert(jsonData);
		System.out.println(jsonData.toString());
	}

}
