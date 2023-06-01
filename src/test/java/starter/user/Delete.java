package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Delete {
    protected String url = "https://reqres.in/api/";

    @Step("I Set DELETE API Endpoints")
    public String SetDeleteApiEndpoints(){
        return url + "products/1";
    }
    @Step("I Send DELETE HTTP Request")
    public void SendDeleteHTTPRequest(){
        SerenityRest.given().delete(SetDeleteApiEndpoints());

    }
    @Step("I Receive Valid HTTP Response Code 204")
    public void ReceiveHTTPResponse204(){
        restAssuredThat(response -> response.statusCode(204));

    }

}
