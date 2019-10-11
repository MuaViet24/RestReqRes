package com.Post;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.util.HashMap;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Create {

	public static void main(String[] args) {
			
		/*
		 * passing the Body in form of Hash Map
		 */
		/*HashMap<String, String> map = new HashMap<String, String>();
		map.put("name", "morpheus");
		map.put("job", "leader");
		Response response =given().contentType(ContentType.JSON).body(map)
							.put("https://reqres.in/api/users");
		response.prettyPrint();*/
		
		/*
		 * passing the body in form of string
		 */
		
		/*String jsonBody = "{\"name\":\"morpheus\",\"job\":\"leader\"}";
		Response response =given().contentType(ContentType.JSON).body(jsonBody)
				.put("https://reqres.in/api/users");
		response.prettyPrint();*/
		
		
		/*
		 * passing the Body in form of JSON file
		 * 1.Content type is -- ContentType.JSON
		 */
		
		/*Response response =given().contentType(ContentType.JSON).body(new File("./user.json"))
				.put("https://reqres.in/api/users");
		response.prettyPrint();*/
		
		/*
		 * passing the Body in form of JSON file
		 * 1.Content type is -- application/json as String
		 */
		
		/*Response response =given().contentType("application/json").body(new File("./user.json"))
				.put("https://reqres.in/api/users");
		response.prettyPrint();*/
		
		/*
		 * passing the Body in form of JSON file
		 * 1.Content type is -- application/json in Headers
		 */
		
		Response response =given().headers("Content-Type", "application/json").body(new File("./user.json"))
				.put("https://reqres.in/api/users");
		response.prettyPrint();
	}

}
