import io.restassured.RestAssured;

public class RestAssuredTest {
    public static void main(String[] args) {
        RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking").log().all()
                .when().get().then().log().all().statusCode(200);
    }
}

