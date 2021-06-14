package screens;

import elements.Button;
import elements.Label;
import elements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectCityScreen extends BaseScreen {

    public SelectCityScreen(WebDriver driver) {
        super("Select city screen", By.id("action_bar_root"), driver);
    }

    private Button okAlertButton = new Button("Ok on alert", By.id("android:id/button1"), driver);
    private Label firstAvailableCity = new Label("First available city", By.id("tvCityItemName"), driver);
    private TextBox searchCityTextBox = new TextBox("Search city", By.id("etSearchTest"), driver);

    public void clickOkAlertButton() {
        okAlertButton.click();
    }

    public void typeCityName(String city) {
        searchCityTextBox.clearAndType(city);
    }

    public void selectFirstAvailableCity() {
        firstAvailableCity.click();
    }
}
