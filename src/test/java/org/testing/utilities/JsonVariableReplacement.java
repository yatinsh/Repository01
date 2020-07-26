package org.testing.utilities;

import java.util.regex.Pattern;

public class JsonVariableReplacement 
{
	public static String JsonValuetoVariable(String jsonData,String VariableName,String InsertedValue)
	{
		String returndata=jsonData.replaceAll(Pattern.quote("{{"+VariableName+"}}"),InsertedValue);
		return returndata;
	}

}
 