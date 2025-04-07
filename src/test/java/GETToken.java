import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.assertj.core.api.Assert;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.*;

public class GETToken {

    @Test
    public void getToken(){
        RequestSpecification  requestSpecification= RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/auth");
        requestSpecification.contentType(ContentType.JSON);
        String payload="{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";
        requestSpecification.body(payload);

        Response response= requestSpecification.post();

        ValidatableResponse vr=response.then().log().all();
        vr.statusCode(200);
        String token=vr.extract().body().jsonPath().get("token");
        System.out.println(token);

        String tokenid=response.jsonPath().getString("token");
        assertThat(tokenid).isNotBlank().isNotEmpty();
        System.out.println(tokenid);
    }
}
