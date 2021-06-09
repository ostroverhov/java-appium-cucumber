package stepdefenitions;

import drivers.AppFactory;
import io.cucumber.java.en.Then;
import models.TestData;
import models.TestUser;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import screens.SettingsScreen;
import utils.ConfigReader;

public class SettingsScreenSteps {

    private final SettingsScreen settingsScreen;
    private final AppFactory appFactory;
    private final TestUser testUser;

    public SettingsScreenSteps(AppFactory appFactory) {
        this.appFactory = appFactory;
        this.settingsScreen = new SettingsScreen(this.appFactory.getDriver());
        this.testUser = ConfigReader.getObjectFromJson(TestData.class).getTestUser();
    }

    @Then("settings screen should be opened")
    public void settingsScreenIsOpened() {
        Assert.assertTrue(settingsScreen.isPresentScreen(), "Settings screen should be opened");
    }

    @Then("check user data from settings screen")
    public void checkUserData() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(settingsScreen.getName(), testUser.getName(), "Name should be equals");
        softAssert.assertEquals(settingsScreen.getEmail(), testUser.getEmail(), "Email should be equals");
        softAssert.assertAll();
    }
}
