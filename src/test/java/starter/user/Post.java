package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;


public class Post {
    protected String url = "https://jsonplaceholder.typicode.com/";

    @Step("I Set POST Api Endpoints")
    public String SetPOSTApiEndpoint(){
        return url + "posts"; }

    @Step("I Send POST HTTP Request")
    public void SendPOSTHTTPRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "body");

        SerenityRest.given().header("Content-Type","application/json").body(requestBody.toJSONString()).post(SetPOSTApiEndpoint());
    }

    @Step("I Receive Valid HTTP Response Code 201")
    public void ReceiveHTTPResponseCode201(){

        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("I Receive New User Valid Data")
    public void ValidNewUserData(){
        restAssuredThat(response -> response.body("'title'", equalTo("body")));
    }



}
