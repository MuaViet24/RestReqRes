package com.Put;

import static io.restassured.RestAssured.*;

import java.io.File;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Update {

	public static void main(String[] args) {
		Response response = given().contentType(ContentType.JSON).body(new File("./putUser.json"))
				.put("https://reqres.in/api/users/2");
		response.prettyPrint();

	}

}
