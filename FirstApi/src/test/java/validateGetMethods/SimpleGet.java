package validateGetMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class SimpleGet {
	
	@Test(enabled = false)
	public void simpleGet() {
		
	Response resp = when().
		get("http://api.openweathermap.org/data/2.5/weather?q=Astoria&appid=570c32f92d5a282f1b145c1ad333d20d");
		System.out.print(resp.asString());
	}
	
	@Test(enabled = false)
	public void simpleGet1() {
		
	Response resp = given().
			param("q", "Astoria").
			param("appid", "570c32f92d5a282f1b145c1ad333d20d").
			when().
		get("http://api.openweathermap.org/data/2.5/weather");
		System.out.print(resp.asString());
	}
	
	@Test(enabled = true)
	public void simpleGet2() {
		
	Response resp = given().
			param("q", "Astoria").
			param("appid", "570c32f92d5a282f1b145c1ad333d20d").
			when().
			get("http://api.openweathermap.org/data/2.5/weather");
			//int s = resp.getStatusCode();
			//Assert.assertEquals(s, 200);
		//System.out.print(resp.asString());
	}
	
	@Test(enabled = false)
	public void simpleGet3() {
		
	String resp = given().
					param("q", "Astoria").
					param("appid", "570c32f92d5a282f1b145c1ad333d20d").
				when().
					contentType(ContentType.JSON).
					get("http://api.openweathermap.org/data/2.5/weather").
				then().
					extract().
					path("weather[0].description");
	System.out.println(resp);

			
			
			

	}

}
