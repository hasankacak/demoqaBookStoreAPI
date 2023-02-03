package step_Defs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import services.AllBooks;

public class GetAllBooksStep_Defs {

    AllBooks allBooks=new AllBooks();

    @Given("User should see book list")
    public void user_should_see_book_list() {
        allBooks.bookList();
    }
    @Then("User verify the booksStatusCode")
    public void user_verify_the_books_status_code() {
        allBooks.verifyBookList();
    }

}
