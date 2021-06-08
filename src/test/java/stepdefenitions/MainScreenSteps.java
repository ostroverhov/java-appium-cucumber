package stepdefenitions;

import drivers.AppFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import screens.MainScreen;

public class MainScreenSteps {

    private final MainScreen mainScreen;
    private final AppFactory appFactory;

    public MainScreenSteps(AppFactory appFactory) {
        this.appFactory = appFactory;
        this.mainScreen = new MainScreen(this.appFactory.getDriver());
    }

    @Given("main screen is opened")
    public void mainScreenIsOpened() {
        Assert.assertTrue(mainScreen.isPresentScreen(), "Main screen should be opened");
    }

    @When("click city label")
    public void clickCityLabel() {
        mainScreen.clickSelectCity();
    }

    @Then("check name city {}")
    public void checkCityName(String cityName) {
        mainScreen.getNameSelectedCity(cityName);
    }
}
