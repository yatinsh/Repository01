package org.testing.utilities;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsondataUpdateusingOrgJson 
{
	public static String JsondataUpdate(String data,String varname,String replacevar)
	{
		JSONObject jo=new JSONObject(data);
		JSONArray ja=jo.getJSONArray("phone");
		int l=ja.length();
		for(int i=0;i<l;i++)
		{
			JSONObject jo1=ja.getJSONObject(i);
			jo1.put(varname, replacevar);
		}
		return jo.toString();
		
	}

}
