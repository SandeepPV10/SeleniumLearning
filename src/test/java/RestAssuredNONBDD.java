import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class RestAssuredNONBDD {
    public static void main(String[] args) {
        RequestSpecification request= RestAssured.given();
        request.baseUri("https://restful-booker.herokuapp.com");
        request.basePath("/booking");


        Response response=request.log().all().get();


        ValidatableResponse vr=response.then().log().all();
        vr.statusCode(200);
    }
}
