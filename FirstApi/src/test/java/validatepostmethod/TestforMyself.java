package validatepostmethod;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.*;
public class TestforMyself {
@Test(enabled=true)

public void test11() {
	Response r=given().
			when().
			get("http://localhost:3000/posts");
	System.out.println(r.asString());
	System.out.println(r.getStatusCode());
	Assert.assertEquals(r.getStatusCode(),201);
			
}
@Test(enabled=false)
public void test3() {
	Response re=given().
			body("{\"id\":5,\"title\":\"gvjs\",\"author\":\"vjsnck\"}").
			when().contentType(ContentType.JSON).
			post("http://localhost:3000/posts");
	System.out.println(re.asString());
}
@Test(enabled=false)
public void adsf() {
	Response d=given().
			body("{\"id\":8,\"title\":\"nkjk\",\"author\":\"hbjnk\"}").
			when().contentType(ContentType.JSON).
			post("http://localhost:3000/posts");
	System.out.println(d.asString());
}

}
