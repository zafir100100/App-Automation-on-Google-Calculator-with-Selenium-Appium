import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Setup {
    public static final String PACKAGE_ID = "com.google.android.calculator";
    AndroidDriver driver;

    @BeforeTest
    public AndroidDriver setup() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("unicodeKeyboard", "false");
        caps.setCapability("resetKeyboard", "false");
        caps.setCapability("platformName", "android");
        caps.setCapability("autoLaunch", "false");
        caps.setCapability("fullReset", "false");
        caps.setCapability("newCommandTimeout", 6000);
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("platformVersion", "10");
        caps.setCapability("deviceName", "Redmi K20 Pro");
        caps.setCapability("appPackage", "com.google.android.calculator");
        caps.setCapability("appActivity", "com.android.calculator2.Calculator");
        caps.setCapability("app", "D:\\files\\assignment\\final\\App-Automation-on-Google-Calculator-with-Selenium-Appium\\src\\test\\resources\\Calculator.apk");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url, caps);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }

    @AfterTest
    public void quitDriver() {
        driver.quit();
    }
}