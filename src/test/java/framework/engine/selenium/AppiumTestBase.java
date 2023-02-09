package framework.engine.selenium;

import aut.testcreation.tasks.bineo.Login;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

import static framework.engine.utils.Constants.*;

public class AppiumTestBase {

    static AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("appium:deviceName", DEVICE_NAME);
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appium:automationName", "UiAutomator2");
        desiredCapabilities.setCapability("appium:platformVersion", PLATFORM_VERSION);
        desiredCapabilities.setCapability("appium:udid", UDID);
        desiredCapabilities.setCapability("appium:newCommandTimeout", 20);
        desiredCapabilities.setCapability("appium:noReset", true);
        desiredCapabilities.setCapability("appium:appPackage", APP_PACKAGE);
        desiredCapabilities.setCapability("appium:appActivity", APP_ACTIVITY);
        desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
        desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
        desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

        URL remoteUrl = new URL(SERVER_URL);

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
        //probarAppium = new Login(driver);
        //SeleniumWrapper seleniumWrapper = new SeleniumWrapper(driver, "bandera");
        new AppiumWrapper(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
