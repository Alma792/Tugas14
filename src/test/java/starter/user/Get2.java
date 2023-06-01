package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;


public class Get2 {

    protected static String url = "https://jsonplaceholder.typicode.com/";
    @Step("I set GET Endpoints")
    public String setGetEndpoints(){
        return url + "posts/1";
    }

    @Step("I set GET Endpoints")
    public void sendHTTPRequest(){
        SerenityRest.given()
                .when()
                .get(setGetEndpoints());
    }

    @Step("I receive Valid HTTP Response 200")
    public void HTTPresponse200(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive Specific Existing User Valid Data")
    public void receiveValidData(){
        restAssuredThat(response ->response.statusCode(200));
    }


}
