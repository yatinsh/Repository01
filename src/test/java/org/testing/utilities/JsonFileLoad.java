package org.testing.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonFileLoad 
{
	public static String jsonobjectLoad(String Path) throws FileNotFoundException
	{
		File f=new File(Path);
		FileReader fr=new FileReader(f);
		JSONTokener jt=new JSONTokener(fr);
		JSONObject jo=new JSONObject(jt);
		return jo.toString();
		
	}
	
	public static String jsonarrayLoad(String Path) throws FileNotFoundException
	{
		File f=new File(Path);
		FileReader fr=new FileReader(f);
		JSONTokener jt=new JSONTokener(fr);
		JSONArray ja=new JSONArray(jt);
		return ja.toString();
		
	}

}
