package com.Post;

import static io.restassured.RestAssured.*;

import java.io.File;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class RegisterSuccess {

	public static void main(String[] args) {

		/*
		 * Registration success
		 */

		/*Response response = given().contentType(ContentType.JSON).body(new File("./registerSuccess.json"))
				.post("https://reqres.in/api/register");
		response.prettyPrint();*/

		/*
		 * Registration Unsuccess
		 */

		Response response = given().contentType(ContentType.JSON).body(new File("./registerUnsuccess.json"))
				.post("https://reqres.in/api/register");
		response.prettyPrint();

	}

}
