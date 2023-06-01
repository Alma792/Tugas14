package starter.StepDefenition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Get;
import starter.user.Post;
import starter.user.Put;
import starter.user.Delete;
import starter.user.Get2;

public class UserStep {

    @Steps
    Get get;
    @Steps
    Post post;
    @Steps
    Put put;
    @Steps
    Delete delete;
    @Steps
    Get2 get2;


    @Given("I Set GET Endpoints")
    public void SetGetEndpoints(){
        get.SetGetEndpoints();
    }
    @When("I Send GET HTTP Request")
    public void SendHTTPRequest(){
        get.SendHTTPRequest();
    }
    @Then("I Receive Valid HTTP Response 200")
    public void HTTPResponse200(){
        get.HTTPResponse200();
    }
    @And("I Receive User Valid Data")
    public void ReceiveValidData(){
        get.ReceiveValidData();
    }



    @Given("I Set POST Api Endpoints")
    public void SetPOSTApiEndpoint(){
        post.SetPOSTApiEndpoint();
    }
    @When("I Send POST HTTP Request")
    public void SendPOSTHTTPRequest(){
        post.SendPOSTHTTPRequest();
    }
    @Then("I Receive Valid HTTP Response Code 201")
    public void ReceiveHTTPResponseCode201(){
        post.ReceiveHTTPResponseCode201();
    }
    @And("I Receive New User Valid Data")
    public void ValidNewUserData(){
        post.ValidNewUserData();
    }


    @Given("I Set PUT API Endpoints")
    public void SetPUTApiEndpoints(){
        put.SetPUTApiEndpoints();
    }
    @When("I Send PUT HTTP Request")
    public void SendPUTHTTPRequest(){
        put.SendPUTHTTPRequest();
    }
    @And("I Receive HTTP Response Code Valid 200")
    public void ReceiveHTTPValid200(){
        put.ReceiveHTTPValid200();
    }


    @Given("I Set DELETE API Endpoints")
    public void SetDeleteApiEndpoints(){
        delete.SetDeleteApiEndpoints();
    }
    @When("I Send DELETE HTTP Request")
    public void SendDeleteHTTPRequest(){
        delete.SendDeleteHTTPRequest();
    }
    @Then("I Receive Valid HTTP Response Code 204")
    public void ReceiveHTTPResponse204(){
        delete.ReceiveHTTPResponse204();
    }


    @Given("I set GET Endpoints")
    public void setGetEndpoints(){
        get2.setGetEndpoints();
    }
    @When("I send GET HTTP Request")
    public void sendHTTPRequest(){
        get2.sendHTTPRequest();
    }
    @Then("I receive Valid HTTP Response 200")
    public void HTTPresponse200(){
        get2.HTTPresponse200();
    }
    @And("I receive Specific Existing User Valid Data")
    public void receiveValidData(){
        get2.receiveValidData();
    }

}
