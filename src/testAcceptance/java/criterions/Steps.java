package criterions;

import applicationdriver.Initializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class Steps {

    @Given("^ユーザー「Mom」は未登録$")
    public void ユーザー_Mom_は未登録() {
        Initializer initializer = new Initializer();
        initializer.initWithUserUnRegistered("Mom");
    }

    @When("^ユーザー「Mom」を登録$")
    public void ユーザー_Mom_を登録() {
    }

    @Then("^ユーザー「Mom」の情報を閲覧できる$")
    public void ユーザー_Mom_の情報を閲覧できる() {
    }
}
