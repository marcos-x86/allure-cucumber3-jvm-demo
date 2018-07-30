package allure.cucumber3.jvm.demo.stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Ir is in charged to define the example test step definitions methods.
 */
public class MyStepDefinitions {

    private static final String MSG_ENTER_LOGIN_PAGE = "I enter to Google Services Login page";
    private static final String MSG_FILL_USERNAME = "I fill the username field with \"%s\"";
    private static final String MSG_FILL_PASSWORD = "I fill the password field with \"%s\"";
    private static final String MSG_CLICK_LOGIN = "I click on login button";
    private static final String MSG_VERIFY_LOGIN = "I am in the login page";

    /**
     * Prints the enter to login page action.
     */
    @Given("^I enter to Google Services Login page$")
    public void iEnterToGoogleServicesLoginPage() {
        System.out.println(MSG_ENTER_LOGIN_PAGE);
    }

    /**
     * Prints the entering username message.
     */
    @When("^I fill the username field with \"([^\"]*)\"$")
    public void iFillTheUsernameFieldWith(final String username) {
        System.out.println(String.format(MSG_FILL_USERNAME, username));
    }

    /**
     * Prints the entering password message.
     */
    @When("^I fill the password field with \"([^\"]*)\"$")
    public void iFillThePasswordFieldWith(final String password) {
        System.out.println(String.format(MSG_FILL_PASSWORD, password));
    }

    /**
     * Prints the click login page button action message.
     */
    @When("^I click on login button$")
    public void iClickOnLoginButton() {
        System.out.println(MSG_CLICK_LOGIN);
    }

    /**
     * Prints the enter assertion message for login action.
     */
    @Then("^I am in the login page$")
    public void iAmInTheLoginPage() {
        System.out.println(MSG_VERIFY_LOGIN);
    }
}
