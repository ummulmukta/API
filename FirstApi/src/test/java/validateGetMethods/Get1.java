package validateGetMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.*;
public class Get1 {
@Test(enabled=false)
public void test01() {
	Response res=when().
	get("http://localhost:3000/posts");
	System.out.print(res.asString());
			
}
@Test(enabled=true)
public void test02() {
	//Response re=given().
String re=given().
	//float re=given().
	param("zip","11373").
	param("appid","570c32f92d5a282f1b145c1ad333d20d").
	when().
	//contentType(ContentType.JSON).
	//contentType(ContentType.JSON);
	
	get("http://api.openweathermap.org/data/2.5/weather").
	then().
	extract().
	path("sys.country");
//int i=re.getStatusCode();
Assert.assertEquals(re,"US");
	//System.out.println(re);
}
@Test(enabled=false)
public void test3() {
	Response ree=given().
			param("q","Elmhurst").
			param("appid","570c32f92d5a282f1b145c1ad333d20d").
			when().
			contentType(ContentType.JSON).
			get("http://api.openweathermap.org/data/2.5/forecast/hourly");
			//then().
			//extract().
			//path("")
			System.out.println(ree.asString());
}

}
