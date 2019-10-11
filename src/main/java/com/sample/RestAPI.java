package com.sample;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;

public class RestAPI {

	public static void main(String[] args) {
		
		//Response response = given().formParam("page", 2).param("page", 2)
		Response response = given().params("page", 2)
				.get("https://reqres.in/api/users");
							//.get("https://reqres.in/api/users");
		response.prettyPrint();
		System.out.println("Status code --->" + response.statusCode());

	}

}
