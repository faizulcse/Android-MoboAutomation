package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class DriverSetUp {
    public WebDriver driver;
    public Properties prop = null;

    public void startDriver() {
        try {
            prop = new Properties();
            prop.load(new FileInputStream(AppConstant.ANDROID_DEVICE_SETTING));
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("deviceName", prop.getProperty("deviceName"));
            cap.setCapability("platformName", prop.getProperty("platformName"));
            cap.setCapability("platformVersion", prop.getProperty("platformVersion"));
            cap.setCapability("app", prop.getProperty("app"));
            cap.setCapability("appPackage", prop.getProperty("appPackage"));
            cap.setCapability("appActivity", prop.getProperty("appActivity"));
            cap.setCapability("fullReset", prop.getProperty("fullReset"));
            cap.setCapability("noReset", prop.getProperty("noReset"));
            driver = new RemoteWebDriver(new URL(prop.getProperty("serverURL")), cap);
            setDriver(driver);
        }
        catch (IOException e) {
            System.out.println("[ERROR] Please check that appium server is running OR device is connected");
            System.out.println("[ERROR] Please check that \"Config >> android.conf\" info is correct");
            System.exit(0);
        }
    }

    public void stopDriver(){
        if(driver!=null){
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}
