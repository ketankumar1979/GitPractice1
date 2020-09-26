package GitPractice1.StepDefinitions;

import GitPractice1.PageObject.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Homepage_ProductSearchSteps {

    HomePage homePage = new HomePage();

    @Given("^user is on the home page to search for the product$")
    public void user_is_on_the_home_page_to_search_for_the_product() throws Throwable {
        homePage.getHomePageUrl();
    }

    @When("^user type 'nike' to search for product$")
    public void user_type_nike_to_search_for_product() throws Throwable {
        homePage.dosearch("nike");
    }

    @Then("^user should able to see all the nike products$")
    public void user_should_able_to_see_all_the_nike_products() throws Throwable {
        homePage.getResultPageURL();
    }
}
