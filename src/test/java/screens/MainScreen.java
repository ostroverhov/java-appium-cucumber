package screens;

import elements.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainScreen extends BaseScreen {

    public MainScreen(WebDriver driver) {
        super("Main screen", By.id("com.zdv.secretcloset:id/rlTop"), driver);
    }

    private Button selectCityButton = new Button("Select city", By.id("tvToolbarCity"), driver);
    private Button sandwichMenuButton = new Button("Sandwich menu button", By.id("com.zdv.secretcloset:id/rlMenuButton"), driver);

    public void clickSelectCity() {
        selectCityButton.click();
    }

    public boolean getNameSelectedCity(String cityName) {
        return selectCityButton.waitForText(cityName);
    }

    public void clickSandwichMenuButton() {
        sandwichMenuButton.click();
    }
}
