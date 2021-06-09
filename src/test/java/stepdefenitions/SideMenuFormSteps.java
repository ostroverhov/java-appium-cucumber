package stepdefenitions;

import drivers.AppFactory;
import enums.SideMenuItem;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import screens.SideMenuForm;

public class SideMenuFormSteps {

    private final SideMenuForm sideMenuForm;
    private final AppFactory appFactory;

    public SideMenuFormSteps(AppFactory appFactory) {
        this.appFactory = appFactory;
        this.sideMenuForm = new SideMenuForm(this.appFactory.getDriver());
    }

    @Then("side menu is opened")
    public void sideMenuIsOpened() {
        Assert.assertTrue(sideMenuForm.isPresentScreen(), "Side menu should be opened");
    }

    @When("click side menu item {}")
    public void clickSideMenuItem(SideMenuItem sideMenuItem) {
        sideMenuForm.clickMenuItem(sideMenuItem);
    }

    @Then("check status user should be {}")
    public void checkStatusUser(String status) {
        Assert.assertTrue(sideMenuForm.IsUserStatusPresent(status), String.format("Status should be [%s]", status));
    }


}
