package drivers;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import utils.ConfigReader;

public class DriverSettings {

    public static DesiredCapabilities getCapabilities() {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, ConfigReader.getParameter("platformName"));
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, ConfigReader.getParameter("deviceName"));
        desiredCapabilities.setCapability(MobileCapabilityType.APP, ConfigReader.getParameter("applicationPath"));
        return desiredCapabilities;
    }
}
