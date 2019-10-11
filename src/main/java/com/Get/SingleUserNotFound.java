package com.Get;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;

public class SingleUserNotFound {

	public static void main(String[] args) {
		
		Response response = given().get("https://reqres.in/api/users/23");
		response.prettyPrint();
		System.out.println("staus code--->" + response.statusCode());

	}

}
