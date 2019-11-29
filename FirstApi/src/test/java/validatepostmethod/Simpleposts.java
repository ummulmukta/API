package validatepostmethod;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.*;
public class Simpleposts {
@Test(enabled=false)
public void test1() {
	Response res =given().
			body("{\"id\":5,\"title\":\"Bharot2\",\"author\":\"Muktaa\"}").
			when().
			contentType(ContentType.JSON).
			post("http://localhost:3000/posts");
	System.out.print(res.asString());
			
}
@Test(enabled=true)
public void test5() {
	Books b=new Books();
	b.setId(6);
	b.setTitle("Love story");
	b.setAuthor("Jhon");
	
	Response res =given().
			body(b).
			when().
			contentType(ContentType.JSON).
			post("http://localhost:3000/posts");
	System.out.print(res.asString());
	
	
}


@Test(enabled=false)
public void test2() {
	Response res =given().
			body("{\"author\":\"Ummul\"}").
			when().
			contentType(ContentType.JSON).
			patch("http://localhost:3000/posts/5");
	System.out.print(res.asString());
}
@Test(enabled=true)
public void test3() {
	Response res =given().
			body("{\"id\":5,\"title\":\"Brot2\",\"author\":\"Muka\"}").
			when().
			contentType(ContentType.JSON).
			put("http://localhost:3000/posts/5");
	System.out.print(res.asString());
}

@Test(enabled=false)
public void test6() {
	Response res =given().
			body("{\"id\":5,\"title\":\"Brot2\",\"author\":\"Muka\"}").
			when().
			contentType(ContentType.JSON).
			put("http://localhost:3000/posts/5");
	System.out.print(res.asString());
}
@Test(enabled=true)
public void test4() {
	Response res =given().
			//body("{\"id\":5,\"title\":\"Brot2\",\"author\":\"Muka\"}").
			when().
			//contentType(ContentType.JSON).
			delete("http://localhost:3000/posts/5");
	System.out.print(res.asString());
}
}
