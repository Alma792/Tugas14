package starter.user;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class Put {

    protected String url = "https://jsonplaceholder.typicode.com/";

    @Step("I Set PUT API Endpoints")
    public String SetPUTApiEndpoints(){
        return url + "posts/1";
    }
    @Step("I Send PUT HTTP Request")
    public void SendPUTHTTPRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title","body");

        SerenityRest.given().header("Content-Type","application/json").body(requestBody.toJSONString()).put(SetPUTApiEndpoints());
    }
    @Step("I Receive HTTP Response Code Valid 200")
    public void ReceiveHTTPValid200(){
        restAssuredThat(response -> response.body("'title'", equalTo("body")));
    }
}
