package stepdefenitions;

import drivers.AppFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.TestData;
import models.TestUser;
import org.testng.Assert;
import screens.LoginScreen;
import utils.ConfigReader;

public class LoginScreenSteps {

    private final LoginScreen loginScreen;
    private final AppFactory appFactory;
    private final TestUser testUser;

    public LoginScreenSteps(AppFactory appFactory) {
        this.appFactory = appFactory;
        this.loginScreen = new LoginScreen(this.appFactory.getDriver());
        this.testUser = ConfigReader.getObjectFromJson(TestData.class).getTestUser();
    }

    @Then("login screen is opened")
    public void loginScreenIsOpened() {
        Assert.assertTrue(loginScreen.isPresentScreen(), "Login screen should be opened");
    }

    @When("click register button")
    public void clickRegisterButton() {
        loginScreen.clickRegisterButton();
    }

    @Then("email text box is displayed")
    public void EmailTextBoxIsDisplayed() {
        Assert.assertTrue(loginScreen.isEmailTextBoxDisplayed(), "Email text box should be presented");
    }

    @When("type valid email and password")
    public void typeEmailAndPassword() {
        loginScreen.typeEmail(testUser.getEmail())
                .clickOkButton()
                .typePassword(testUser.getPassword());
    }

    @When("click sign in button")
    public void clickSignInButton() {
        loginScreen.clickSignUpButton();
    }
}
