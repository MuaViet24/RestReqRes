package com.Delete;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;

public class Delete {

	public static void main(String[] args) {
		
		Response response = given().delete("https://reqres.in/api/users/2");
		System.out.println("Staus code--->"+response.statusCode());

	}

}
