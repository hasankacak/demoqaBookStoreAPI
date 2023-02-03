package step_Defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.DeleteBooks;

public class DeleteBooksStep_Defs {

    DeleteBooks deleteBooks=new DeleteBooks();
    @Given("User should delete a book")
    public void user_should_delete_a_book() {
        deleteBooks.deleteBook();
    }
    @Then("User should verify deleteStatusCode")
    public void user_should_verify_delete_status_code() {
        deleteBooks.verifyDeleteBook();
    }

}
