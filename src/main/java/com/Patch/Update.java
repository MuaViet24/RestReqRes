package com.Patch;

import static io.restassured.RestAssured.*;

import java.io.File;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Update {

	public static void main(String[] args) {
		
		Response response = given().contentType(ContentType.JSON).body(new File("./patchUser.json"))
							.patch("https://reqres.in/api/users/2");
		response.prettyPrint();

	}

}
