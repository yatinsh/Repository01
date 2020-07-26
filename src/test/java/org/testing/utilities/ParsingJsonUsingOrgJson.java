package org.testing.utilities;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;

public class ParsingJsonUsingOrgJson 
{
	public static List<String> ParsingUsingOrgJson(String bodyData,String varName)
			{
		ArrayList<String> str=new ArrayList<String>();
		String st;
		JSONArray arr=new JSONArray(bodyData);
		int len=arr.length();
		for(int i=0; i<len;i++)
		{
		try {
		st=arr.getJSONObject(i).getString(varName);
		str.add(st);
		}
		catch (Exception e) {
		}
		}
		return str;
		
			}
			

}
