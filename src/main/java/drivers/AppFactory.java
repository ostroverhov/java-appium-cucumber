package drivers;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import utils.ConfigReader;
import utils.Logger;

import java.io.IOException;
import java.net.URL;

public class AppFactory {

    private final AppiumDriver driver;

    public AppFactory() {
        driver = createSession();
    }

    public AppiumDriver createSession() {
        var platformName = ConfigReader.getParameter("platformName");
        Logger.getInstance().info("Create session on [%s]", platformName);
        return switch (platformName) {
            case "android" -> new AndroidDriver<AndroidElement>(getRemoteUrl(), DriverSettings.getCapabilities());
            case "ios" -> new IOSDriver<IOSElement>(getRemoteUrl(), DriverSettings.getCapabilities());
            default -> throw getWrongPlatformNameException(platformName);
        };
    }

    public AppiumDriver getDriver() {
        return driver;
    }

    public static void quit(AppiumDriver driver) {
        Logger.getInstance().info("Quit driver");
        driver.quit();
    }

    private URL getRemoteUrl() {
        URL remoteConnectionUrl = null;
        try {
            remoteConnectionUrl = new URL(ConfigReader.getParameter("remoteConnectionUrl"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return remoteConnectionUrl;
    }

    private IllegalArgumentException getWrongPlatformNameException(String actualPlatform) {
        String message = String.format("Wrong platform name %s", actualPlatform);
        IllegalArgumentException exception = new IllegalArgumentException(message);
        Logger.getInstance().fatal(message, exception);
        return exception;
    }
}
