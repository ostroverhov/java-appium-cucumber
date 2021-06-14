package stepdefenitions;

import drivers.AppFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import screens.SelectCityScreen;

public class SelectCityScreenSteps {

    private final SelectCityScreen selectCityScreen;
    private final AppFactory appFactory;

    public SelectCityScreenSteps(AppFactory appFactory) {
        this.appFactory = appFactory;
        this.selectCityScreen = new SelectCityScreen(this.appFactory.getDriver());
    }

    @Then("select city screen is opened")
    public void selectCityScreenIsOpened() {
        Assert.assertTrue(selectCityScreen.isPresentScreen(), "Select city screen should be opened");
    }

    @When("click ok on alert from Select City screen")
    public void clickOkOnAlert() {
        selectCityScreen.clickOkAlertButton();
    }

    @When("type city name {}")
    public void typeNameCity(String nameCity) {
        selectCityScreen.typeCityName(nameCity);
    }

    @When("select first available city")
    public void selectFirstAvailableCity() {
        selectCityScreen.selectFirstAvailableCity();
    }
}
