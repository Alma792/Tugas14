package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;


public class Get {

    protected static String url = "https://jsonplaceholder.typicode.com/";
    @Step("I Set GET Endpoints")
    public String SetGetEndpoints(){
        return url + "posts";
    }

    @Step("I Send GET HTTP Request")
    public void SendHTTPRequest(){
        SerenityRest.given()
                .when()
                .get(SetGetEndpoints());
    }

    @Step("I Receive Valid HTTP Response 200")
    public void HTTPResponse200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I Receive User Valid Data")
    public void ReceiveValidData(){
        restAssuredThat(response ->response.statusCode(200));
    }


}
