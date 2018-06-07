package com.javainuse.springbootquickstart.instructorapi;
import static io.restassured.RestAssured.given;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.restassured.response.ValidatableResponse;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InstructorApiApplicationTest{
	@Test
	public void contextLoads() {
	}

	//Add a instructor - POST http://localhost:9000/instructors
	@Test
	public void postTopicsShouldResultInStatusok() throws JSONException {
		//Post first instructor Spring
		JSONObject instructor = new JSONObject()
				.put("id", "kanagal")
				.put("firstName", "Kaushik")
				.put("lastName", "Kanagal")
				.put("email", "kk@javabrains.com");		
		given()
			.body(instructor.toString())
			.contentType("application/json")
		.when()
			.post("http://localhost:9080/instructors")
		.then()
			.statusCode(200)
			.log().all();
		
		//Post second instructor Spring
		instructor = new JSONObject()
				.put("id", "khan")
				.put("firstName", "Salman")
				.put("lastName", "Khan")
				.put("email", "salman@khanacademy.org");		
		given()
			.body(instructor.toString())
			.contentType("application/json")
		.when()
			.post("http://localhost:9080/instructors")
		.then()
			.statusCode(200)
			.log().all();		
	}
}
