package org.testing.TestSteps;

import static com.jayway.restassured.RestAssured.*;

import java.util.Properties;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class HTTPMethods 
{
	Properties pr;
	
	public HTTPMethods(Properties pr)
	{
		this.pr=pr;
	}
	
	public Response PostRequest(String bodydata,String URIkey)
	{
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(bodydata)
		.when()
		.post(pr.getProperty(URIkey));
		return res;
	}
	
	public Response PutRequest(String bodydata,String URIkey,String idvalue)
	{
		String getURI=pr.getProperty(URIkey)+"/"+idvalue;
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(bodydata)
		.when()
		.put(getURI);
		return res;
	}
	
	public Response GetRequest(String URIkey,String idvalue)
	{
		String getURI=pr.getProperty(URIkey)+"/"+idvalue;
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(getURI);
		return res;
		
	}
	
	public Response GetRequest(String URIkey)
	{
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(pr.getProperty(URIkey));
		return res;
		
	}
	public Response DeleteRequest(String URIkey,String idvalue)
	{
		String getURI=pr.getProperty(URIkey)+"/"+idvalue;
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.delete(getURI);
		return res;
	}
	
	public Response PatchRequest(String bodydata,String URIkey)
	{
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(bodydata)
		.when()
		.patch(URIkey);
		return res;
	}
	

}
