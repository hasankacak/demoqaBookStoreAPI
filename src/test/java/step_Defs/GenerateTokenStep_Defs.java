package step_Defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.GenerateToken;
import services.Register;

public class GenerateTokenStep_Defs {
GenerateToken generateToken=new GenerateToken();

    @Given("input valid credentials")
    public void input_valid_credentials() {
        generateToken.generateToken();
    }
    @Then("verify tokenStatusCode")
    public void verify_token_status_code() {
        generateToken.verifyGenerateStatusCode();
    }
}
