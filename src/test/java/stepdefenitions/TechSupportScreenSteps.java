package stepdefenitions;

import drivers.AppFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import screens.TechSupportScreen;

public class TechSupportScreenSteps {

    private final TechSupportScreen techSupportScreen;
    private final AppFactory appFactory;

    public TechSupportScreenSteps(AppFactory appFactory) {
        this.appFactory = appFactory;
        this.techSupportScreen = new TechSupportScreen(this.appFactory.getDriver());
    }

    @Then("tech support screen is opened")
    public void techSupportScreenIsOpened() {
        Assert.assertTrue(techSupportScreen.isPresentScreen(), "Tech support screen should be opened");
    }

    @When("click send button from support screen")
    public void clickSupportButton() {
        techSupportScreen.clickSendButton();
    }

    @When("type message for support {}")
    public void typeMessageForSupport(String message) {
        techSupportScreen.typeMessage(message);
    }

    @When("click send support message")
    public void clickSendSupportMessage() {
        techSupportScreen.clickSendMessageButton();
    }

    @Then("check support message contains text {}")
    public void checkSupportMessage(String message) {
        Assert.assertTrue(techSupportScreen.isSupportMessagePresent(message), "Message should be presented");
    }
}