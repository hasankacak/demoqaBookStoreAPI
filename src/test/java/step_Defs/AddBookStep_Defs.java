package step_Defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.AddBooks;

public class AddBookStep_Defs {

    AddBooks addBooks=new AddBooks();

    @Given("User should add new book")
    public void user_should_add_new_book() {
        addBooks.addBooks();
    }
    @Then("User should verify the addBookStatusCode")
    public void user_should_verify_the_add_book_status_code() {
        addBooks.verifyAddBooks();
    }
}
