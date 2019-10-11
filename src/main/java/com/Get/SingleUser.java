package com.Get;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;

public class SingleUser {

	public static void main(String[] args) {
		
		Response response = given().get("https://reqres.in/api/users/2");
		response.prettyPrint();
	}

}
