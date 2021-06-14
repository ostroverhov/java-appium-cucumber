package screens;

import elements.Button;
import elements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginScreen extends BaseScreen {

    public LoginScreen(WebDriver driver) {
        super("Login screen", By.id("com.zdv.secretcloset:id/toolbar"), driver);
    }

    private Button registerButton = new Button("Register", By.id("com.zdv.secretcloset:id/statusTitle"), driver);
    private TextBox emailTextBox = new TextBox("Email", By.id("com.zdv.secretcloset:id/etEmail"), driver);
    private TextBox passwordTextBox = new TextBox("Password", By.id("com.zdv.secretcloset:id/etSignInPassword"), driver);
    private Button okButton = new Button("Ok", By.id("com.zdv.secretcloset:id/rlButtonLoginOk"), driver);
    private Button signInButton = new Button("Sign in", By.id("com.zdv.secretcloset:id/rlSignInButton"), driver);

    public void clickRegisterButton() {
        registerButton.click();
    }

    public boolean isEmailTextBoxDisplayed() {
        return emailTextBox.waitForVisible();
    }

    public LoginScreen typeEmail(String email) {
        emailTextBox.clearAndType(email);
        return this;
    }

    public LoginScreen typePassword(String password) {
        passwordTextBox.waitForVisible();
        passwordTextBox.clearAndType(password);
        return this;
    }

    public LoginScreen clickOkButton() {
        okButton.click();
        return this;
    }

    public LoginScreen clickSignUpButton() {
        signInButton.click();
        return this;
    }
}
