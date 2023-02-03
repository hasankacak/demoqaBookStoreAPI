package step_Defs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import services.GetUserByID;

public class GetUserByIDStep_Defs {

    GetUserByID getUserByID=new GetUserByID();
    @Given("User should see the book list")
    public void user_should_see_the_book_list() {
        getUserByID.getUserByID();
    }
    @Then("User should verify the BookStatusCode")
    public void user_should_verify_the_book_status_code() {
        getUserByID.verifyUser();
    }

}
