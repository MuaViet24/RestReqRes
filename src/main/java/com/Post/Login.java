package com.Post;

import static io.restassured.RestAssured.*;

import java.io.File;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Login {

	public static void main(String[] args) {

		/*
		 * Login success
		 */

		/*Response response = given().contentType(ContentType.JSON).body(new File("./loginSuccess.json"))
							.post("https://reqres.in/api/login");
		response.prettyPrint();*/



		/*
		 * Login Unsuccess
		 */

		Response response = given().contentType(ContentType.JSON).body(new File("./loginUnsuccess.json"))
				.post("https://reqres.in/api/login");
		response.prettyPrint();


	}

}
