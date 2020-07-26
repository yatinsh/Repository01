package org.testing.utilities;

import org.json.JSONObject;
import org.json.XML;
import org.json.simple.JSONValue;

public class Conversion 
{
	public static String xmlconvert(String xmlData)
	{
		JSONObject jo=XML.toJSONObject(xmlData);
		return jo.toString();
	}
	
	public static String jsonconvert(String jsonData)
	{
		JSONObject jo1=new JSONObject(jsonData);
		String xmldata=XML.toString(jo1);
		return xmldata;
	}

}
